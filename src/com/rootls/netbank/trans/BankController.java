package com.rootls.netbank.trans;

import com.rootls.common.convert.MyConvert;
import com.rootls.common.NeedLogin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import static com.rootls.common.Config.mch_no;
import static com.rootls.common.convert.MyConvert.encrypt;

/**
 * Created by luowei on 2014/9/10.
 */
@Controller
@RequestMapping("/bank")
public class BankController {

    Logger log = LoggerFactory.getLogger(BankController.class);

    @Autowired
    BankService bankService;


    /**
     * 提供给银行公钥下载
     *
     * @param request
     * @return
     */
    @NeedLogin(false)
    @RequestMapping("/getkeys")
    public ResponseEntity<byte[]> getkeys(HttpServletRequest request) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        headers.setContentDispositionFormData("attachment", "key_RSA_pub_" + mch_no + ".dat");

        byte[] data = MyConvert.input2byte(request.getServletContext().getResourceAsStream("WEB-INF/classes/key/mine/key_RSA_pub.dat"));

        String dataStr = new String(data);

//        log.info("before:" + dataStr);
        byte[] encData = encrypt(dataStr, mch_no);
//        log.info("after:" + decrypt(encData, mch_no));

        byte[] zeros = "000000".getBytes();

        byte[] resData = new byte[zeros.length + encData.length];
        System.arraycopy(zeros, 0, resData, 0, zeros.length);
        System.arraycopy(encData, 0, resData, zeros.length, encData.length);

        return new ResponseEntity<byte[]>(resData, headers, HttpStatus.OK);
    }

    /**
     * 提供给银行的推送
     *
     * @return
     */
    @NeedLogin(false)
    @RequestMapping("/push")
    public ResponseEntity<byte[]> push(String xml,String signature/*RequestEntity<byte[]> requestEntity*/) throws UnsupportedEncodingException {

//        byte[] data = requestEntity.getBody();

        byte[] resData = bankService.handleBankPush(xml,signature);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(resData, headers, HttpStatus.OK);
    }

    /**
     * 提供给银行的交易
     *
     * @return
     */
    @NeedLogin(false)
    @RequestMapping("/trade")
    public ResponseEntity<byte[]> trade(byte[] sendData) throws UnsupportedEncodingException {

        byte[] dec_data = bankService.handleMyPush(sendData);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(dec_data, headers, HttpStatus.OK);
    }

    /**
     * 获取银行的公钥与des密钥
     *
     * @param type   pub:表示获取公钥;des表示获取des密钥
     * @param mch_no 商户编号
     * @return
     * @throws IOException
     */
    @RequestMapping("/getbankkeys")
    public ResponseEntity<byte[]> getbankkeys(String type, String mch_no) throws IOException {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        headers.setContentDispositionFormData("attachment", mch_no + "_bank_" + type.replace(":", ""));

        byte[] data = bankService.getBankKeyData(type, mch_no);

        return new ResponseEntity<byte[]>(data, headers, HttpStatus.CREATED);
    }


}
