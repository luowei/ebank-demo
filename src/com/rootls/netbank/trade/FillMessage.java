package com.rootls.netbank.trade;

import com.rootls.common.xml.Message;
import com.rootls.netbank.trade.jiaoyi.Jh3Fc010;
import com.rootls.netbank.trade.jiaoyi.Jh3Fc011;
import com.rootls.common.Config;
import com.rootls.netbank.trade.chujing.Jh3Fc022;
import com.rootls.netbank.trade.jiaoyi.Jh3Fc009;
import com.rootls.netbank.trade.rujing.Jh3Fc002;
import com.rootls.netbank.trade.sign.Jh3Fc001;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by luowei on 2014/9/26.
 */
public class FillMessage {

    public static Message fillSignMessage(Jh3Fc001 body) {

        Message message = Message.getANewMessage();

        List<Message.Field> headList = message.getHead().getFields();
        List<Message.Field> bodyList = message.getBody().getFields();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat sfm = new SimpleDateFormat("HHmmss");

        MsgHead head = new MsgHead();
        head.setChanl_date(sdf.format(new Date()));
        head.setChanl_time(sfm.format(new Date()));
        head.setChanl_flow_no(String.valueOf(body.getId()));
        head.setChanl_trad_no("3FC001");
        //  head.setEctip_date("20140924");

        headList.add(new Message.Field("version", head.getVersion()));
        headList.add(new Message.Field("type", head.getType()));
        headList.add(new Message.Field("chanl_no", head.getChanl_no()));
        headList.add(new Message.Field("chanl_sub_no", head.getChanl_sub_no()));
        headList.add(new Message.Field("chanl_date", head.getChanl_date()));
        headList.add(new Message.Field("chanl_time", head.getChanl_time()));
        headList.add(new Message.Field("ectip_date", head.getEctip_date()));
        headList.add(new Message.Field("chanl_flow_no", head.getChanl_flow_no()));
        headList.add(new Message.Field("ectip_flow_no", head.getEctip_flow_no()));
        headList.add(new Message.Field("chanl_trad_no", head.getChanl_trad_no()));

        bodyList.add(new Message.Field("MCH_NO", body.getMchNo()));
        bodyList.add(new Message.Field("MBR_CERT_TYPE", body.getMbrCertType()));
        bodyList.add(new Message.Field("MBR_CERT_NO", body.getMbrCertNo()));
        bodyList.add(new Message.Field("SPOT_SIT_NO", body.getSpotSitNo()));
        bodyList.add(new Message.Field("FUTURE_SIT_NO", body.getFutureSitNo()));
        bodyList.add(new Message.Field("MBR_SPE_ACCT_NO", body.getMbrSpeAcctNo()));
        bodyList.add(new Message.Field("MBR_NAME", body.getMbrName()));
        bodyList.add(new Message.Field("MBR_SPE_ACCT_BKID", body.getMbrSpeAcctBkid()));
        bodyList.add(new Message.Field("MBR_CONTACT", body.getMbrContact()));
        bodyList.add(new Message.Field("MBR_PHONE_NUM", body.getMbrPhoneNum()));
        bodyList.add(new Message.Field("MBR_ADDR", body.getMbrAddr()));
        bodyList.add(new Message.Field("MBR_ANNUAL_FEE_AMT", String.valueOf(body.getMbrAnnualFeeAmt().doubleValue())));
        bodyList.add(new Message.Field("MBR_INOUT_AMT_SVC_AMT", String.valueOf(body.getMbrInoutAmtSvcAmt().doubleValue())));
        bodyList.add(new Message.Field("MBR_INOUT_AMT_SVC_DRAWEE", body.getMbrInoutAmtSvcDrawee()));
        bodyList.add(new Message.Field("MBR_INOUT_AMT_SVC_RCV_STY", body.getMbrInoutAmtSvcRcvSty()));

        bodyList.add(new Message.Field("SIGNED_DATE", body.getSignedDate()==null?"":sdf.format(body.getSignedDate())));
        bodyList.add(new Message.Field("DIS_SGN_DATE", body.getDisSgnDate()==null?"":sdf.format(body.getDisSgnDate())));
        bodyList.add(new Message.Field("MBR_STS", body.getMbrSts()==null?"0":body.getMbrSts()));
        bodyList.add(new Message.Field("RMRK", body.getRmrk()));

        return message;
    }

    public static MsgHead getMsgHead(List<Message.Field> headList) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat sfm = new SimpleDateFormat("HHmmss");

        MsgHead head = new MsgHead();

        headList.add(new Message.Field("version", head.getVersion()));
        headList.add(new Message.Field("type", head.getType()));
        headList.add(new Message.Field("chanl_no", head.getChanl_no()));
        headList.add(new Message.Field("chanl_sub_no", head.getChanl_sub_no()));

        head.setChanl_date(sdf.format(new Date()));
        headList.add(new Message.Field("chanl_date", head.getChanl_date()));

        head.setChanl_time(sfm.format(new Date()));
        headList.add(new Message.Field("chanl_time", head.getChanl_time()));

        headList.add(new Message.Field("ectip_date", head.getEctip_date()));

        headList.add(new Message.Field("ectip_flow_no", head.getEctip_flow_no()));

//        head.setChanl_flow_no(String.valueOf(32));
//        headList.add(new Message.Field("chanl_flow_no", head.getChanl_flow_no()));
        return head;
    }

    public static Message fillQuerySignMessage(String sitNo) {
        Message message = Message.getANewMessage();
        List<Message.Field> headList = message.getHead().getFields();
        List<Message.Field> bodyList = message.getBody().getFields();

        MsgHead head = getMsgHead(headList);

        head.setChanl_trad_no("3FC014");
        headList.add(new Message.Field("chanl_trad_no", head.getChanl_trad_no()));

        bodyList.add(new Message.Field("MCH_NO", Config.mch_no));
        bodyList.add(new Message.Field("FUNC_CODE", "1"));


        bodyList.add(new Message.Field("SIT_NO", sitNo));

//        bodyList.add(new Field("CERT_TYPE", ""));
//        bodyList.add(new Field("CERT_NO", ""));
        return message;
    }



    public static Message fillQueryYuEMessage(String spotSitNo) {
        Message message = Message.getANewMessage();
        List<Message.Field> headList = message.getHead().getFields();
        List<Message.Field> bodyList = message.getBody().getFields();

        MsgHead head = getMsgHead(headList);

        head.setChanl_trad_no("3FC006");
        headList.add(new Message.Field("chanl_trad_no", head.getChanl_trad_no()));

        bodyList.add(new Message.Field("MCH_NO", Config.mch_no));
        bodyList.add(new Message.Field("FUNC_CODE", "1"));

        //公司一七:1411715760148   公司一九 :1411721146923
        bodyList.add(new Message.Field("SIT_NO", spotSitNo));
        bodyList.add(new Message.Field("MCH_SIT_TYP", null));


        return message;

    }

    public static Message fillRuJingMessage(Jh3Fc002 jh3Fc002) {
        Message message = Message.getANewMessage();
        List<Message.Field> headList = message.getHead().getFields();
        List<Message.Field> bodyList = message.getBody().getFields();

        MsgHead head = getMsgHead(headList);

        head.setChanl_trad_no("3FC002");
        headList.add(new Message.Field("chanl_trad_no", head.getChanl_trad_no()));

        bodyList.add(new Message.Field("MCH_NO", Config.mch_no));
        bodyList.add(new Message.Field("CURR_COD", "01"));
        bodyList.add(new Message.Field("TX_AMT", jh3Fc002.getTxAmt()==null?"0":String.valueOf(jh3Fc002.getTxAmt().doubleValue())));
        bodyList.add(new Message.Field("IN_AMT_SIT_NO", jh3Fc002.getInAmtSitNo()));
        bodyList.add(new Message.Field("RMRK", jh3Fc002.getRmrk()));


        return message;
    }

    public static Message fillChuJingMessage(Jh3Fc022 jh3Fc022) {
        Message message = Message.getANewMessage();
        List<Message.Field> headList = message.getHead().getFields();
        List<Message.Field> bodyList = message.getBody().getFields();

        MsgHead head = getMsgHead(headList);

        head.setChanl_trad_no("3FC022");
        headList.add(new Message.Field("chanl_trad_no", head.getChanl_trad_no()));

        bodyList.add(new Message.Field("MCH_NO", Config.mch_no));
        bodyList.add(new Message.Field("FLOW_NO", jh3Fc022.getFlowNo()));
        bodyList.add(new Message.Field("DRAWEE_ACCT_NO", jh3Fc022.getDraweeAcctNo()));
        bodyList.add(new Message.Field("PAYEE_ACCT_NO", jh3Fc022.getPayeeAcctNo()));
        bodyList.add(new Message.Field("CURR_COD", jh3Fc022.getCurrCod()));
        bodyList.add(new Message.Field("TX_AMT", jh3Fc022.getCurrCod()));
        bodyList.add(new Message.Field("OUT_AMT_SIT_NO", jh3Fc022.getCurrCod()));
        bodyList.add(new Message.Field("AUDIT_STS", jh3Fc022.getCurrCod()));
        bodyList.add(new Message.Field("RMRK", jh3Fc022.getCurrCod()));

        return message;
    }

    public static Message fillDongJieMessage(Jh3Fc009 jh3Fc009) {
        Message message = Message.getANewMessage();
        List<Message.Field> headList = message.getHead().getFields();
        List<Message.Field> bodyList = message.getBody().getFields();

        MsgHead head = getMsgHead(headList);

        head.setChanl_trad_no("3FC009");
        headList.add(new Message.Field("chanl_trad_no", head.getChanl_trad_no()));

        bodyList.add(new Message.Field("MCH_NO", Config.mch_no));
        bodyList.add(new Message.Field("FUNC_CODE", jh3Fc009.getFuncCode()));
        bodyList.add(new Message.Field("BUYER_SIT_NO", jh3Fc009.getBuyerSitNo()));
        bodyList.add(new Message.Field("SELLER_SIT_NO", jh3Fc009.getSellerSitNo()));
        bodyList.add(new Message.Field("CTRT_NO", jh3Fc009.getCtrtNo()));
        bodyList.add(new Message.Field("CTRT_AMT", jh3Fc009.getCtrtAmt()==null?"0":String.valueOf(jh3Fc009.getCtrtAmt().doubleValue())));
        bodyList.add(new Message.Field("BUYER_GUAR_PAY_AMT", jh3Fc009.getBuyerGuarPayAmt()==null?"0":String.valueOf(jh3Fc009.getBuyerGuarPayAmt().doubleValue())));
        bodyList.add(new Message.Field("SELLER_GUAR_PAY_AMT", jh3Fc009.getSellerGuarPayAmt()==null?"0":String.valueOf(jh3Fc009.getSellerGuarPayAmt().doubleValue())));
        bodyList.add(new Message.Field("BUYER_SVC_AMT", jh3Fc009.getBuyerSvcAmt()==null?"0":String.valueOf(jh3Fc009.getBuyerSvcAmt().doubleValue())));
        bodyList.add(new Message.Field("CURR_COD", jh3Fc009.getCurrCod()));
        bodyList.add(new Message.Field("RMRK", jh3Fc009.getRmrk()));
        bodyList.add(new Message.Field("FIN_FLG", jh3Fc009.getFinFlg()));
        bodyList.add(new Message.Field("FIN_AMT", jh3Fc009.getFinAmt()==null?"0":String.valueOf(jh3Fc009.getFinAmt().doubleValue())));

        return message;
    }

    public static Message fillQueryPayStatMessage(Jh3Fc010 jh3Fc010) {
        Message message = Message.getANewMessage();
        List<Message.Field> headList = message.getHead().getFields();
        List<Message.Field> bodyList = message.getBody().getFields();

        MsgHead head = getMsgHead(headList);

        head.setChanl_trad_no("3FC010");
        headList.add(new Message.Field("chanl_trad_no", head.getChanl_trad_no()));

        bodyList.add(new Message.Field("MCH_NO", Config.mch_no));
        bodyList.add(new Message.Field("CTRT_NO", jh3Fc010.getCtrtNo()));
        bodyList.add(new Message.Field("PAY_PRD_NO", jh3Fc010.getPayPrdNo()));

        return message;
    }

    public static Message fillHaltTradeMessage(Jh3Fc011 jh3Fc011) {
        Message message = Message.getANewMessage();
        List<Message.Field> headList = message.getHead().getFields();
        List<Message.Field> bodyList = message.getBody().getFields();

        MsgHead head = getMsgHead(headList);

        head.setChanl_trad_no("3FC011");
        headList.add(new Message.Field("chanl_trad_no", head.getChanl_trad_no()));

        bodyList.add(new Message.Field("MCH_NO", Config.mch_no));
        bodyList.add(new Message.Field("BUYER_SIT_NO", jh3Fc011.getBuyerSitNo()));
        bodyList.add(new Message.Field("SELLER_SIT_NO", jh3Fc011.getSellerSitNo()));
        bodyList.add(new Message.Field("CTRT_NO", jh3Fc011.getCtrtNo()));
        bodyList.add(new Message.Field("PAY_PRD_NO", jh3Fc011.getPayPrdNo()));
        bodyList.add(new Message.Field("BUYER_PEN_AMT", jh3Fc011.getBuyerPenAmt()==null?"0":String.valueOf(jh3Fc011.getBuyerPenAmt().doubleValue())));
        bodyList.add(new Message.Field("SELLER_PEN_AMT", jh3Fc011.getSellerPenAmt()==null?"0":String.valueOf(jh3Fc011.getSellerPenAmt().doubleValue())));
        bodyList.add(new Message.Field("BUYER_SVC_AMT", jh3Fc011.getBuyerSvcAmt()==null?"0":String.valueOf(jh3Fc011.getBuyerSvcAmt().doubleValue())));
        bodyList.add(new Message.Field("SELLER_SVC_AMT", jh3Fc011.getSellerSvcAmt()==null?"0":String.valueOf(jh3Fc011.getSellerSvcAmt().doubleValue())));
        bodyList.add(new Message.Field("CURR_COD", jh3Fc011.getCurrCod()));
        bodyList.add(new Message.Field("RMRK", jh3Fc011.getRmrk()));
        bodyList.add(new Message.Field("BUYER_PAY_UNFRZ_AMT", jh3Fc011.getBuyerPayUnfrzAmt()==null?"0":String.valueOf(jh3Fc011.getBuyerPayUnfrzAmt().doubleValue())));
        bodyList.add(new Message.Field("SELLER_PAY_UNFRZ_AMT", jh3Fc011.getSellerPayUnfrzAmt()==null?"0":String.valueOf(jh3Fc011.getBuyerPayUnfrzAmt().doubleValue())));
        bodyList.add(new Message.Field("BUYER_SVC_UNFRZ_AMT", jh3Fc011.getBuyerSvcAmt()==null?"0":String.valueOf(jh3Fc011.getBuyerPayUnfrzAmt().doubleValue())));
        bodyList.add(new Message.Field("SELLER_SVC_UNFRZ_AMT", jh3Fc011.getSellerSvcAmt()==null?"0":String.valueOf(jh3Fc011.getBuyerPayUnfrzAmt().doubleValue())));

        return message;
    }

}
