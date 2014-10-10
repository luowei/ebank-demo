package com.rootls.manage.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by luowei on 2014/8/17.
 */
public class Res3FC102 implements Serializable {

    List<Item3FC102> array_3fc102;

    public List<Item3FC102> getArray_3fc102() {
        return array_3fc102;
    }

    public void setArray_3fc102(List<Item3FC102> array_3fc102) {
        this.array_3fc102 = array_3fc102;
    }

    class Item3FC102 implements Serializable {
        String ctrt_no;
        String tx_type;
        String curr_cod;
        String curr_iden;
        Double tx_amt;
        String sit_no;
        String rmrk;
        String mch_no;
        Double in_out_amt_svc_totl;
        String tx_log_no;
        String dscrp_cod;
        String dscrp_txt;
        String tx_dt;

        public String getCtrt_no() {
            return ctrt_no;
        }

        public void setCtrt_no(String ctrt_no) {
            this.ctrt_no = ctrt_no;
        }

        public String getTx_type() {
            return tx_type;
        }

        public void setTx_type(String tx_type) {
            this.tx_type = tx_type;
        }

        public String getCurr_cod() {
            return curr_cod;
        }

        public void setCurr_cod(String curr_cod) {
            this.curr_cod = curr_cod;
        }

        public String getCurr_iden() {
            return curr_iden;
        }

        public void setCurr_iden(String curr_iden) {
            this.curr_iden = curr_iden;
        }

        public Double getTx_amt() {
            return tx_amt;
        }

        public void setTx_amt(Double tx_amt) {
            this.tx_amt = tx_amt;
        }

        public String getSit_no() {
            return sit_no;
        }

        public void setSit_no(String sit_no) {
            this.sit_no = sit_no;
        }

        public String getRmrk() {
            return rmrk;
        }

        public void setRmrk(String rmrk) {
            this.rmrk = rmrk;
        }

        public String getMch_no() {
            return mch_no;
        }

        public void setMch_no(String mch_no) {
            this.mch_no = mch_no;
        }

        public Double getIn_out_amt_svc_totl() {
            return in_out_amt_svc_totl;
        }

        public void setIn_out_amt_svc_totl(Double in_out_amt_svc_totl) {
            this.in_out_amt_svc_totl = in_out_amt_svc_totl;
        }

        public String getTx_log_no() {
            return tx_log_no;
        }

        public void setTx_log_no(String tx_log_no) {
            this.tx_log_no = tx_log_no;
        }

        public String getDscrp_cod() {
            return dscrp_cod;
        }

        public void setDscrp_cod(String dscrp_cod) {
            this.dscrp_cod = dscrp_cod;
        }

        public String getDscrp_txt() {
            return dscrp_txt;
        }

        public void setDscrp_txt(String dscrp_txt) {
            this.dscrp_txt = dscrp_txt;
        }

        public String getTx_dt() {
            return tx_dt;
        }

        public void setTx_dt(String tx_dt) {
            this.tx_dt = tx_dt;
        }
    }

}
