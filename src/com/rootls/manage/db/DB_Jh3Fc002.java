package com.rootls.manage.db;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Administrator on 2014/9/3.
 */
@Entity
@Table(name = "JH_3FC002", schema = "dbo", catalog = "netbank")
public class DB_Jh3Fc002 {
    private int id;
    private String mchNo;
    private String currCod;
    private BigDecimal txAmt;
    private String inAmtSitNo;
    private String rmrk;
    private String mchName;
    private String mbrNo;
    private String mbrName;
    private BigDecimal inAmtSvcTotl;
    private String inTxLogNo;
    private String txDt;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "MCH_NO")
    public String getMchNo() {
        return mchNo;
    }

    public void setMchNo(String mchNo) {
        this.mchNo = mchNo;
    }

    @Basic
    @Column(name = "CURR_COD")
    public String getCurrCod() {
        return currCod;
    }

    public void setCurrCod(String currCod) {
        this.currCod = currCod;
    }

    @Basic
    @Column(name = "TX_AMT")
    public BigDecimal getTxAmt() {
        return txAmt;
    }

    public void setTxAmt(BigDecimal txAmt) {
        this.txAmt = txAmt;
    }

    @Basic
    @Column(name = "IN_AMT_SIT_NO")
    public String getInAmtSitNo() {
        return inAmtSitNo;
    }

    public void setInAmtSitNo(String inAmtSitNo) {
        this.inAmtSitNo = inAmtSitNo;
    }

    @Basic
    @Column(name = "RMRK")
    public String getRmrk() {
        return rmrk;
    }

    public void setRmrk(String rmrk) {
        this.rmrk = rmrk;
    }

    @Basic
    @Column(name = "MCH_NAME")
    public String getMchName() {
        return mchName;
    }

    public void setMchName(String mchName) {
        this.mchName = mchName;
    }

    @Basic
    @Column(name = "MBR_NO")
    public String getMbrNo() {
        return mbrNo;
    }

    public void setMbrNo(String mbrNo) {
        this.mbrNo = mbrNo;
    }

    @Basic
    @Column(name = "MBR_NAME")
    public String getMbrName() {
        return mbrName;
    }

    public void setMbrName(String mbrName) {
        this.mbrName = mbrName;
    }

    @Basic
    @Column(name = "IN_AMT_SVC_TOTL")
    public BigDecimal getInAmtSvcTotl() {
        return inAmtSvcTotl;
    }

    public void setInAmtSvcTotl(BigDecimal inAmtSvcTotl) {
        this.inAmtSvcTotl = inAmtSvcTotl;
    }

    @Basic
    @Column(name = "IN_TX_LOG_NO")
    public String getInTxLogNo() {
        return inTxLogNo;
    }

    public void setInTxLogNo(String inTxLogNo) {
        this.inTxLogNo = inTxLogNo;
    }

    @Basic
    @Column(name = "TX_DT")
    public String getTxDt() {
        return txDt;
    }

    public void setTxDt(String txDt) {
        this.txDt = txDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DB_Jh3Fc002 that = (DB_Jh3Fc002) o;

        if (id != that.id) return false;
        if (currCod != null ? !currCod.equals(that.currCod) : that.currCod != null) return false;
        if (inAmtSitNo != null ? !inAmtSitNo.equals(that.inAmtSitNo) : that.inAmtSitNo != null) return false;
        if (inAmtSvcTotl != null ? !inAmtSvcTotl.equals(that.inAmtSvcTotl) : that.inAmtSvcTotl != null) return false;
        if (inTxLogNo != null ? !inTxLogNo.equals(that.inTxLogNo) : that.inTxLogNo != null) return false;
        if (mbrName != null ? !mbrName.equals(that.mbrName) : that.mbrName != null) return false;
        if (mbrNo != null ? !mbrNo.equals(that.mbrNo) : that.mbrNo != null) return false;
        if (mchName != null ? !mchName.equals(that.mchName) : that.mchName != null) return false;
        if (mchNo != null ? !mchNo.equals(that.mchNo) : that.mchNo != null) return false;
        if (rmrk != null ? !rmrk.equals(that.rmrk) : that.rmrk != null) return false;
        if (txAmt != null ? !txAmt.equals(that.txAmt) : that.txAmt != null) return false;
        if (txDt != null ? !txDt.equals(that.txDt) : that.txDt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (mchNo != null ? mchNo.hashCode() : 0);
        result = 31 * result + (currCod != null ? currCod.hashCode() : 0);
        result = 31 * result + (txAmt != null ? txAmt.hashCode() : 0);
        result = 31 * result + (inAmtSitNo != null ? inAmtSitNo.hashCode() : 0);
        result = 31 * result + (rmrk != null ? rmrk.hashCode() : 0);
        result = 31 * result + (mchName != null ? mchName.hashCode() : 0);
        result = 31 * result + (mbrNo != null ? mbrNo.hashCode() : 0);
        result = 31 * result + (mbrName != null ? mbrName.hashCode() : 0);
        result = 31 * result + (inAmtSvcTotl != null ? inAmtSvcTotl.hashCode() : 0);
        result = 31 * result + (inTxLogNo != null ? inTxLogNo.hashCode() : 0);
        result = 31 * result + (txDt != null ? txDt.hashCode() : 0);
        return result;
    }
}
