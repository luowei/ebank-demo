package com.rootls.manage.dto;

import java.io.Serializable;

/**
 * Created by luowei on 2014/8/17.
 */
public class Res3FC028 implements Serializable {

    String ctrt_sts;
    Double buyer_pay_unfrz_amt;
    Double seller_pay_unfrz_amt;
    Double buyer_svc_unfrz_amt;
    Double seller_svc_unfrz_amt;

    public String getCtrt_sts() {
        return ctrt_sts;
    }

    public void setCtrt_sts(String ctrt_sts) {
        this.ctrt_sts = ctrt_sts;
    }

    public Double getBuyer_pay_unfrz_amt() {
        return buyer_pay_unfrz_amt;
    }

    public void setBuyer_pay_unfrz_amt(Double buyer_pay_unfrz_amt) {
        this.buyer_pay_unfrz_amt = buyer_pay_unfrz_amt;
    }

    public Double getSeller_pay_unfrz_amt() {
        return seller_pay_unfrz_amt;
    }

    public void setSeller_pay_unfrz_amt(Double seller_pay_unfrz_amt) {
        this.seller_pay_unfrz_amt = seller_pay_unfrz_amt;
    }

    public Double getBuyer_svc_unfrz_amt() {
        return buyer_svc_unfrz_amt;
    }

    public void setBuyer_svc_unfrz_amt(Double buyer_svc_unfrz_amt) {
        this.buyer_svc_unfrz_amt = buyer_svc_unfrz_amt;
    }

    public Double getSeller_svc_unfrz_amt() {
        return seller_svc_unfrz_amt;
    }

    public void setSeller_svc_unfrz_amt(Double seller_svc_unfrz_amt) {
        this.seller_svc_unfrz_amt = seller_svc_unfrz_amt;
    }
}
