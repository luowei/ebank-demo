package com.rootls.netbank.trade;

import com.rootls.common.xml.JaxbUtil;
import com.rootls.common.xml.Message;
import com.rootls.manage.repository.SysCorpBankRepository;
import com.rootls.netbank.trade.chujing.Jh3Fc022Respository;
import com.rootls.netbank.trade.jiaoyi.*;
import com.rootls.netbank.trade.rujing.Jh3Fc002Repository;
import com.rootls.netbank.trade.sign.Jh3Fc001Repository;
import com.rootls.netbank.trans.BankService;
import com.rootls.common.Config;
import com.rootls.common.MyJson;
import com.rootls.netbank.trade.chujing.Jh3Fc022;
import com.rootls.netbank.trade.rujing.Jh3Fc002;
import com.rootls.netbank.trade.sign.Jh3Fc001;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by luowei on 2014/9/24.
 */
@Controller
public class TradeController {

    @Autowired
    BankService bankService;

    @Autowired
    SysCorpBankRepository sysCorpBankRepository;

    @Autowired
    Jh3Fc001Repository jh3Fc001Repository;
    @Autowired
    Jh3Fc002Repository jh3Fc002Repository;
    @Autowired
    Jh3Fc022Respository jh3Fc022Respository;
    @Autowired
    Jh3Fc009Repository jh3Fc009Repository;
    @Autowired
    Jh3Fc010Repository jh3Fc010Repository;
    @Autowired
    Jh3Fc011Repository jh3Fc011Repository;

    @RequestMapping("/toSign")
    public String toSign(Model model, Integer corpId) {
        model.addAttribute("corpId", corpId);
        return "trade/sign";
    }

    /**
     * 签约
     *
     * @param jh3Fc001
     * @return
     * @throws UnsupportedEncodingException
     */
    @ResponseBody
    @RequestMapping("/sign")
    public MyJson<String> sign(Jh3Fc001 jh3Fc001) throws UnsupportedEncodingException {

        List<Jh3Fc001> list = jh3Fc001Repository.findByCorpId(jh3Fc001.getCorpId());

        Jh3Fc001 body = null;
        if (list != null && !list.isEmpty()) {
            body = list.get(0);
        }
        if (body != null && body.getMbrSts() != null && body.getMbrSts().equals("0")) {
            return new MyJson<String>("你已经签约了！");
        }

        if (body == null) {
            body = jh3Fc001Repository.save(jh3Fc001);
        } else {
            jh3Fc001.setId(body.getId());
            jh3Fc001.setSpotSitNo(body.getSpotSitNo());
            body = jh3Fc001Repository.save(jh3Fc001);
        }

        Message message = FillMessage.fillSignMessage(body);

        Message msg = handleMyMessage(message);

        if (msg.isSuccessMessage()) {
            jh3Fc001Repository.updateSignStatus(body.getId());
        }

        return new MyJson<String>();
    }

    /**
     * 查询签约
     *
     * @param spotSitNo
     * @return
     * @throws UnsupportedEncodingException
     */
    @ResponseBody
    @RequestMapping("/querySign")
    public MyJson<Message> query(String spotSitNo) throws UnsupportedEncodingException {

        if (spotSitNo== null || spotSitNo=="") {
            return new MyJson<Message>(0, "请传入席位号");
        }

        //公司一七:1411715760148   公司一九 :1411721146923
        Message message = FillMessage.fillQuerySignMessage(spotSitNo);

        Message msg = handleMyMessage(message);

        return new MyJson<Message>(1, "ok", msg);
    }

    /**
     * 查询余额
     *
     * @param spotSitNo
     * @return
     * @throws UnsupportedEncodingException
     */
    @ResponseBody
    @RequestMapping("/queryYuE")
    public MyJson<Message> queryYuE(String spotSitNo) throws UnsupportedEncodingException {

        if (spotSitNo == null || spotSitNo == "") {
            return new MyJson<Message>(0, "请传入席位号");
        }

        //公司一七:1411715760148   公司一九 :1411721146923
        Message message = FillMessage.fillQueryYuEMessage(spotSitNo);

        Message msg = handleMyMessage(message);

//        System.out.println(respXml);

        return new MyJson<Message>(1, "ok", msg);
    }

    /**
     * 入金
     *
     * @param jh3Fc002
     * @return
     * @throws UnsupportedEncodingException
     */
    @ResponseBody
    @RequestMapping("/ruJing")
    public MyJson<Message> ruJing(Jh3Fc002 jh3Fc002) throws UnsupportedEncodingException {

        Jh3Fc002 body = jh3Fc002Repository.save(jh3Fc002);

        Message message = FillMessage.fillRuJingMessage(body);

        Message msg = handleMyMessage(message);

        if (msg.isSuccessMessage()) {
            body = FillResponse.fillRuJingResponse2Body(body, msg);
            jh3Fc002Repository.save(body);
        }

        return new MyJson<Message>(1, "ok", msg);
    }

    /**
     * 出金
     *
     * @param jh3Fc022
     * @return
     * @throws UnsupportedEncodingException
     */
    @ResponseBody
    @RequestMapping("/chuJing")
    public MyJson<Message> chuJing(Jh3Fc022 jh3Fc022) throws UnsupportedEncodingException {

        Jh3Fc022 body = jh3Fc022Respository.save(jh3Fc022);

        Message message = FillMessage.fillChuJingMessage(body);

        Message msg = handleMyMessage(message);

        if (msg.isSuccessMessage()) {
            body = FillResponse.fillChuJingResponse2Body(body, msg);
            jh3Fc022Respository.save(body);
        }

        return new MyJson<Message>(1, "ok", msg);
    }

    /**
     * 冻结/解冻
     *
     * @param jh3Fc009
     * @return
     * @throws UnsupportedEncodingException
     */
    @ResponseBody
    @RequestMapping("/dongJie")
    public MyJson<Message> dongJie(Jh3Fc009 jh3Fc009) throws UnsupportedEncodingException {

        Jh3Fc009 body = jh3Fc009Repository.save(jh3Fc009);

        Message message = FillMessage.fillDongJieMessage(body);

        Message msg = handleMyMessage(message);

        if (msg.isSuccessMessage()) {
            body = FillResponse.fillDongJieResponse2Body(body, msg);
            jh3Fc009Repository.save(body);
        }

        return new MyJson<Message>(1, "ok", msg);
    }

    /**
     * 查询付款状态
     *
     * @param jh3Fc010
     * @return
     * @throws UnsupportedEncodingException
     */
    @ResponseBody
    @RequestMapping("/queryPayStat")
    public MyJson<Message> QueryPayStat(Jh3Fc010 jh3Fc010) throws UnsupportedEncodingException {

        Jh3Fc010 jh3Fc010_db = null;
        if (jh3Fc010.getMchNo() != null && jh3Fc010.getCtrtNo() != null && jh3Fc010.getPayPrdNo() != null) {
            List<Jh3Fc010> list = jh3Fc010Repository.findByMchNoAndCtrtNoAndPayPrdNo(jh3Fc010.getMchNo(), jh3Fc010.getCtrtNo(), jh3Fc010.getPayPrdNo());
            if (list != null && !list.isEmpty()) {
                jh3Fc010_db = list.get(0);
            }
        }
        if (jh3Fc010_db != null) {
            jh3Fc010.setId(jh3Fc010_db.getId());
        }
        Jh3Fc010 body = jh3Fc010Repository.save(jh3Fc010);

        Message message = FillMessage.fillQueryPayStatMessage(body);

        Message msg = handleMyMessage(message);

        if (msg.isSuccessMessage()) {
            body = FillResponse.fillQueryPayStatResponse2Body(body, msg);
            jh3Fc010Repository.save(body);
        }

        return new MyJson<Message>(1, "ok", msg);
    }

    /**
     * 停止交易
     *
     * @param jh3Fc011
     * @return
     * @throws UnsupportedEncodingException
     */
    @ResponseBody
    @RequestMapping("/haltTrade")
    public MyJson<Message> haltTrade(Jh3Fc011 jh3Fc011) throws UnsupportedEncodingException {

        Jh3Fc011 body = jh3Fc011Repository.save(jh3Fc011);

        Message message = FillMessage.fillHaltTradeMessage(jh3Fc011);

        Message msg = handleMyMessage(message);

        if (msg.isSuccessMessage()) {
            body = FillResponse.fillHaltTradeResponse2Body(body, msg);
            jh3Fc011Repository.save(body);
        }

        return new MyJson<Message>(1, "ok", msg);
    }


    public Message handleMyMessage(Message message) throws UnsupportedEncodingException {
        String xml = JaxbUtil.convertToXml(message);
//        System.out.println(xml);

        byte[] respData = bankService.handleMyPush(xml.getBytes(Config.encoding));
        String respXml = new String(respData, Config.encoding);

//        System.out.println(respXml);
        return JaxbUtil.converyToJavaBean(respXml, Message.class);
    }

}
