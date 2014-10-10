package com.rootls.manage.dto;

import java.io.Serializable;

/**
 * Created by luowei on 2014/8/17.
 */
public class Req3FC019 implements Serializable {

    String mch_no;
    String buyer_sit_no;
    String seller_sit_no;
    String ctrt_no;
    String pay_prd_no;
    Double tx_amt;
    Double buyer_svc_amt;
    Double seller_svc_amt;
    String pay_sts;

    public String getMch_no() {
        return mch_no;
    }

    public void setMch_no(String mch_no) {
        this.mch_no = mch_no;
    }

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

    public String getCtrt_no() {
        return ctrt_no;
    }

    public void setCtrt_no(String ctrt_no) {
        this.ctrt_no = ctrt_no;
    }

    public String getPay_prd_no() {
        return pay_prd_no;
    }

    public void setPay_prd_no(String pay_prd_no) {
        this.pay_prd_no = pay_prd_no;
    }

    public Double getTx_amt() {
        return tx_amt;
    }

    public void setTx_amt(Double tx_amt) {
        this.tx_amt = tx_amt;
    }

    public Double getBuyer_svc_amt() {
        return buyer_svc_amt;
    }

    public void setBuyer_svc_amt(Double buyer_svc_amt) {
        this.buyer_svc_amt = buyer_svc_amt;
    }

    public Double getSeller_svc_amt() {
        return seller_svc_amt;
    }

    public void setSeller_svc_amt(Double seller_svc_amt) {
        this.seller_svc_amt = seller_svc_amt;
    }

    public String getPay_sts() {
        return pay_sts;
    }

    public void setPay_sts(String pay_sts) {
        this.pay_sts = pay_sts;
    }
}
