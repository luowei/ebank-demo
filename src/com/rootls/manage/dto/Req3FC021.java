package com.rootls.manage.dto;

import java.io.Serializable;

/**
 * Created by luowei on 2014/8/15.
 */
public class Req3FC021 implements Serializable {

    String mch_no;
    String file_name;
    String mx_file_locstr;

    public String getMch_no() {
        return mch_no;
    }

    public void setMch_no(String mch_no) {
        this.mch_no = mch_no;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public String getMx_file_locstr() {
        return mx_file_locstr;
    }

    public void setMx_file_locstr(String mx_file_locstr) {
        this.mx_file_locstr = mx_file_locstr;
    }
}


