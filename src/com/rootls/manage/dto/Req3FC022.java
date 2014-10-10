package com.rootls.manage.dto;

import java.io.Serializable;

/**
 * Created by luowei on 2014/8/17.
 */
public class Req3FC022 implements Serializable {
    String mch_no;
    String flow_no;
    String drawee_acct_no;
    String payee_acct_no;
    String curr_cod;
    Double tx_amt;
    String out_amt_sit_no;
    String audit_sts;
    String rmrk;

    public String getMch_no() {
        return mch_no;
    }

    public void setMch_no(String mch_no) {
        this.mch_no = mch_no;
    }

    public String getFlow_no() {
        return flow_no;
    }

    public void setFlow_no(String flow_no) {
        this.flow_no = flow_no;
    }

    public String getDrawee_acct_no() {
        return drawee_acct_no;
    }

    public void setDrawee_acct_no(String drawee_acct_no) {
        this.drawee_acct_no = drawee_acct_no;
    }

    public String getPayee_acct_no() {
        return payee_acct_no;
    }

    public void setPayee_acct_no(String payee_acct_no) {
        this.payee_acct_no = payee_acct_no;
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

    public String getOut_amt_sit_no() {
        return out_amt_sit_no;
    }

    public void setOut_amt_sit_no(String out_amt_sit_no) {
        this.out_amt_sit_no = out_amt_sit_no;
    }

    public String getAudit_sts() {
        return audit_sts;
    }

    public void setAudit_sts(String audit_sts) {
        this.audit_sts = audit_sts;
    }

    public String getRmrk() {
        return rmrk;
    }

    public void setRmrk(String rmrk) {
        this.rmrk = rmrk;
    }
}
