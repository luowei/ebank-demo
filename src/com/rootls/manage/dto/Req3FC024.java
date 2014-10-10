package com.rootls.manage.dto;

import java.io.Serializable;

/**
 * Created by luowei on 2014/8/17.
 */
public class Req3FC024 implements Serializable {

    String FUNC_CODE;
    String MCH_NO;
    String MCH_NAME;
    String BUYER_SIT_NO;
    String SELLER_SIT_NO;
    String CTRT_NO;
    String CTRT_AMT;
    String CTRT_TIME;
    String PAY_PRD_NO;
    String RMRK;

    public String getFUNC_CODE() {
        return FUNC_CODE;
    }

    public void setFUNC_CODE(String FUNC_CODE) {
        this.FUNC_CODE = FUNC_CODE;
    }

    public String getMCH_NO() {
        return MCH_NO;
    }

    public void setMCH_NO(String MCH_NO) {
        this.MCH_NO = MCH_NO;
    }

    public String getMCH_NAME() {
        return MCH_NAME;
    }

    public void setMCH_NAME(String MCH_NAME) {
        this.MCH_NAME = MCH_NAME;
    }

    public String getBUYER_SIT_NO() {
        return BUYER_SIT_NO;
    }

    public void setBUYER_SIT_NO(String BUYER_SIT_NO) {
        this.BUYER_SIT_NO = BUYER_SIT_NO;
    }

    public String getSELLER_SIT_NO() {
        return SELLER_SIT_NO;
    }

    public void setSELLER_SIT_NO(String SELLER_SIT_NO) {
        this.SELLER_SIT_NO = SELLER_SIT_NO;
    }

    public String getCTRT_NO() {
        return CTRT_NO;
    }

    public void setCTRT_NO(String CTRT_NO) {
        this.CTRT_NO = CTRT_NO;
    }

    public String getCTRT_AMT() {
        return CTRT_AMT;
    }

    public void setCTRT_AMT(String CTRT_AMT) {
        this.CTRT_AMT = CTRT_AMT;
    }

    public String getCTRT_TIME() {
        return CTRT_TIME;
    }

    public void setCTRT_TIME(String CTRT_TIME) {
        this.CTRT_TIME = CTRT_TIME;
    }

    public String getPAY_PRD_NO() {
        return PAY_PRD_NO;
    }

    public void setPAY_PRD_NO(String PAY_PRD_NO) {
        this.PAY_PRD_NO = PAY_PRD_NO;
    }

    public String getRMRK() {
        return RMRK;
    }

    public void setRMRK(String RMRK) {
        this.RMRK = RMRK;
    }
}
