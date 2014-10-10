package com.rootls.manage.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by luowei on 2014/8/17.
 */
public class Res3FC006 implements Serializable {

    String mch_no;
    String mch_name;

    List<Item3FC006> array_3fc006;

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

    public List<Item3FC006> getArray_3fc006() {
        return array_3fc006;
    }

    public void setArray_3fc006(List<Item3FC006> array_3fc006) {
        this.array_3fc006 = array_3fc006;
    }

    class Item3FC006 implements Serializable {
        String acct_name62;
        String sit_no;
        String curr_cod;
        String curr_iden;
        Double acct_bal;
        Double avl_bal;
        Double stx_svc_frz_bal;
        Double stx_guar_frz_bal;
        Double supp_guar_frz_bal;

        public String getAcct_name62() {
            return acct_name62;
        }

        public void setAcct_name62(String acct_name62) {
            this.acct_name62 = acct_name62;
        }

        public String getSit_no() {
            return sit_no;
        }

        public void setSit_no(String sit_no) {
            this.sit_no = sit_no;
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

        public Double getAcct_bal() {
            return acct_bal;
        }

        public void setAcct_bal(Double acct_bal) {
            this.acct_bal = acct_bal;
        }

        public Double getAvl_bal() {
            return avl_bal;
        }

        public void setAvl_bal(Double avl_bal) {
            this.avl_bal = avl_bal;
        }

        public Double getStx_svc_frz_bal() {
            return stx_svc_frz_bal;
        }

        public void setStx_svc_frz_bal(Double stx_svc_frz_bal) {
            this.stx_svc_frz_bal = stx_svc_frz_bal;
        }

        public Double getStx_guar_frz_bal() {
            return stx_guar_frz_bal;
        }

        public void setStx_guar_frz_bal(Double stx_guar_frz_bal) {
            this.stx_guar_frz_bal = stx_guar_frz_bal;
        }

        public Double getSupp_guar_frz_bal() {
            return supp_guar_frz_bal;
        }

        public void setSupp_guar_frz_bal(Double supp_guar_frz_bal) {
            this.supp_guar_frz_bal = supp_guar_frz_bal;
        }
    }

}
