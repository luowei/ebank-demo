package com.rootls.manage.dto;

import java.io.Serializable;

/**
 * Created by luowei on 2014/8/15.
 */
public class Res3FC011 implements Serializable {

    String mch_name;
    String buy_mbr_name;
    String sell_mbr_name;
    String tx_dt;

    public String getMch_name() {
        return mch_name;
    }

    public void setMch_name(String mch_name) {
        this.mch_name = mch_name;
    }

    public String getBuy_mbr_name() {
        return buy_mbr_name;
    }

    public void setBuy_mbr_name(String buy_mbr_name) {
        this.buy_mbr_name = buy_mbr_name;
    }

    public String getSell_mbr_name() {
        return sell_mbr_name;
    }

    public void setSell_mbr_name(String sell_mbr_name) {
        this.sell_mbr_name = sell_mbr_name;
    }

    public String getTx_dt() {
        return tx_dt;
    }

    public void setTx_dt(String tx_dt) {
        this.tx_dt = tx_dt;
    }
}


