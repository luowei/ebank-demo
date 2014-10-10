package com.rootls.manage.dto;

import java.io.Serializable;

/**
 * Created by luowei on 2014/8/15.
 */
public class Req3FC017 implements Serializable {

    String file_name;
    String md5;
    String mch_no;

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public String getMch_no() {
        return mch_no;
    }

    public void setMch_no(String mch_no) {
        this.mch_no = mch_no;
    }
}


