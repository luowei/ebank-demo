package com.rootls.manage.model;

import com.rootls.manage.dto.Req3FC002;
import com.rootls.manage.dto.Res3FC002;

import java.io.Serializable;

/**
 * Created by luowei on 2014/8/15.
 */
public class Jh3FC002 implements Serializable {
    Integer id;

    Req3FC002 req3FC002;

    Res3FC002 res3FC002;


    String tx_dt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Req3FC002 getReq3FC002() {
        return req3FC002;
    }

    public void setReq3FC002(Req3FC002 req3FC002) {
        this.req3FC002 = req3FC002;
    }

    public Res3FC002 getRes3FC002() {
        return res3FC002;
    }

    public void setRes3FC002(Res3FC002 res3FC002) {
        this.res3FC002 = res3FC002;
    }

    public String getTx_dt() {
        return tx_dt;
    }

    public void setTx_dt(String tx_dt) {
        this.tx_dt = tx_dt;
    }
}
