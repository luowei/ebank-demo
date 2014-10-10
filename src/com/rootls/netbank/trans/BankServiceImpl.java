package com.rootls.netbank.trans;

import com.rootls.common.convert.MyConvert;
import com.rootls.common.Config;
import com.rootls.common.convert.CertStore;
import com.rootls.common.convert.CertStoreFactory;
import com.rootls.common.convert.ConvertBase64;
import com.rootls.common.xml.JaxbUtil;
import com.rootls.common.xml.Message;
import com.rootls.netbank.trade.FillResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import static com.rootls.common.Config.encoding;
import static com.rootls.common.xml.Message.Field;

/**
 * Created by luowei on 2014/9/24.
 */
@Service
public class BankServiceImpl implements BankService {

    @Autowired
    MyConvert myConvert;

    /**
     * 处理我们的推送
     *
     * @param sendData
     * @return
     * @throws UnsupportedEncodingException
     */
    @Override
    public byte[] handleMyPush(byte[] sendData) throws UnsupportedEncodingException {
        HttpClient client = HttpClients.createDefault();
        HttpPost method = new HttpPost(Config.URL_CHANNEL);
        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectionRequestTimeout(Config.timeout * 1000).build();
        method.setConfig(requestConfig);
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();

        CertStore cs_bank = CertStoreFactory.getCertStore("key/bank");
        CertStore cs_mine = CertStoreFactory.getCertStore("key/mine");

        //报文签名
        byte[] signdata = myConvert.sign(sendData, cs_mine);
        nvps.add(new BasicNameValuePair("signature", ConvertBase64.encode(signdata)));

        //报文加密及Base64编码
        byte[] enc_data = myConvert.encrypt(sendData, cs_bank);
        String req_data = ConvertBase64.encode(enc_data);
        nvps.add(new BasicNameValuePair("xml", req_data));

        method.setEntity(new UrlEncodedFormEntity(nvps));
        byte[] resdDta = myConvert.getResponseData(client, method);


        byte[] dec_data = null;
        if (resdDta.length < 10) {
            throw new RuntimeException("返回报文格式错误");
        } else {
            int startIdx = 0;
            for (int i = 0; i < 10; i++) {
                if (resdDta[i] != 0) {
                    startIdx = i;
                    break;
                }
            }
            //获得签名长度
            byte[] tmp = new byte[10 - startIdx];
            System.arraycopy(resdDta, startIdx, tmp, 0, tmp.length);
            Integer signLen = new Integer(new String(tmp));

            //取出签名信息
            byte[] sign = new byte[signLen.intValue()];
            System.arraycopy(resdDta, 10, sign, 0, sign.length);

            //取出报文数据并解密
            byte[] data = new byte[resdDta.length - sign.length - 10];
            System.arraycopy(resdDta, 10 + sign.length, data, 0, data.length);
            dec_data = myConvert.decrypt(data, cs_bank);

            //验证签名是否正确
            boolean flag = myConvert.isValid(dec_data, sign, cs_bank);
            if (!flag)
                throw new RuntimeException("返回报文数字签名非法");
        }
        return dec_data;
    }

    /**
     * 处理银行的推送
     *
     * @param xml
     * @param signdata
     * @return
     * @throws UnsupportedEncodingException
     */
    @Override
    public byte[] handleBankPush(String xml, String signdata) throws UnsupportedEncodingException {
        CertStore cs_bank = CertStoreFactory.getCertStore("key/bank");
        CertStore cs_mine = CertStoreFactory.getCertStore("key/mine");

//        // 读取数字签名长度
//        byte[] tmp = new byte[10];
//        System.arraycopy(data, 0, tmp, 0, tmp.length);
//        int length = Integer.parseInt(new String(tmp));
//
//        // 读取数字签名
//        byte[] signdata = new byte[length];
//        System.arraycopy(data, tmp.length, signdata, 0, signdata.length);
//        // 读取加密报文
//        byte[] xmldata = new byte[data.length - tmp.length - signdata.length];
//        System.arraycopy(data, tmp.length + signdata.length, xmldata, 0, xmldata.length);

        byte[] data = ConvertBase64.decode(xml);


        // 解密返回报文
        byte[] dec_data = myConvert.decrypt(data, cs_mine);

        // 验证数字签名
        boolean flag = myConvert.isValid(dec_data, ConvertBase64.decode(signdata), cs_bank);
        if (!flag)
            throw new RuntimeException("返回报文数字签名非法");

        String bank_xml = new String(dec_data, encoding);
        byte[] sendData = handleBankPushXml(bank_xml);

        //报文加密
        byte[] enc_data = myConvert.encrypt(sendData, cs_bank);

        //报文签名
        byte[] sign = myConvert.sign(enc_data, cs_mine);

        //把签名的长度写入一个10位的字节数组里
        byte[] len_byte = new byte[10];
        byte[] signlen = String.valueOf(sign.length).getBytes();
        byte[] zeros = new byte[10 - signlen.length];
        for (int i = 0; i < 10 - signlen.length; i++) {
            zeros[i] = 0;
        }
        System.arraycopy(zeros, 0, len_byte, 0, 10 - signlen.length);
        System.arraycopy(signlen, 0, len_byte, zeros.length, signlen.length);

        //拼接响应报文字节数据
        byte[] resData = new byte[len_byte.length + sign.length + enc_data.length];
        System.arraycopy(len_byte, 0, resData, 0, len_byte.length);
        System.arraycopy(sign, 0, resData, len_byte.length, sign.length);
        System.arraycopy(enc_data, 0, resData, len_byte.length + len_byte.length, enc_data.length);

        return resData;
    }

    /**
     * 获取银行的公钥、密钥数据
     *
     * @param type
     * @param mch_no
     * @return
     */
    @Override
    public byte[] getBankKeyData(String type, String mch_no) {
        HttpClient client = HttpClients.createDefault();
        HttpPost method = new HttpPost(Config.getkeys_url);

        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectionRequestTimeout(30 * 1000).build();
        method.setConfig(requestConfig);
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();

        nvps.add(new BasicNameValuePair("type", type));
        try {
            method.setEntity(new UrlEncodedFormEntity(nvps));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        byte[] resdDta = myConvert.getResponseData(client, method);

        byte[] result = null;
        byte[] tmp = null;
        if (resdDta.length > 6) {
            tmp = new byte[6];
            System.arraycopy(resdDta, 0, tmp, 0, tmp.length);
            String return_code = new String(tmp);

            //判断返回码
            if ("000000".equals(return_code)) {
                tmp = new byte[resdDta.length - 6];
                System.arraycopy(resdDta, 6, tmp, 0, tmp.length);
                byte[] pub_key = myConvert.decrypt(tmp, mch_no);
                result = pub_key;
            } else {
                tmp = new byte[resdDta.length - 6];
                System.arraycopy(resdDta, 6, tmp, 0, tmp.length);
                result = tmp;
            }
        }
        return result;
    }

    /**
     * 处理银行的推送的xml
     *
     * @param xml
     * @return
     */
    @Override
    public byte[] handleBankPushXml(String xml) throws UnsupportedEncodingException {

        Message message = JaxbUtil.converyToJavaBean(xml, Message.class);

        String tradeNo = getHeadFieldFromMessage(message, "chanl_trad_no");

        if (tradeNo == null || tradeNo == "") {
            return JaxbUtil.convertToXml(genFaildMessage()).getBytes(Config.encoding);
        }

        Message respMsg = genFaildMessage();
        //出金申请
        if (tradeNo.trim().equals("3FC003") && handleChuJingAppliy(message)) {
            //操作数据库
            respMsg = FillResponse.chuJingAppliy();
        }


        return JaxbUtil.convertToXml(respMsg).getBytes();
    }

    /**
     * 处理出金申请
     *
     * @param message 银行传来的报文消息
     */
    private boolean handleChuJingAppliy(Message message) {

        return true;
    }

    public Message genFaildMessage() {
        return null;
    }

    public String getHeadFieldFromMessage(Message message, String headField) {
        for (Field field : message.getHead().getFields()) {
            if (field.getName().equals(headField)) {
                return field.getValue();
            }
        }
        return null;
    }

    public String getBodyFieldFromMessage(Message message, String bodyField) {
        for (Field field : message.getHead().getFields()) {
            if (field.getName().equals(bodyField)) {
                return field.getValue();
            }
        }
        return null;
    }
}
