package com.rootls.manage.dto;

import java.io.Serializable;

/**
 * Created by luowei on 2014/8/15.
 */
public class Req3FC020 implements Serializable {

    String mch_no;
    String date;
    String file_name;
    String inq_amt_typ;

    public String getMch_no() {
        return mch_no;
    }

    public void setMch_no(String mch_no) {
        this.mch_no = mch_no;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public String getInq_amt_typ() {
        return inq_amt_typ;
    }

    public void setInq_amt_typ(String inq_amt_typ) {
        this.inq_amt_typ = inq_amt_typ;
    }
}


