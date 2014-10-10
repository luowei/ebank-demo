package com.rootls.manage.dto;

import java.io.Serializable;

/**
 * Created by luowei on 2014/8/15.
 */
public class Res3FC017 implements Serializable {

    String result;
    String err_msg;
    String flow_no;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getErr_msg() {
        return err_msg;
    }

    public void setErr_msg(String err_msg) {
        this.err_msg = err_msg;
    }

    public String getFlow_no() {
        return flow_no;
    }

    public void setFlow_no(String flow_no) {
        this.flow_no = flow_no;
    }
}


