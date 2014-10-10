package com.rootls.manage.dto;

import java.io.Serializable;

/**
 * Created by luowei on 2014/8/17.
 */
public class Res3FC015 implements Serializable {

    String buyer_sit_no;
    String seller_sit_no;
    Double curr_buyer_guar_pay_amt;
    Double curr_seller_guar_pay_amt;
    Double curr_buyer_svc_amt;
    Double curr_seller_svc_amt;


    String frz_dt;
    String tm;
    String frz_flag;
    Double buyer_guar_pay_amt;
    Double buyer_svc_amt;
    Double seller_guar_pay_amt;
    Double seller_svc_amt;
    String rmrk;
    String frz_fund_typ;

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

    public Double getCurr_buyer_guar_pay_amt() {
        return curr_buyer_guar_pay_amt;
    }

    public void setCurr_buyer_guar_pay_amt(Double curr_buyer_guar_pay_amt) {
        this.curr_buyer_guar_pay_amt = curr_buyer_guar_pay_amt;
    }

    public Double getCurr_seller_guar_pay_amt() {
        return curr_seller_guar_pay_amt;
    }

    public void setCurr_seller_guar_pay_amt(Double curr_seller_guar_pay_amt) {
        this.curr_seller_guar_pay_amt = curr_seller_guar_pay_amt;
    }

    public Double getCurr_buyer_svc_amt() {
        return curr_buyer_svc_amt;
    }

    public void setCurr_buyer_svc_amt(Double curr_buyer_svc_amt) {
        this.curr_buyer_svc_amt = curr_buyer_svc_amt;
    }

    public Double getCurr_seller_svc_amt() {
        return curr_seller_svc_amt;
    }

    public void setCurr_seller_svc_amt(Double curr_seller_svc_amt) {
        this.curr_seller_svc_amt = curr_seller_svc_amt;
    }

    public String getFrz_dt() {
        return frz_dt;
    }

    public void setFrz_dt(String frz_dt) {
        this.frz_dt = frz_dt;
    }

    public String getTm() {
        return tm;
    }

    public void setTm(String tm) {
        this.tm = tm;
    }

    public String getFrz_flag() {
        return frz_flag;
    }

    public void setFrz_flag(String frz_flag) {
        this.frz_flag = frz_flag;
    }

    public Double getBuyer_guar_pay_amt() {
        return buyer_guar_pay_amt;
    }

    public void setBuyer_guar_pay_amt(Double buyer_guar_pay_amt) {
        this.buyer_guar_pay_amt = buyer_guar_pay_amt;
    }

    public Double getBuyer_svc_amt() {
        return buyer_svc_amt;
    }

    public void setBuyer_svc_amt(Double buyer_svc_amt) {
        this.buyer_svc_amt = buyer_svc_amt;
    }

    public Double getSeller_guar_pay_amt() {
        return seller_guar_pay_amt;
    }

    public void setSeller_guar_pay_amt(Double seller_guar_pay_amt) {
        this.seller_guar_pay_amt = seller_guar_pay_amt;
    }

    public Double getSeller_svc_amt() {
        return seller_svc_amt;
    }

    public void setSeller_svc_amt(Double seller_svc_amt) {
        this.seller_svc_amt = seller_svc_amt;
    }

    public String getRmrk() {
        return rmrk;
    }

    public void setRmrk(String rmrk) {
        this.rmrk = rmrk;
    }

    public String getFrz_fund_typ() {
        return frz_fund_typ;
    }

    public void setFrz_fund_typ(String frz_fund_typ) {
        this.frz_fund_typ = frz_fund_typ;
    }
}
