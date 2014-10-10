package com.rootls.manage.dto;

import java.io.Serializable;

/**
 * Created by luowei on 2014/8/17.
 */
public class Req3FC026 implements Serializable {
    String mch_no;
    String spot_sit_no;
    String future_sit_no;

    public String getMch_no() {
        return mch_no;
    }

    public void setMch_no(String mch_no) {
        this.mch_no = mch_no;
    }

    public String getSpot_sit_no() {
        return spot_sit_no;
    }

    public void setSpot_sit_no(String spot_sit_no) {
        this.spot_sit_no = spot_sit_no;
    }

    public String getFuture_sit_no() {
        return future_sit_no;
    }

    public void setFuture_sit_no(String future_sit_no) {
        this.future_sit_no = future_sit_no;
    }
}
