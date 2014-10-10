package com.rootls.manage.dto;

import java.io.Serializable;

/**
 * Created by luowei on 2014/8/15.
 */
public class Req3FC013 implements Serializable {

    String func_code;
    String mch_no;
    String signin_date;
    String shift_no;

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

    public String getSignin_date() {
        return signin_date;
    }

    public void setSignin_date(String signin_date) {
        this.signin_date = signin_date;
    }

    public String getShift_no() {
        return shift_no;
    }

    public void setShift_no(String shift_no) {
        this.shift_no = shift_no;
    }
}


