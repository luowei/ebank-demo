package com.rootls.manage.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by luowei on 2014/8/17.
 */
public class Res3FC101 implements Serializable {

    List<Item3FC101> array_3fc101;

    public List<Item3FC101> getArray_3fc101() {
        return array_3fc101;
    }

    public void setArray_3fc101(List<Item3FC101> array_3fc101) {
        this.array_3fc101 = array_3fc101;
    }

    class Item3FC101 implements Serializable {
        String mch_drw_svc_flg;
        String tx_type;
        String mch_no;
        String mbr_cert_type;
        String mbr_cert_no;
        String spot_sit_no;
        String future_sit_no;
        String mbr_spe_zh;
        String mbr_spe_acct_bkid;
        String mbr_contact;
        String mbr_phone_num;
        String mbr_addr;
        String mbr_sts;
        String mbr_no;
        String tx_dt;

        public String getMch_drw_svc_flg() {
            return mch_drw_svc_flg;
        }

        public void setMch_drw_svc_flg(String mch_drw_svc_flg) {
            this.mch_drw_svc_flg = mch_drw_svc_flg;
        }

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

        public String getMbr_cert_type() {
            return mbr_cert_type;
        }

        public void setMbr_cert_type(String mbr_cert_type) {
            this.mbr_cert_type = mbr_cert_type;
        }

        public String getMbr_cert_no() {
            return mbr_cert_no;
        }

        public void setMbr_cert_no(String mbr_cert_no) {
            this.mbr_cert_no = mbr_cert_no;
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

        public String getMbr_spe_zh() {
            return mbr_spe_zh;
        }

        public void setMbr_spe_zh(String mbr_spe_zh) {
            this.mbr_spe_zh = mbr_spe_zh;
        }

        public String getMbr_spe_acct_bkid() {
            return mbr_spe_acct_bkid;
        }

        public void setMbr_spe_acct_bkid(String mbr_spe_acct_bkid) {
            this.mbr_spe_acct_bkid = mbr_spe_acct_bkid;
        }

        public String getMbr_contact() {
            return mbr_contact;
        }

        public void setMbr_contact(String mbr_contact) {
            this.mbr_contact = mbr_contact;
        }

        public String getMbr_phone_num() {
            return mbr_phone_num;
        }

        public void setMbr_phone_num(String mbr_phone_num) {
            this.mbr_phone_num = mbr_phone_num;
        }

        public String getMbr_addr() {
            return mbr_addr;
        }

        public void setMbr_addr(String mbr_addr) {
            this.mbr_addr = mbr_addr;
        }

        public String getMbr_sts() {
            return mbr_sts;
        }

        public void setMbr_sts(String mbr_sts) {
            this.mbr_sts = mbr_sts;
        }

        public String getMbr_no() {
            return mbr_no;
        }

        public void setMbr_no(String mbr_no) {
            this.mbr_no = mbr_no;
        }

        public String getTx_dt() {
            return tx_dt;
        }

        public void setTx_dt(String tx_dt) {
            this.tx_dt = tx_dt;
        }
    }

}
