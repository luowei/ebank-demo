package com.rootls.netbank.trade.jiaoyi;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by luowei on 2014/9/26.
 */
@Entity
@Table(name = "JH_3FC010", schema = "dbo", catalog = "netbank")
public class Jh3Fc010 {
    private int id;
    private String mchNo;
    private String ctrtNo;
    private String payPrdNo;
    private String buyerSitNo;
    private String sellerSitNo;
    private BigDecimal txAmt;
    private String paySts;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
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
    @Column(name = "CTRT_NO", nullable = false, insertable = true, updatable = true, length = 20)
    public String getCtrtNo() {
        return ctrtNo;
    }

    public void setCtrtNo(String ctrtNo) {
        this.ctrtNo = ctrtNo;
    }

    @Basic
    @Column(name = "PAY_PRD_NO", nullable = false, insertable = true, updatable = true, length = 2)
    public String getPayPrdNo() {
        return payPrdNo;
    }

    public void setPayPrdNo(String payPrdNo) {
        this.payPrdNo = payPrdNo;
    }

    @Basic
    @Column(name = "BUYER_SIT_NO", nullable = true, insertable = true, updatable = true, length = 15)
    public String getBuyerSitNo() {
        return buyerSitNo;
    }

    public void setBuyerSitNo(String buyerSitNo) {
        this.buyerSitNo = buyerSitNo;
    }

    @Basic
    @Column(name = "SELLER_SIT_NO", nullable = true, insertable = true, updatable = true, length = 15)
    public String getSellerSitNo() {
        return sellerSitNo;
    }

    public void setSellerSitNo(String sellerSitNo) {
        this.sellerSitNo = sellerSitNo;
    }

    @Basic
    @Column(name = "TX_AMT", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getTxAmt() {
        return txAmt;
    }

    public void setTxAmt(BigDecimal txAmt) {
        this.txAmt = txAmt;
    }

    @Basic
    @Column(name = "PAY_STS", nullable = true, insertable = true, updatable = true, length = 1)
    public String getPaySts() {
        return paySts;
    }

    public void setPaySts(String paySts) {
        this.paySts = paySts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Jh3Fc010 jh3Fc010 = (Jh3Fc010) o;

        if (id != jh3Fc010.id) return false;
        if (buyerSitNo != null ? !buyerSitNo.equals(jh3Fc010.buyerSitNo) : jh3Fc010.buyerSitNo != null) return false;
        if (ctrtNo != null ? !ctrtNo.equals(jh3Fc010.ctrtNo) : jh3Fc010.ctrtNo != null) return false;
        if (mchNo != null ? !mchNo.equals(jh3Fc010.mchNo) : jh3Fc010.mchNo != null) return false;
        if (payPrdNo != null ? !payPrdNo.equals(jh3Fc010.payPrdNo) : jh3Fc010.payPrdNo != null) return false;
        if (paySts != null ? !paySts.equals(jh3Fc010.paySts) : jh3Fc010.paySts != null) return false;
        if (sellerSitNo != null ? !sellerSitNo.equals(jh3Fc010.sellerSitNo) : jh3Fc010.sellerSitNo != null)
            return false;
        if (txAmt != null ? !txAmt.equals(jh3Fc010.txAmt) : jh3Fc010.txAmt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (mchNo != null ? mchNo.hashCode() : 0);
        result = 31 * result + (ctrtNo != null ? ctrtNo.hashCode() : 0);
        result = 31 * result + (payPrdNo != null ? payPrdNo.hashCode() : 0);
        result = 31 * result + (buyerSitNo != null ? buyerSitNo.hashCode() : 0);
        result = 31 * result + (sellerSitNo != null ? sellerSitNo.hashCode() : 0);
        result = 31 * result + (txAmt != null ? txAmt.hashCode() : 0);
        result = 31 * result + (paySts != null ? paySts.hashCode() : 0);
        return result;
    }
}
