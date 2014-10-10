package com.rootls.manage.db;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Administrator on 2014/9/3.
 */
@Entity
@Table(name = "JH_3FC022", schema = "dbo", catalog = "netbank")
public class DB_Jh3Fc022 {
    private int id;
    private String mchNo;
    private String flowNo;
    private String draweeAcctNo;
    private String payeeAcctNo;
    private String currCod;
    private BigDecimal txAmt;
    private String outAmtSitNo;
    private String auditSts;
    private String rmrk;
    private String outTxLogNo;
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
    @Column(name = "FLOW_NO")
    public String getFlowNo() {
        return flowNo;
    }

    public void setFlowNo(String flowNo) {
        this.flowNo = flowNo;
    }

    @Basic
    @Column(name = "DRAWEE_ACCT_NO")
    public String getDraweeAcctNo() {
        return draweeAcctNo;
    }

    public void setDraweeAcctNo(String draweeAcctNo) {
        this.draweeAcctNo = draweeAcctNo;
    }

    @Basic
    @Column(name = "PAYEE_ACCT_NO")
    public String getPayeeAcctNo() {
        return payeeAcctNo;
    }

    public void setPayeeAcctNo(String payeeAcctNo) {
        this.payeeAcctNo = payeeAcctNo;
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
    @Column(name = "OUT_AMT_SIT_NO")
    public String getOutAmtSitNo() {
        return outAmtSitNo;
    }

    public void setOutAmtSitNo(String outAmtSitNo) {
        this.outAmtSitNo = outAmtSitNo;
    }

    @Basic
    @Column(name = "AUDIT_STS")
    public String getAuditSts() {
        return auditSts;
    }

    public void setAuditSts(String auditSts) {
        this.auditSts = auditSts;
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
    @Column(name = "OUT_TX_LOG_NO")
    public String getOutTxLogNo() {
        return outTxLogNo;
    }

    public void setOutTxLogNo(String outTxLogNo) {
        this.outTxLogNo = outTxLogNo;
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

        DB_Jh3Fc022 that = (DB_Jh3Fc022) o;

        if (id != that.id) return false;
        if (auditSts != null ? !auditSts.equals(that.auditSts) : that.auditSts != null) return false;
        if (currCod != null ? !currCod.equals(that.currCod) : that.currCod != null) return false;
        if (draweeAcctNo != null ? !draweeAcctNo.equals(that.draweeAcctNo) : that.draweeAcctNo != null) return false;
        if (flowNo != null ? !flowNo.equals(that.flowNo) : that.flowNo != null) return false;
        if (mchNo != null ? !mchNo.equals(that.mchNo) : that.mchNo != null) return false;
        if (outAmtSitNo != null ? !outAmtSitNo.equals(that.outAmtSitNo) : that.outAmtSitNo != null) return false;
        if (outTxLogNo != null ? !outTxLogNo.equals(that.outTxLogNo) : that.outTxLogNo != null) return false;
        if (payeeAcctNo != null ? !payeeAcctNo.equals(that.payeeAcctNo) : that.payeeAcctNo != null) return false;
        if (rmrk != null ? !rmrk.equals(that.rmrk) : that.rmrk != null) return false;
        if (txAmt != null ? !txAmt.equals(that.txAmt) : that.txAmt != null) return false;
        if (txDt != null ? !txDt.equals(that.txDt) : that.txDt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (mchNo != null ? mchNo.hashCode() : 0);
        result = 31 * result + (flowNo != null ? flowNo.hashCode() : 0);
        result = 31 * result + (draweeAcctNo != null ? draweeAcctNo.hashCode() : 0);
        result = 31 * result + (payeeAcctNo != null ? payeeAcctNo.hashCode() : 0);
        result = 31 * result + (currCod != null ? currCod.hashCode() : 0);
        result = 31 * result + (txAmt != null ? txAmt.hashCode() : 0);
        result = 31 * result + (outAmtSitNo != null ? outAmtSitNo.hashCode() : 0);
        result = 31 * result + (auditSts != null ? auditSts.hashCode() : 0);
        result = 31 * result + (rmrk != null ? rmrk.hashCode() : 0);
        result = 31 * result + (outTxLogNo != null ? outTxLogNo.hashCode() : 0);
        result = 31 * result + (txDt != null ? txDt.hashCode() : 0);
        return result;
    }
}
