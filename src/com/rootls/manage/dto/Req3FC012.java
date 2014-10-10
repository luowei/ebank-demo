package com.rootls.manage.dto;

import java.io.Serializable;

/**
 * Created by luowei on 2014/8/17.
 */
public class Req3FC012 implements Serializable {

    String mch_no;
    String sit_no;
    String pay_sts;
    String ctrt_no;
    String begin_date;
    String end_date;

    public String getMch_no() {
        return mch_no;
    }

    public void setMch_no(String mch_no) {
        this.mch_no = mch_no;
    }

    public String getSit_no() {
        return sit_no;
    }

    public void setSit_no(String sit_no) {
        this.sit_no = sit_no;
    }

    public String getPay_sts() {
        return pay_sts;
    }

    public void setPay_sts(String pay_sts) {
        this.pay_sts = pay_sts;
    }

    public String getCtrt_no() {
        return ctrt_no;
    }

    public void setCtrt_no(String ctrt_no) {
        this.ctrt_no = ctrt_no;
    }

    public String getBegin_date() {
        return begin_date;
    }

    public void setBegin_date(String begin_date) {
        this.begin_date = begin_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }
}
