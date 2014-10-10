package com.rootls.manage.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by luowei on 2014/8/17.
 */
public class Res3FC007 implements Serializable {

    String mch_no;
    String mch_name;
    String inq_tm;

    List<Item3FC007> array_3fc007;

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

    public String getInq_tm() {
        return inq_tm;
    }

    public void setInq_tm(String inq_tm) {
        this.inq_tm = inq_tm;
    }

    public List<Item3FC007> getArray_3fc007() {
        return array_3fc007;
    }

    public void setArray_3fc007(List<Item3FC007> array_3fc007) {
        this.array_3fc007 = array_3fc007;
    }

    class Item3FC007 implements Serializable {
        String tx_dt;
        String tx_tm;
        String rmrk;
        String dscrp;
        String tx_amt_typ;
        String crdr_iden;
        Double tx_amt;
        Double acct_bal;
        String op_acct_no_32;
        String op_cust_name;
        String tx_log_no;
        String ctrt_no;
        String sit_no;
        String mbr_name;
        String curr_cod;
        String curr_iden;

        public String getTx_dt() {
            return tx_dt;
        }

        public void setTx_dt(String tx_dt) {
            this.tx_dt = tx_dt;
        }

        public String getTx_tm() {
            return tx_tm;
        }

        public void setTx_tm(String tx_tm) {
            this.tx_tm = tx_tm;
        }

        public String getRmrk() {
            return rmrk;
        }

        public void setRmrk(String rmrk) {
            this.rmrk = rmrk;
        }

        public String getDscrp() {
            return dscrp;
        }

        public void setDscrp(String dscrp) {
            this.dscrp = dscrp;
        }

        public String getTx_amt_typ() {
            return tx_amt_typ;
        }

        public void setTx_amt_typ(String tx_amt_typ) {
            this.tx_amt_typ = tx_amt_typ;
        }

        public String getCrdr_iden() {
            return crdr_iden;
        }

        public void setCrdr_iden(String crdr_iden) {
            this.crdr_iden = crdr_iden;
        }

        public Double getTx_amt() {
            return tx_amt;
        }

        public void setTx_amt(Double tx_amt) {
            this.tx_amt = tx_amt;
        }

        public Double getAcct_bal() {
            return acct_bal;
        }

        public void setAcct_bal(Double acct_bal) {
            this.acct_bal = acct_bal;
        }

        public String getOp_acct_no_32() {
            return op_acct_no_32;
        }

        public void setOp_acct_no_32(String op_acct_no_32) {
            this.op_acct_no_32 = op_acct_no_32;
        }

        public String getOp_cust_name() {
            return op_cust_name;
        }

        public void setOp_cust_name(String op_cust_name) {
            this.op_cust_name = op_cust_name;
        }

        public String getTx_log_no() {
            return tx_log_no;
        }

        public void setTx_log_no(String tx_log_no) {
            this.tx_log_no = tx_log_no;
        }

        public String getCtrt_no() {
            return ctrt_no;
        }

        public void setCtrt_no(String ctrt_no) {
            this.ctrt_no = ctrt_no;
        }

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
    }

}
