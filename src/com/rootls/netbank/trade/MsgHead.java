package com.rootls.netbank.trade;

/**
 * Created by luowei on 2014/9/24.
 */
public class MsgHead {

    String version="100";
    String type="0200";
    String chanl_no="30";
    String chanl_sub_no="3001";
    String chanl_date;
    String chanl_time;
    String ectip_date;
    String chanl_flow_no;
    String ectip_flow_no;
    String chanl_trad_no;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getChanl_no() {
        return chanl_no;
    }

    public void setChanl_no(String chanl_no) {
        this.chanl_no = chanl_no;
    }

    public String getChanl_sub_no() {
        return chanl_sub_no;
    }

    public void setChanl_sub_no(String chanl_sub_no) {
        this.chanl_sub_no = chanl_sub_no;
    }

    public String getChanl_date() {
        return chanl_date;
    }

    public void setChanl_date(String chanl_date) {
        this.chanl_date = chanl_date;
    }

    public String getChanl_time() {
        return chanl_time;
    }

    public void setChanl_time(String chanl_time) {
        this.chanl_time = chanl_time;
    }

    public String getEctip_date() {
        return ectip_date;
    }

    public void setEctip_date(String ectip_date) {
        this.ectip_date = ectip_date;
    }

    public String getChanl_flow_no() {
        return chanl_flow_no;
    }

    public void setChanl_flow_no(String chanl_flow_no) {
        this.chanl_flow_no = chanl_flow_no;
    }

    public String getEctip_flow_no() {
        return ectip_flow_no;
    }

    public void setEctip_flow_no(String ectip_flow_no) {
        this.ectip_flow_no = ectip_flow_no;
    }

    public String getChanl_trad_no() {
        return chanl_trad_no;
    }

    public void setChanl_trad_no(String chanl_trad_no) {
        this.chanl_trad_no = chanl_trad_no;
    }
}
