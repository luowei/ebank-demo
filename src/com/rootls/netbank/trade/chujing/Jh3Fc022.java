package com.rootls.netbank.trade.chujing;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by luowei on 2014/9/26.
 */
@Entity
@Table(name = "JH_3FC022", schema = "dbo", catalog = "netbank")
public class Jh3Fc022 {
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
    @Column(name = "FLOW_NO", nullable = false, insertable = true, updatable = true, length = 19)
    public String getFlowNo() {
        return flowNo;
    }

    public void setFlowNo(String flowNo) {
        this.flowNo = flowNo;
    }

    @Basic
    @Column(name = "DRAWEE_ACCT_NO", nullable = false, insertable = true, updatable = true, length = 28)
    public String getDraweeAcctNo() {
        return draweeAcctNo;
    }

    public void setDraweeAcctNo(String draweeAcctNo) {
        this.draweeAcctNo = draweeAcctNo;
    }

    @Basic
    @Column(name = "PAYEE_ACCT_NO", nullable = false, insertable = true, updatable = true, length = 32)
    public String getPayeeAcctNo() {
        return payeeAcctNo;
    }

    public void setPayeeAcctNo(String payeeAcctNo) {
        this.payeeAcctNo = payeeAcctNo;
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
    @Column(name = "OUT_AMT_SIT_NO", nullable = true, insertable = true, updatable = true, length = 15)
    public String getOutAmtSitNo() {
        return outAmtSitNo;
    }

    public void setOutAmtSitNo(String outAmtSitNo) {
        this.outAmtSitNo = outAmtSitNo;
    }

    @Basic
    @Column(name = "AUDIT_STS", nullable = true, insertable = true, updatable = true, length = 1)
    public String getAuditSts() {
        return auditSts;
    }

    public void setAuditSts(String auditSts) {
        this.auditSts = auditSts;
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
    @Column(name = "OUT_TX_LOG_NO", nullable = true, insertable = true, updatable = true, length = 19)
    public String getOutTxLogNo() {
        return outTxLogNo;
    }

    public void setOutTxLogNo(String outTxLogNo) {
        this.outTxLogNo = outTxLogNo;
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

        Jh3Fc022 jh3Fc022 = (Jh3Fc022) o;

        if (id != jh3Fc022.id) return false;
        if (auditSts != null ? !auditSts.equals(jh3Fc022.auditSts) : jh3Fc022.auditSts != null) return false;
        if (currCod != null ? !currCod.equals(jh3Fc022.currCod) : jh3Fc022.currCod != null) return false;
        if (draweeAcctNo != null ? !draweeAcctNo.equals(jh3Fc022.draweeAcctNo) : jh3Fc022.draweeAcctNo != null)
            return false;
        if (flowNo != null ? !flowNo.equals(jh3Fc022.flowNo) : jh3Fc022.flowNo != null) return false;
        if (mchNo != null ? !mchNo.equals(jh3Fc022.mchNo) : jh3Fc022.mchNo != null) return false;
        if (outAmtSitNo != null ? !outAmtSitNo.equals(jh3Fc022.outAmtSitNo) : jh3Fc022.outAmtSitNo != null)
            return false;
        if (outTxLogNo != null ? !outTxLogNo.equals(jh3Fc022.outTxLogNo) : jh3Fc022.outTxLogNo != null) return false;
        if (payeeAcctNo != null ? !payeeAcctNo.equals(jh3Fc022.payeeAcctNo) : jh3Fc022.payeeAcctNo != null)
            return false;
        if (rmrk != null ? !rmrk.equals(jh3Fc022.rmrk) : jh3Fc022.rmrk != null) return false;
        if (txAmt != null ? !txAmt.equals(jh3Fc022.txAmt) : jh3Fc022.txAmt != null) return false;
        if (txDt != null ? !txDt.equals(jh3Fc022.txDt) : jh3Fc022.txDt != null) return false;

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
