package com.rootls.manage.dto;

import java.io.Serializable;

/**
 * Created by luowei on 2014/8/17.
 */
public class Res3FC030 implements Serializable {

   String  func_code                   ;
    String          mch_no               ;
    String sit_no                          ;
    String  fund_typ                        ;
    String curr_cod                           ;
    String  curr_iden                           ;
    Double tx_amt                                  ;
    String  rmrk                                     ;

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

    public String getFund_typ() {
        return fund_typ;
    }

    public void setFund_typ(String fund_typ) {
        this.fund_typ = fund_typ;
    }

    public String getCurr_cod() {
        return curr_cod;
    }

    public void setCurr_cod(String curr_cod) {
        this.curr_cod = curr_cod;
    }

    public String getCurr_iden() {
        return curr_iden;
    }

    public void setCurr_iden(String curr_iden) {
        this.curr_iden = curr_iden;
    }

    public Double getTx_amt() {
        return tx_amt;
    }

    public void setTx_amt(Double tx_amt) {
        this.tx_amt = tx_amt;
    }

    public String getRmrk() {
        return rmrk;
    }

    public void setRmrk(String rmrk) {
        this.rmrk = rmrk;
    }
}
