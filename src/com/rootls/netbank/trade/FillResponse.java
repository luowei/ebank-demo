package com.rootls.netbank.trade;

import com.rootls.netbank.trade.jiaoyi.Jh3Fc010;
import com.rootls.netbank.trade.jiaoyi.Jh3Fc011;
import com.rootls.common.xml.Message;
import com.rootls.netbank.trade.chujing.Jh3Fc022;
import com.rootls.netbank.trade.jiaoyi.Jh3Fc009;
import com.rootls.netbank.trade.rujing.Jh3Fc002;

import java.math.BigDecimal;

/**
 * Created by luowei on 2014/9/27.
 */
public class FillResponse {

    public static Jh3Fc002 fillRuJingResponse2Body(Jh3Fc002 body, Message msg) {
        for (Message.Field field : msg.getBody().getFields()) {
            if ("MCH_NAME".equals(field.getName())) {
                body.setMchName(field.getValue());
            }
            if ("MBR_NO".equals(field.getName())) {
                body.setMbrNo(field.getValue());
            }
            if ("MBR_NAME".equals(field.getName())) {
                body.setMbrName(field.getValue());
            }
            if ("IN_AMT_SVC_TOTL".equals(field.getName())) {
                body.setInAmtSvcTotl(field.getValue() == null ? null : BigDecimal.valueOf(Double.valueOf(field.getValue())));
            }
            if ("IN_TX_LOG_NO".equals(field.getName())) {
                body.setInTxLogNo(field.getValue());
            }
        }
        return body;
    }

    public static Jh3Fc022 fillChuJingResponse2Body(Jh3Fc022 body, Message msg) {
        for (Message.Field field : msg.getBody().getFields()) {
            if ("OUT_TX_LOG_NO".equals(field.getName())) {
                body.setOutTxLogNo(field.getValue());
            }
        }
        return body;
    }

    public static Jh3Fc009 fillDongJieResponse2Body(Jh3Fc009 body, Message msg) {
        for (Message.Field field : msg.getBody().getFields()) {
            if ("MCH_NAME".equals(field.getName())) {
                body.setMchName(field.getValue());
            }
            if ("BUY_MBR_NAME".equals(field.getName())) {
                body.setBuyMbrName(field.getValue());
            }
            if ("SELL_MBR_NAME".equals(field.getName())) {
                body.setSellMbrName(field.getValue());
            }
            if ("TX_DT".equals(field.getName())) {
                body.setTxDt(field.getValue());
            }
        }
        return body;
    }

    public static Jh3Fc010 fillQueryPayStatResponse2Body(Jh3Fc010 body, Message msg) {
        for (Message.Field field : msg.getBody().getFields()) {
            if ("BUYER_SIT_NO".equals(field.getName())) {
                body.setBuyerSitNo(field.getValue());
            }
            if ("SELLER_SIT_NO".equals(field.getName())) {
                body.setSellerSitNo(field.getValue());
            }
            if ("TX_AMT".equals(field.getName())) {
                body.setTxAmt(field.getValue() == null ? null : BigDecimal.valueOf(Double.valueOf(field.getValue())));
            }
            if ("PAY_STS".equals(field.getName())) {
                body.setPaySts(field.getValue());
            }
        }
        return body;
    }

    public static Jh3Fc011 fillHaltTradeResponse2Body(Jh3Fc011 body, Message msg) {
        for (Message.Field field : msg.getBody().getFields()) {
            if ("MCH_NAME".equals(field.getName())) {
                body.setMchName(field.getValue());
            }
            if ("BUY_MBR_NAME".equals(field.getName())) {
                body.setBuyMbrName(field.getValue());
            }
            if ("SELL_MBR_NAME".equals(field.getName())) {
                body.setSellMbrName(field.getValue());
            }
            if ("TX_DT".equals(field.getName())) {
                body.setTxDt(field.getValue());
            }
        }
        return body;
    }

    public static Message chuJingAppliy() {
        return null;
    }
}
