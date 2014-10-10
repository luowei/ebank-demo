package com.rootls.netbank.trade.rujing;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by luowei on 2014/9/26.
 */
@Entity
@Table(name = "JH_3FC002", schema = "dbo", catalog = "netbank")
public class Jh3Fc002 {
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "MCH_NO", nullable = false, insertable = true, updatable = true, length = 10)
    public String getMchNo() {
        return mchNo;
    }

    public void setMchNo(String mchNo) {
        this.mchNo = mchNo;
    }

    @Basic
    @Column(name = "CURR_COD", nullable = false, insertable = true, updatable = true, length = 2)
    public String getCurrCod() {
        return currCod;
    }

    public void setCurrCod(String currCod) {
        this.currCod = currCod;
    }

    @Basic
    @Column(name = "TX_AMT", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getTxAmt() {
        return txAmt;
    }

    public void setTxAmt(BigDecimal txAmt) {
        this.txAmt = txAmt;
    }

    @Basic
    @Column(name = "IN_AMT_SIT_NO", nullable = false, insertable = true, updatable = true, length = 15)
    public String getInAmtSitNo() {
        return inAmtSitNo;
    }

    public void setInAmtSitNo(String inAmtSitNo) {
        this.inAmtSitNo = inAmtSitNo;
    }

    @Basic
    @Column(name = "RMRK", nullable = true, insertable = true, updatable = true, length = 40)
    public String getRmrk() {
        return rmrk;
    }

    public void setRmrk(String rmrk) {
        this.rmrk = rmrk;
    }

    @Basic
    @Column(name = "MCH_NAME", nullable = true, insertable = true, updatable = true, length = 62)
    public String getMchName() {
        return mchName;
    }

    public void setMchName(String mchName) {
        this.mchName = mchName;
    }

    @Basic
    @Column(name = "MBR_NO", nullable = true, insertable = true, updatable = true, length = 10)
    public String getMbrNo() {
        return mbrNo;
    }

    public void setMbrNo(String mbrNo) {
        this.mbrNo = mbrNo;
    }

    @Basic
    @Column(name = "MBR_NAME", nullable = true, insertable = true, updatable = true, length = 62)
    public String getMbrName() {
        return mbrName;
    }

    public void setMbrName(String mbrName) {
        this.mbrName = mbrName;
    }

    @Basic
    @Column(name = "IN_AMT_SVC_TOTL", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getInAmtSvcTotl() {
        return inAmtSvcTotl;
    }

    public void setInAmtSvcTotl(BigDecimal inAmtSvcTotl) {
        this.inAmtSvcTotl = inAmtSvcTotl;
    }

    @Basic
    @Column(name = "IN_TX_LOG_NO", nullable = true, insertable = true, updatable = true, length = 19)
    public String getInTxLogNo() {
        return inTxLogNo;
    }

    public void setInTxLogNo(String inTxLogNo) {
        this.inTxLogNo = inTxLogNo;
    }

    @Basic
    @Column(name = "TX_DT", nullable = true, insertable = true, updatable = true, length = 8)
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

        Jh3Fc002 jh3Fc002 = (Jh3Fc002) o;

        if (id != jh3Fc002.id) return false;
        if (currCod != null ? !currCod.equals(jh3Fc002.currCod) : jh3Fc002.currCod != null) return false;
        if (inAmtSitNo != null ? !inAmtSitNo.equals(jh3Fc002.inAmtSitNo) : jh3Fc002.inAmtSitNo != null) return false;
        if (inAmtSvcTotl != null ? !inAmtSvcTotl.equals(jh3Fc002.inAmtSvcTotl) : jh3Fc002.inAmtSvcTotl != null)
            return false;
        if (inTxLogNo != null ? !inTxLogNo.equals(jh3Fc002.inTxLogNo) : jh3Fc002.inTxLogNo != null) return false;
        if (mbrName != null ? !mbrName.equals(jh3Fc002.mbrName) : jh3Fc002.mbrName != null) return false;
        if (mbrNo != null ? !mbrNo.equals(jh3Fc002.mbrNo) : jh3Fc002.mbrNo != null) return false;
        if (mchName != null ? !mchName.equals(jh3Fc002.mchName) : jh3Fc002.mchName != null) return false;
        if (mchNo != null ? !mchNo.equals(jh3Fc002.mchNo) : jh3Fc002.mchNo != null) return false;
        if (rmrk != null ? !rmrk.equals(jh3Fc002.rmrk) : jh3Fc002.rmrk != null) return false;
        if (txAmt != null ? !txAmt.equals(jh3Fc002.txAmt) : jh3Fc002.txAmt != null) return false;
        if (txDt != null ? !txDt.equals(jh3Fc002.txDt) : jh3Fc002.txDt != null) return false;

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
