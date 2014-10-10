package com.rootls.common.convert;

import com.rootls.common.Config;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.io.*;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by luowei on 2014/9/5.
 */
@Component
public class MyConvert {

    static Logger logger = Logger.getLogger(MyConvert.class);

    // 数字签名对象
    private Signature signa = null;

    // 数字签名算法
    private String sign_algorithm = "MD5WithRSA";

    // 加解密对象
    private Cipher cipher = null;

    // 加解密算法
    private String enc_dec_algorithm = "DESede";

    private static int timeout = 30;


    public MyConvert() {
        if (signa == null) {
            try {
                this.signa = Signature.getInstance(this.sign_algorithm);
            } catch (NoSuchAlgorithmException e) {
                logger.error(e.getMessage(),e);
            }
        }
        if (cipher == null) {
            try {
                this.cipher = Cipher.getInstance(this.enc_dec_algorithm);
            } catch (Exception e) {
                logger.error(e.getMessage(),e);
            }
        }
    }

    /**
     * 验证数字签名是否合法
     *
     * @param in
     * @param signdata
     * @param cs
     * @return
     */
    public boolean isValid(byte[] in, byte[] signdata, CertStore cs) {
        boolean flag = false;
        try {
            // 初始化签名对象
            signa.initVerify(cs.getPublicKey());
            // 传入被验证数据
            signa.update(in);
            // 利用签名数据确定是否可信
            flag = signa.verify(signdata);
        } catch (Exception e) {
            logger.error(e.getMessage(),e);
        }
        return flag;
    }

    /**
     * 数字签名
     *
     * @param in
     * @param cs
     * @return
     */
    public byte[] sign(byte[] in, CertStore cs) {
        byte[] signdata = null;
        try {
            // 初始化签名对象
            signa.initSign(cs.getPrivateKey());
            signa.update(in);
            // 执行签名方法，得到数据
            signdata = signa.sign();
        } catch (Exception e) {
            logger.error(e.getMessage(),e);
        }
        return signdata;
    }

    /**
     * 解密
     *
     * @param in
     * @param cs
     * @return
     */
    public byte[] decrypt(byte[] in, CertStore cs) {
        byte[] dec_data = null;
        try {
            // 解密
            this.cipher.init(Cipher.DECRYPT_MODE, cs.getSecretKey());
            dec_data = cipher.doFinal(in);
            if (dec_data == null || dec_data.length == 0) {
                throw new RuntimeException("data decrypt error");
            }
        } catch (Exception e) {
            logger.error(e.getMessage(),e);
//            e.printStackTrace();
        }

        return dec_data;
    }

    /**
     * 加密
     *
     * @param in
     * @param cs
     * @return
     */
    public byte[] encrypt(byte[] in, CertStore cs) {
        byte[] enc_data = null;
        // 开始加密
        try {
            this.cipher.init(Cipher.ENCRYPT_MODE, cs.getSecretKey());
            enc_data = this.cipher.doFinal(in);
            if (enc_data == null || enc_data.length == 0) {
                throw new RuntimeException("encrypt data error");
            }
        } catch (Exception e) {
            logger.error(e.getMessage(),e);
        }
        return enc_data;
    }

    public byte[] readFromFile(String filename) {
        FileInputStream input = null;
        byte[] response = null;
        try {
            input = new FileInputStream(new File(filename));
            response = new byte[input.available()];
            input.read(response);
            input.close();
        } catch (Exception e) {
            logger.error(e.getMessage(),e);
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
            } catch (Exception e) {
                logger.error(e.getMessage());
            }
        }
        if (response != null)
            System.out.println(new String(response));
        return response;
    }

    public static final InputStream byte2Input(byte[] buf) {
        return new ByteArrayInputStream(buf);
    }

    public static final byte[] input2byte(InputStream inStream) {
        ByteArrayOutputStream swapStream = new ByteArrayOutputStream();
        byte[] buff = new byte[100];
        int rc = 0;
        try {
            while ((rc = inStream.read(buff, 0, 100)) > 0) {
                swapStream.write(buff, 0, rc);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] in2b = swapStream.toByteArray();
        return in2b;
    }

    public static byte[] decrypt(byte[] key_in, String mch_no) {
        byte[] key_out = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        String key_str = mch_no + sdf.format(new Date());
        SecretKey key = null;
        try {
            key = makeDESKey(asc2bin(key_str));
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        if (key == null) {
            logger.error("key is null!!");
            return null;
        }

        Cipher cipher;
        byte[] result = null;
        try {
            cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.DECRYPT_MODE, key);
            result = cipher.doFinal(key_in);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }

//        key_out = ConvertBase64.encode(result);
        key_out = Base64.encodeBase64(result);

        return key_out;
    }

    public static byte[] encrypt(String key_in, String mch_no) {
        byte[] key_byte = null;

        byte[] result = new byte[0];
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
            String key_str = mch_no + sdf.format(new Date());
            SecretKey key = makeDESKey(asc2bin(key_str));


//            key_byte = new BASE64Decoder().decodeBuffer(key_in);
        key_byte = Base64.decodeBase64(key_in);

//        key_byte = Base64.encodeBase64(key_in);

            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.ENCRYPT_MODE, key);
            result = cipher.doFinal(key_byte);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public static byte[] encrypt(byte[] key_in, String mch_no) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        String key_str = mch_no + sdf.format(new Date());
        SecretKey key = null;
        try {
            key = makeDESKey(asc2bin(key_str));
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        if (key == null) {
            logger.error("the key is null");
            return null;
        }

//        byte[] key_byte = ConvertBase64.decode(new String(key_in));
        byte[] key_byte = Base64.decodeBase64(key_in);

        Cipher cipher;
        byte[] result = null;
        try {
            cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.ENCRYPT_MODE, key);
            result = cipher.doFinal(key_byte);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }

        return result;
    }

    /**
     * 生成DES密钥
     * @param keybyte
     * @return
     * @throws Exception
     */
    private static SecretKey makeDESKey(byte[] keybyte) throws Exception {
        DESKeySpec deskeyspec = new DESKeySpec(keybyte);
        SecretKeyFactory keyfactory = SecretKeyFactory.getInstance("DES");
        return keyfactory.generateSecret(deskeyspec);
    }

    /**
     * 将16进制字符串转换成16进制数字数组
     * @param hexString
     * @return
     */
    private static byte[] asc2bin(String hexString) {
        byte[] hexbyte = hexString.getBytes();
        byte[] bitmap = new byte[hexbyte.length / 2];
        for (int i = 0; i < bitmap.length; i++) {
            hexbyte[i * 2] -= hexbyte[i * 2] > '9' ? 7 : 0;
            hexbyte[i * 2 + 1] -= hexbyte[i * 2 + 1] > '9' ? 7 : 0;
            bitmap[i] = (byte) ((hexbyte[i * 2] << 4 & 0xf0) | (hexbyte[i * 2 + 1] & 0x0f));
        }
        return bitmap;
    }


    /**
     * 下载文件
     *
     * @param filename    下载文件名
     * @param merchant_no 商户编号
     * @return
     */
    public byte[] download(String filename, String merchant_no) {

        try {
            HttpClient client = HttpClients.createDefault();
            HttpPost method = new HttpPost(Config.URL_DOWNLOAD);
            RequestConfig requestConfig = RequestConfig.custom()
                    .setConnectionRequestTimeout(timeout * 1000).build();
            method.setConfig(requestConfig);
            List<NameValuePair> nvps = new ArrayList<NameValuePair>();

            //获取密钥
            CertStore cs = CertStoreFactory.getCertStore("merchant" + merchant_no);

            //文件名加密
            byte[] enc_filename = encrypt(filename.getBytes(), cs);
            nvps.add(new BasicNameValuePair("filename", ConvertBase64.encode(enc_filename)));
            //文件名签名
            byte[]  signdata = sign(filename.getBytes(), cs);
            nvps.add(new BasicNameValuePair("password", ConvertBase64.encode(signdata)));

            method.setEntity(new UrlEncodedFormEntity(nvps));

            byte[] data = getResponseData(client, method);


            // 不存在数字签名
            if (data.length < 138) {
                byte[] dec_data = decrypt(data, cs);
                logger.info("返回报文:" + new String(dec_data));
                return dec_data;
            }

            byte[] tmp = new byte[10];

            // 读取数字签名长度
            System.arraycopy(data, 0, tmp, 0, tmp.length);
            int length = Integer.parseInt(new String(tmp));
            if (length != 128) {
                return decrypt(data, cs);
            }

            // 读取数字签名
            signdata = new byte[length];
            System.arraycopy(data, tmp.length, signdata, 0, signdata.length);
            logger.info("商户系统返回数字签名为：" + ConvertBase64.encode(signdata));

            // 读取加密报文
            byte[] xmldata = new byte[data.length - tmp.length - signdata.length];
            System.arraycopy(data, tmp.length + signdata.length, xmldata, 0, xmldata.length);
            logger.info("商户系统返回报文解密前为:" + ConvertBase64.encode(xmldata));

            // 解密返回报文
            byte[] dec_data = decrypt(xmldata, cs);
            logger.info("商户系统返回报文解密后为：" + new String(dec_data));

            // 验证数字签名
            if (!isValid(dec_data, signdata, cs))
                logger.error("返回报文数字签名非法");

            return dec_data;
        } catch (UnsupportedEncodingException e) {
            logger.error(e.getMessage(), e);
            return null;
        }

    }

    public static byte[] getResponseData(HttpClient client, HttpPost method) {
        ResponseHandler<byte[]> responseHandler = new ResponseHandler<byte[]>() {

            public byte[] handleResponse(final HttpResponse response) throws ClientProtocolException, IOException {
                int status = response.getStatusLine().getStatusCode();

                if (status >= 200 && status < 300) {
                    return input2byte(response.getEntity().getContent());
                } else {
                    throw new ClientProtocolException("Unexpected response status: " + status);
                }
            }

        };

        try {
            return client.execute(method, responseHandler);
        } catch (IOException e) {
            logger.error(e.getMessage(),e);
            return null;
        }
    }

    /**
     * 上传文件
     *
     * @param filename    上传的文件名
     * @param merchant_no 商户编号
     * @return
     */
    public byte[] upload(String filename, String merchant_no) {

        try {
            HttpClient client = HttpClients.createDefault();
            HttpPost method = new HttpPost(Config.URL_DOWNLOAD);
            RequestConfig requestConfig = RequestConfig.custom()
                    .setConnectionRequestTimeout(timeout * 1000).build();
            method.setConfig(requestConfig);
            List<NameValuePair> nvps = new ArrayList<NameValuePair>();

            CertStore cs = CertStoreFactory.getCertStore("merchant" + merchant_no);

            //文件名加密
            byte[] enc_filename = encrypt(filename.getBytes(), cs);
            nvps.add(new BasicNameValuePair("filename", ConvertBase64.encode(enc_filename)));
            //文件名签名
            byte[] signdata = sign(filename.getBytes(), cs);
            nvps.add(new BasicNameValuePair("signature", ConvertBase64.encode(signdata)));
            //文件内容加密
            byte[] in = readFromFile(filename);
            byte[]  enc_data = encrypt(in, cs);
            nvps.add(new BasicNameValuePair("data", ConvertBase64.encode(enc_data)));

            method.setEntity(new UrlEncodedFormEntity(nvps));

            byte[] data = getResponseData(client, method);

            // 读取数字签名长度
            byte[] tmp = new byte[10];
            System.arraycopy(data, 0, tmp, 0, tmp.length);
            int length = Integer.parseInt(new String(tmp));

            // 读取数字签名
            signdata = new byte[length];
            System .arraycopy(data, tmp.length, signdata, 0, signdata.length);
            // 读取加密报文
            byte[] xmldata = new byte[data.length - tmp.length - signdata.length];
            System.arraycopy(data, tmp.length + signdata.length, xmldata, 0, xmldata.length);
            // 解密返回报文
            byte[] dec_data = decrypt(xmldata, cs);
            // 验证数字签名
            boolean flag = isValid(dec_data, signdata, cs);
            if (!flag)
                logger.error("返回报文数字签名非法");

            return dec_data;
        } catch (UnsupportedEncodingException e) {
            logger.error(e.getMessage(),e);
            return null;
        }

    }

    /**
     * 发送xml报文
     *
     * @param input    下载文件名
     * @return
     */
    public byte[] postXML(InputStream input) {

        try {
            HttpClient client = HttpClients.createDefault();
            HttpPost method = new HttpPost(Config.URL_DOWNLOAD);
            RequestConfig requestConfig = RequestConfig.custom()
                    .setConnectionRequestTimeout(timeout * 1000).build();
            method.setConfig(requestConfig);
            List<NameValuePair> nvps = new ArrayList<NameValuePair>();

            CertStore cs_ccb = CertStoreFactory.getCertStore("CCBkey_1100000001");

            //提取发送报文内容
            byte[] in = new byte[input.available()];
            input.read(in);

            byte[] signdata = sign(in, cs_ccb);
            nvps.add(new BasicNameValuePair("signature", ConvertBase64.encode(signdata)));

            //发送报文内容加密
            byte[]  enc_data = encrypt(in, cs_ccb);
            nvps.add(new BasicNameValuePair("data", ConvertBase64.encode(enc_data)));

            method.setEntity(new UrlEncodedFormEntity(nvps));

            //得到提交报文后的返回数据
            byte[] data = getResponseData(client, method);


            CertStore cs_mch = CertStoreFactory.getCertStore("MCHkey_1100000001");

            // 读取数字签名长度
            byte[] tmp = new byte[10];
            System.arraycopy(data, 0, tmp, 0, tmp.length);
            int length = Integer.parseInt(new String(tmp));

            // 读取数字签名
            signdata = new byte[length];
            System .arraycopy(data, tmp.length, signdata, 0, signdata.length);
            // 读取加密报文
            byte[] xmldata = new byte[data.length - tmp.length - signdata.length];
            System.arraycopy(data, tmp.length + signdata.length, xmldata, 0, xmldata.length);
            // 解密返回报文
            byte[] dec_data = decrypt(xmldata, cs_mch);

            // 解密报文
//            byte[] dec_in = decrypt(data, cs_mch);

            // 验证数字签名
            boolean flag = isValid(dec_data, signdata, cs_mch);
            if (!flag)
                logger.error("返回报文数字签名非法");

            return dec_data;
        } catch (Exception e) {
            logger.error(e.getMessage(),e);
            return null;
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
