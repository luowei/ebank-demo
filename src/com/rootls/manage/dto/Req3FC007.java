package com.rootls.manage.dto;

import java.io.Serializable;

/**
 * Created by luowei on 2014/8/17.
 */
public class Req3FC007 implements Serializable {
    String func_code;
    String mch_no;
    String sit_no;
    String mch_sit_typ;
    String strt_dt;
    String end_dt;
    String inq_amt_typ;
    String mch_inq_tm;

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

    public String getSit_no() {
        return sit_no;
    }

    public void setSit_no(String sit_no) {
        this.sit_no = sit_no;
    }

    public String getMch_sit_typ() {
        return mch_sit_typ;
    }

    public void setMch_sit_typ(String mch_sit_typ) {
        this.mch_sit_typ = mch_sit_typ;
    }

    public String getStrt_dt() {
        return strt_dt;
    }

    public void setStrt_dt(String strt_dt) {
        this.strt_dt = strt_dt;
    }

    public String getEnd_dt() {
        return end_dt;
    }

    public void setEnd_dt(String end_dt) {
        this.end_dt = end_dt;
    }

    public String getInq_amt_typ() {
        return inq_amt_typ;
    }

    public void setInq_amt_typ(String inq_amt_typ) {
        this.inq_amt_typ = inq_amt_typ;
    }

    public String getMch_inq_tm() {
        return mch_inq_tm;
    }

    public void setMch_inq_tm(String mch_inq_tm) {
        this.mch_inq_tm = mch_inq_tm;
    }
}
