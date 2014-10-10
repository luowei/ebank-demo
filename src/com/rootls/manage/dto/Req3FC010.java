package com.rootls.manage.dto;

import java.io.Serializable;

/**
 * Created by luowei on 2014/8/17.
 */
public class Req3FC010 implements Serializable {

    String mch_no;
    String ctrt_no;
    String pay_prd_no;

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

    public String getPay_prd_no() {
        return pay_prd_no;
    }

    public void setPay_prd_no(String pay_prd_no) {
        this.pay_prd_no = pay_prd_no;
    }
}
