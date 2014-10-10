package com.rootls.manage.dto;

import java.io.Serializable;

/**
 * Created by luowei on 2014/8/17.
 */
public class Res3FC024 implements Serializable {

    String mch_name;
    String tx_dt;

    public String getMch_name() {
        return mch_name;
    }

    public void setMch_name(String mch_name) {
        this.mch_name = mch_name;
    }

    public String getTx_dt() {
        return tx_dt;
    }

    public void setTx_dt(String tx_dt) {
        this.tx_dt = tx_dt;
    }
}
