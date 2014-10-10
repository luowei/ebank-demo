package com.rootls.manage.model;

import com.rootls.manage.dto.Req3FC003;

import java.io.Serializable;

/**
 * Created by luowei on 2014/8/17.
 */
public class Jh3FC003 implements Serializable {

    Integer id;

    Req3FC003 req3FC003;

    String audit_sts;
    String out_tx_log_no;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Req3FC003 getReq3FC003() {
        return req3FC003;
    }

    public void setReq3FC003(Req3FC003 req3FC003) {
        this.req3FC003 = req3FC003;
    }

    public String getAudit_sts() {
        return audit_sts;
    }

    public void setAudit_sts(String audit_sts) {
        this.audit_sts = audit_sts;
    }

    public String getOut_tx_log_no() {
        return out_tx_log_no;
    }

    public void setOut_tx_log_no(String out_tx_log_no) {
        this.out_tx_log_no = out_tx_log_no;
    }
}
