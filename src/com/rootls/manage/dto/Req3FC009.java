package com.rootls.manage.dto;

import java.io.Serializable;

/**
 * Created by luowei on 2014/8/17.
 */
public class Req3FC009 implements Serializable {

    String func_code;
    String mch_no;
    String buyer_sit_no;
    String seller_sit_no;
    String ctrt_no;
    String ctrt_amt;
    String buyer_guar_pay_amt;
    String seller_guar_pay_amt;
    String buyer_svc_amt;
    String seller_svc_amt;
    String curr_cod;
    String rmrk;
    String fin_flg;
    String fin_amt;

    public String getFunc_code() {
        return func_code;
    }

    public void setFunc_code(String func_code) {
        this.func_code = func_code;
    }

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

    public String getCtrt_amt() {
        return ctrt_amt;
    }

    public void setCtrt_amt(String ctrt_amt) {
        this.ctrt_amt = ctrt_amt;
    }

    public String getBuyer_guar_pay_amt() {
        return buyer_guar_pay_amt;
    }

    public void setBuyer_guar_pay_amt(String buyer_guar_pay_amt) {
        this.buyer_guar_pay_amt = buyer_guar_pay_amt;
    }

    public String getSeller_guar_pay_amt() {
        return seller_guar_pay_amt;
    }

    public void setSeller_guar_pay_amt(String seller_guar_pay_amt) {
        this.seller_guar_pay_amt = seller_guar_pay_amt;
    }

    public String getBuyer_svc_amt() {
        return buyer_svc_amt;
    }

    public void setBuyer_svc_amt(String buyer_svc_amt) {
        this.buyer_svc_amt = buyer_svc_amt;
    }

    public String getSeller_svc_amt() {
        return seller_svc_amt;
    }

    public void setSeller_svc_amt(String seller_svc_amt) {
        this.seller_svc_amt = seller_svc_amt;
    }

    public String getCurr_cod() {
        return curr_cod;
    }

    public void setCurr_cod(String curr_cod) {
        this.curr_cod = curr_cod;
    }

    public String getRmrk() {
        return rmrk;
    }

    public void setRmrk(String rmrk) {
        this.rmrk = rmrk;
    }

    public String getFin_flg() {
        return fin_flg;
    }

    public void setFin_flg(String fin_flg) {
        this.fin_flg = fin_flg;
    }

    public String getFin_amt() {
        return fin_amt;
    }

    public void setFin_amt(String fin_amt) {
        this.fin_amt = fin_amt;
    }
}
