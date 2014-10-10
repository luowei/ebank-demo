package com.rootls.manage.dto;

import java.io.Serializable;

/**
 * Created by luowei on 2014/8/17.
 */
public class Req3FC006 implements Serializable {
    String func_code;
    String mch_no;
    String sit_no;
    String mch_sit_typ;

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
}
