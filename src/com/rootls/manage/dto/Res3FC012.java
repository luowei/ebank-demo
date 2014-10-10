package com.rootls.manage.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by luowei on 2014/8/17.
 */
public class Res3FC012 implements Serializable {

    List<Item3FC012> array_3fc012;

    public List<Item3FC012> getArray_3fc012() {
        return array_3fc012;
    }

    public void setArray_3fc012(List<Item3FC012> array_3fc012) {
        this.array_3fc012 = array_3fc012;
    }

    class Item3FC012 implements Serializable {
        String mch_name;
        String buyer_sit_no;
        String seller_sit_no;
        String buyer_name;
        String seller_name;
        String ctrt_no;
        String pay_prd_no;
        Double ctrt_amt;
        Double buyer_svc_amt;
        Double seller_svc_amt;
        Double buyer_guar_pay_amt;
        Double seller_guar_pay_amt;
        String ctrt_time;
        String ctrt_remark;
        String pay_sts;
        String fin_flg;
        Double buyer_pay_unfrz_amt;
        Double seller_pay_unfrz_amt;
        Double buyer_svc_unfrz_amt;
        Double seller_svc_unfrz_amt;

        public String getMch_name() {
            return mch_name;
        }

        public void setMch_name(String mch_name) {
            this.mch_name = mch_name;
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

        public String getBuyer_name() {
            return buyer_name;
        }

        public void setBuyer_name(String buyer_name) {
            this.buyer_name = buyer_name;
        }

        public String getSeller_name() {
            return seller_name;
        }

        public void setSeller_name(String seller_name) {
            this.seller_name = seller_name;
        }

        public String getCtrt_no() {
            return ctrt_no;
        }

        public void setCtrt_no(String ctrt_no) {
            this.ctrt_no = ctrt_no;
        }

        public String getPay_prd_no() {
            return pay_prd_no;
        }

        public void setPay_prd_no(String pay_prd_no) {
            this.pay_prd_no = pay_prd_no;
        }

        public Double getCtrt_amt() {
            return ctrt_amt;
        }

        public void setCtrt_amt(Double ctrt_amt) {
            this.ctrt_amt = ctrt_amt;
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

        public Double getBuyer_guar_pay_amt() {
            return buyer_guar_pay_amt;
        }

        public void setBuyer_guar_pay_amt(Double buyer_guar_pay_amt) {
            this.buyer_guar_pay_amt = buyer_guar_pay_amt;
        }

        public Double getSeller_guar_pay_amt() {
            return seller_guar_pay_amt;
        }

        public void setSeller_guar_pay_amt(Double seller_guar_pay_amt) {
            this.seller_guar_pay_amt = seller_guar_pay_amt;
        }

        public String getCtrt_time() {
            return ctrt_time;
        }

        public void setCtrt_time(String ctrt_time) {
            this.ctrt_time = ctrt_time;
        }

        public String getCtrt_remark() {
            return ctrt_remark;
        }

        public void setCtrt_remark(String ctrt_remark) {
            this.ctrt_remark = ctrt_remark;
        }

        public String getPay_sts() {
            return pay_sts;
        }

        public void setPay_sts(String pay_sts) {
            this.pay_sts = pay_sts;
        }

        public String getFin_flg() {
            return fin_flg;
        }

        public void setFin_flg(String fin_flg) {
            this.fin_flg = fin_flg;
        }

        public Double getBuyer_pay_unfrz_amt() {
            return buyer_pay_unfrz_amt;
        }

        public void setBuyer_pay_unfrz_amt(Double buyer_pay_unfrz_amt) {
            this.buyer_pay_unfrz_amt = buyer_pay_unfrz_amt;
        }

        public Double getSeller_pay_unfrz_amt() {
            return seller_pay_unfrz_amt;
        }

        public void setSeller_pay_unfrz_amt(Double seller_pay_unfrz_amt) {
            this.seller_pay_unfrz_amt = seller_pay_unfrz_amt;
        }

        public Double getBuyer_svc_unfrz_amt() {
            return buyer_svc_unfrz_amt;
        }

        public void setBuyer_svc_unfrz_amt(Double buyer_svc_unfrz_amt) {
            this.buyer_svc_unfrz_amt = buyer_svc_unfrz_amt;
        }

        public Double getSeller_svc_unfrz_amt() {
            return seller_svc_unfrz_amt;
        }

        public void setSeller_svc_unfrz_amt(Double seller_svc_unfrz_amt) {
            this.seller_svc_unfrz_amt = seller_svc_unfrz_amt;
        }
    }

}
