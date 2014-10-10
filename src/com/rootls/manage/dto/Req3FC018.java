package com.rootls.manage.dto;

import java.io.Serializable;

/**
 * Created by luowei on 2014/8/15.
 */
public class Req3FC018 implements Serializable {

    String file_name;
    String flow_no;
    String mch_no;

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public String getFlow_no() {
        return flow_no;
    }

    public void setFlow_no(String flow_no) {
        this.flow_no = flow_no;
    }

    public String getMch_no() {
        return mch_no;
    }

    public void setMch_no(String mch_no) {
        this.mch_no = mch_no;
    }
}


