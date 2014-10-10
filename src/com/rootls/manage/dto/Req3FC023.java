package com.rootls.manage.dto;

import java.io.Serializable;

/**
 * Created by luowei on 2014/8/17.
 */
public class Req3FC023 implements Serializable {
    String mch_no;
    String file_name;
    String dir_flag;

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

    public String getDir_flag() {
        return dir_flag;
    }

    public void setDir_flag(String dir_flag) {
        this.dir_flag = dir_flag;
    }
}
