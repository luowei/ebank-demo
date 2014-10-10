package com.rootls.manage.dto;

import java.io.Serializable;

/**
 * Created by luowei on 2014/8/17.
 */
public class Req3FC030 implements Serializable {

    String fund_typ;
    String frz_bal;
    String tx_dt;

    public String getFund_typ() {
        return fund_typ;
    }

    public void setFund_typ(String fund_typ) {
        this.fund_typ = fund_typ;
    }

    public String getFrz_bal() {
        return frz_bal;
    }

    public void setFrz_bal(String frz_bal) {
        this.frz_bal = frz_bal;
    }

    public String getTx_dt() {
        return tx_dt;
    }

    public void setTx_dt(String tx_dt) {
        this.tx_dt = tx_dt;
    }
}
