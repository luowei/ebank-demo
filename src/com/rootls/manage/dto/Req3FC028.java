package com.rootls.manage.dto;

import java.io.Serializable;

/**
 * Created by luowei on 2014/8/17.
 */
public class Req3FC028 implements Serializable {

    String mch_no;
    String ctrt_no;
    String buyer_sit_no;
    String seller_sit_no;
    String rmrk;

    public String getMch_no() {
        return mch_no;
    }

    public void setMch_no(String mch_no) {
        this.mch_no = mch_no;
    }

    public String getCtrt_no() {
        return ctrt_no;
    }

    public void setCtrt_no(String ctrt_no) {
        this.ctrt_no = ctrt_no;
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

    public String getRmrk() {
        return rmrk;
    }

    public void setRmrk(String rmrk) {
        this.rmrk = rmrk;
    }
}
