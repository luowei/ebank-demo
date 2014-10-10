package com.rootls.manage.model;

import com.rootls.manage.dto.Req3FC001;

import java.io.Serializable;

/**
 * Created by luowei on 2014/8/15.
 */
public class Jh3FC001 implements Serializable {

    String corp_id;

    Req3FC001 req3FC001;

    public String getCorp_id() {
        return corp_id;
    }

    public void setCorp_id(String corp_id) {
        this.corp_id = corp_id;
    }

    public Req3FC001 getReq3FC001() {
        return req3FC001;
    }

    public void setReq3FC001(Req3FC001 req3FC001) {
        this.req3FC001 = req3FC001;
    }
}
