package com.rootls.manage.dto;

import java.io.Serializable;

/**
 * Created by luowei on 2014/8/17.
 */
public class Res3FC002 implements Serializable {
    String mch_no;
    String mch_name;
    String mbr_no;
    String mbr_name;
    Double in_amt_svc_totl;
    String in_tx_log_no;

    public String getMch_no() {
        return mch_no;
    }

    public void setMch_no(String mch_no) {
        this.mch_no = mch_no;
    }

    public String getMch_name() {
        return mch_name;
    }

    public void setMch_name(String mch_name) {
        this.mch_name = mch_name;
    }

    public String getMbr_no() {
        return mbr_no;
    }

    public void setMbr_no(String mbr_no) {
        this.mbr_no = mbr_no;
    }

    public String getMbr_name() {
        return mbr_name;
    }

    public void setMbr_name(String mbr_name) {
        this.mbr_name = mbr_name;
    }

    public Double getIn_amt_svc_totl() {
        return in_amt_svc_totl;
    }

    public void setIn_amt_svc_totl(Double in_amt_svc_totl) {
        this.in_amt_svc_totl = in_amt_svc_totl;
    }

    public String getIn_tx_log_no() {
        return in_tx_log_no;
    }

    public void setIn_tx_log_no(String in_tx_log_no) {
        this.in_tx_log_no = in_tx_log_no;
    }
}
