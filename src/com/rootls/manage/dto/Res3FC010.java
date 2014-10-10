package com.rootls.manage.dto;

import java.io.Serializable;

/**
 * Created by luowei on 2014/8/15.
 */
public class Res3FC010 implements Serializable {

    String buyer_sit_no;
    String seller_sit_no;
    String tx_amt;
    String pay_sts;

    public String getBuyer_sit_no() {
        return buyer_sit_no;
    }

    public void setBuyer_sit_no(String buyer_sit_no) {
        this.buyer_sit_no = buyer_sit_no;
    }

    public String getSeller_sit_no() {
        return seller_sit_no;
    }

    public void setSeller_sit_no(String seller_sit_no) {
        this.seller_sit_no = seller_sit_no;
    }

    public String getTx_amt() {
        return tx_amt;
    }

    public void setTx_amt(String tx_amt) {
        this.tx_amt = tx_amt;
    }

    public String getPay_sts() {
        return pay_sts;
    }

    public void setPay_sts(String pay_sts) {
        this.pay_sts = pay_sts;
    }
}


