package com.rootls.manage.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by luowei on 2014/8/17.
 */
public class Res3FC031 implements Serializable {

    String mch_no;
    String mch_name;
    String curr_code;
    String curr_iden;

    List<Item3FC031>     array_3f031;

    public String getMch_no() {
        return mch_no;
    }

    public void setMch_no(String mch_no) {
        this.mch_no = mch_no;
    }

    public String getMch_name() {
        return mch_name;
    }

    public void setMch_name(String mch_name) {
        this.mch_name = mch_name;
    }

    public String getCurr_code() {
        return curr_code;
    }

    public void setCurr_code(String curr_code) {
        this.curr_code = curr_code;
    }

    public String getCurr_iden() {
        return curr_iden;
    }

    public void setCurr_iden(String curr_iden) {
        this.curr_iden = curr_iden;
    }

    public List<Item3FC031> getArray_3f031() {
        return array_3f031;
    }

    public void setArray_3f031(List<Item3FC031> array_3f031) {
        this.array_3f031 = array_3f031;
    }

    class Item3FC031 {
        String sit_no;
        String mbr_name;
        String fund_typ;
        String frz_flag;
        String dt;
        String tm;
        Double amt;
        String rmrk;
        String ctrt_no;

        public String getSit_no() {
            return sit_no;
        }

        public void setSit_no(String sit_no) {
            this.sit_no = sit_no;
        }

        public String getMbr_name() {
            return mbr_name;
        }

        public void setMbr_name(String mbr_name) {
            this.mbr_name = mbr_name;
        }

        public String getFund_typ() {
            return fund_typ;
        }

        public void setFund_typ(String fund_typ) {
            this.fund_typ = fund_typ;
        }

        public String getFrz_flag() {
            return frz_flag;
        }

        public void setFrz_flag(String frz_flag) {
            this.frz_flag = frz_flag;
        }

        public String getDt() {
            return dt;
        }

        public void setDt(String dt) {
            this.dt = dt;
        }

        public String getTm() {
            return tm;
        }

        public void setTm(String tm) {
            this.tm = tm;
        }

        public Double getAmt() {
            return amt;
        }

        public void setAmt(Double amt) {
            this.amt = amt;
        }

        public String getRmrk() {
            return rmrk;
        }

        public void setRmrk(String rmrk) {
            this.rmrk = rmrk;
        }

        public String getCtrt_no() {
            return ctrt_no;
        }

        public void setCtrt_no(String ctrt_no) {
            this.ctrt_no = ctrt_no;
        }
    }

}
