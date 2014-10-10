package com.rootls.manage.dto;

import java.io.Serializable;

/**
 * Created by luowei on 2014/8/17.
 */
public class Req3FC002 implements Serializable {

    String mch_no;
    String curr_cod;
    Double tx_amt;
    String in_amt_sit_no;
    String rmrk;

    public String getMch_no() {
        return mch_no;
    }

    public void setMch_no(String mch_no) {
        this.mch_no = mch_no;
    }

    public String getCurr_cod() {
        return curr_cod;
    }

    public void setCurr_cod(String curr_cod) {
        this.curr_cod = curr_cod;
    }

    public Double getTx_amt() {
        return tx_amt;
    }

    public void setTx_amt(Double tx_amt) {
        this.tx_amt = tx_amt;
    }

    public String getIn_amt_sit_no() {
        return in_amt_sit_no;
    }

    public void setIn_amt_sit_no(String in_amt_sit_no) {
        this.in_amt_sit_no = in_amt_sit_no;
    }

    public String getRmrk() {
        return rmrk;
    }

    public void setRmrk(String rmrk) {
        this.rmrk = rmrk;
    }
}
