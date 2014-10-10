package com.rootls.manage.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by luowei on 2014/8/17.
 */
public class Req3FC103 implements Serializable {

    List<Item3FC103> array_3fc103;

    public List<Item3FC103> getArray_3fc103() {
        return array_3fc103;
    }

    public void setArray_3fc103(List<Item3FC103> array_3fc103) {
        this.array_3fc103 = array_3fc103;
    }

    class Item3FC103 {
        String tx_type;
        String mch_no;
        String buyer_sit_no;
        String seller_sit_no;
        String ctrt_no;
        Double tx_amt;
        String pay_prd_no;
        Double buyer_svc_amt;
        Double seller_svc_amt;
        Double buyer_pen_amt;
        Double seller_pen_amt;
        String curr_cod;
        String curr_iden;
        String tx_dt;
        String dscrp_cod;
        String dscrp_txt;
        String tx_log_no;
        String rmrk;

        public String getTx_type() {
            return tx_type;
        }

        public void setTx_type(String tx_type) {
            this.tx_type = tx_type;
        }

        public String getMch_no() {
            return mch_no;
        }

        public void setMch_no(String mch_no) {
            this.mch_no = mch_no;
        }

        public String getBuyer_sit_no() {
            return buyer_sit_no;
        }

        public void setBuyer_sit_no(String buyer_sit_no) {
            this.buyer_sit_no = buyer_sit_no;
        }

        public String getSeller_sit_no() {
            return seller_sit_no;
        }

        public void setSeller_sit_no(String seller_sit_no) {
            this.seller_sit_no = seller_sit_no;
        }

        public String getCtrt_no() {
            return ctrt_no;
        }

        public void setCtrt_no(String ctrt_no) {
            this.ctrt_no = ctrt_no;
        }

        public Double getTx_amt() {
            return tx_amt;
        }

        public void setTx_amt(Double tx_amt) {
            this.tx_amt = tx_amt;
        }

        public String getPay_prd_no() {
            return pay_prd_no;
        }

        public void setPay_prd_no(String pay_prd_no) {
            this.pay_prd_no = pay_prd_no;
        }

        public Double getBuyer_svc_amt() {
            return buyer_svc_amt;
        }

        public void setBuyer_svc_amt(Double buyer_svc_amt) {
            this.buyer_svc_amt = buyer_svc_amt;
        }

        public Double getSeller_svc_amt() {
            return seller_svc_amt;
        }

        public void setSeller_svc_amt(Double seller_svc_amt) {
            this.seller_svc_amt = seller_svc_amt;
        }

        public Double getBuyer_pen_amt() {
            return buyer_pen_amt;
        }

        public void setBuyer_pen_amt(Double buyer_pen_amt) {
            this.buyer_pen_amt = buyer_pen_amt;
        }

        public Double getSeller_pen_amt() {
            return seller_pen_amt;
        }

        public void setSeller_pen_amt(Double seller_pen_amt) {
            this.seller_pen_amt = seller_pen_amt;
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

        public String getTx_dt() {
            return tx_dt;
        }

        public void setTx_dt(String tx_dt) {
            this.tx_dt = tx_dt;
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

        public String getTx_log_no() {
            return tx_log_no;
        }

        public void setTx_log_no(String tx_log_no) {
            this.tx_log_no = tx_log_no;
        }

        public String getRmrk() {
            return rmrk;
        }

        public void setRmrk(String rmrk) {
            this.rmrk = rmrk;
        }
    }
}
