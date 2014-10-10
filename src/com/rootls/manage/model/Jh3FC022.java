package com.rootls.manage.model;

import com.rootls.manage.dto.Req3FC022;
import com.rootls.manage.dto.Res3FC022;

import java.io.Serializable;

/**
 * Created by luowei on 2014/8/15.
 */
public class Jh3FC022 implements Serializable {
    Integer id;

    Req3FC022 req3FC022;

    Res3FC022 res3FC022;

    String tx_dt;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Req3FC022 getReq3FC022() {
        return req3FC022;
    }

    public void setReq3FC022(Req3FC022 req3FC022) {
        this.req3FC022 = req3FC022;
    }

    public Res3FC022 getRes3FC022() {
        return res3FC022;
    }

    public void setRes3FC022(Res3FC022 res3FC022) {
        this.res3FC022 = res3FC022;
    }

    public String getTx_dt() {
        return tx_dt;
    }

    public void setTx_dt(String tx_dt) {
        this.tx_dt = tx_dt;
    }
}
