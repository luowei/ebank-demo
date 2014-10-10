package com.rootls.netbank.trade.jiaoyi;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by luowei on 2014/9/26.
 */
@Entity
@javax.persistence.Table(name = "JH_3FC011", schema = "dbo", catalog = "netbank")
public class Jh3Fc011 {
    private int id;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @javax.persistence.Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String mchNo;

    @Basic
    @javax.persistence.Column(name = "MCH_NO", nullable = false, insertable = true, updatable = true, length = 10)
    public String getMchNo() {
        return mchNo;
    }

    public void setMchNo(String mchNo) {
        this.mchNo = mchNo;
    }

    private String buyerSitNo;

    @Basic
    @javax.persistence.Column(name = "BUYER_SIT_NO", nullable = false, insertable = true, updatable = true, length = 15)
    public String getBuyerSitNo() {
        return buyerSitNo;
    }

    public void setBuyerSitNo(String buyerSitNo) {
        this.buyerSitNo = buyerSitNo;
    }

    private String sellerSitNo;

    @Basic
    @javax.persistence.Column(name = "SELLER_SIT_NO", nullable = false, insertable = true, updatable = true, length = 15)
    public String getSellerSitNo() {
        return sellerSitNo;
    }

    public void setSellerSitNo(String sellerSitNo) {
        this.sellerSitNo = sellerSitNo;
    }

    private String ctrtNo;

    @Basic
    @javax.persistence.Column(name = "CTRT_NO", nullable = false, insertable = true, updatable = true, length = 20)
    public String getCtrtNo() {
        return ctrtNo;
    }

    public void setCtrtNo(String ctrtNo) {
        this.ctrtNo = ctrtNo;
    }

    private String payPrdNo;

    @Basic
    @javax.persistence.Column(name = "PAY_PRD_NO", nullable = false, insertable = true, updatable = true, length = 2)
    public String getPayPrdNo() {
        return payPrdNo;
    }

    public void setPayPrdNo(String payPrdNo) {
        this.payPrdNo = payPrdNo;
    }

    private BigDecimal buyerPenAmt;

    @Basic
    @javax.persistence.Column(name = "BUYER_PEN_AMT", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getBuyerPenAmt() {
        return buyerPenAmt;
    }

    public void setBuyerPenAmt(BigDecimal buyerPenAmt) {
        this.buyerPenAmt = buyerPenAmt;
    }

    private BigDecimal sellerPenAmt;

    @Basic
    @javax.persistence.Column(name = "SELLER_PEN_AMT", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getSellerPenAmt() {
        return sellerPenAmt;
    }

    public void setSellerPenAmt(BigDecimal sellerPenAmt) {
        this.sellerPenAmt = sellerPenAmt;
    }

    private BigDecimal buyerSvcAmt;

    @Basic
    @javax.persistence.Column(name = "BUYER_SVC_AMT", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getBuyerSvcAmt() {
        return buyerSvcAmt;
    }

    public void setBuyerSvcAmt(BigDecimal buyerSvcAmt) {
        this.buyerSvcAmt = buyerSvcAmt;
    }

    private BigDecimal sellerSvcAmt;

    @Basic
    @javax.persistence.Column(name = "SELLER_SVC_AMT", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getSellerSvcAmt() {
        return sellerSvcAmt;
    }

    public void setSellerSvcAmt(BigDecimal sellerSvcAmt) {
        this.sellerSvcAmt = sellerSvcAmt;
    }

    private String currCod;

    @Basic
    @javax.persistence.Column(name = "CURR_COD", nullable = false, insertable = true, updatable = true, length = 2)
    public String getCurrCod() {
        return currCod;
    }

    public void setCurrCod(String currCod) {
        this.currCod = currCod;
    }

    private String rmrk;

    @Basic
    @javax.persistence.Column(name = "RMRK", nullable = true, insertable = true, updatable = true, length = 40)
    public String getRmrk() {
        return rmrk;
    }

    public void setRmrk(String rmrk) {
        this.rmrk = rmrk;
    }

    private BigDecimal buyerPayUnfrzAmt;

    @Basic
    @javax.persistence.Column(name = "BUYER_PAY_UNFRZ_AMT", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getBuyerPayUnfrzAmt() {
        return buyerPayUnfrzAmt;
    }

    public void setBuyerPayUnfrzAmt(BigDecimal buyerPayUnfrzAmt) {
        this.buyerPayUnfrzAmt = buyerPayUnfrzAmt;
    }

    private BigDecimal sellerPayUnfrzAmt;

    @Basic
    @javax.persistence.Column(name = "SELLER_PAY_UNFRZ_AMT", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getSellerPayUnfrzAmt() {
        return sellerPayUnfrzAmt;
    }

    public void setSellerPayUnfrzAmt(BigDecimal sellerPayUnfrzAmt) {
        this.sellerPayUnfrzAmt = sellerPayUnfrzAmt;
    }

    private BigDecimal buyerSvcUnfrzAmt;

    @Basic
    @javax.persistence.Column(name = "BUYER_SVC_UNFRZ_AMT", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getBuyerSvcUnfrzAmt() {
        return buyerSvcUnfrzAmt;
    }

    public void setBuyerSvcUnfrzAmt(BigDecimal buyerSvcUnfrzAmt) {
        this.buyerSvcUnfrzAmt = buyerSvcUnfrzAmt;
    }

    private BigDecimal sellerSvcUnfrzAmt;

    @Basic
    @javax.persistence.Column(name = "SELLER_SVC_UNFRZ_AMT", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getSellerSvcUnfrzAmt() {
        return sellerSvcUnfrzAmt;
    }

    public void setSellerSvcUnfrzAmt(BigDecimal sellerSvcUnfrzAmt) {
        this.sellerSvcUnfrzAmt = sellerSvcUnfrzAmt;
    }

    private String mchName;

    @Basic
    @javax.persistence.Column(name = "MCH_NAME", nullable = true, insertable = true, updatable = true, length = 62)
    public String getMchName() {
        return mchName;
    }

    public void setMchName(String mchName) {
        this.mchName = mchName;
    }

    private String buyMbrName;

    @Basic
    @javax.persistence.Column(name = "BUY_MBR_NAME", nullable = true, insertable = true, updatable = true, length = 62)
    public String getBuyMbrName() {
        return buyMbrName;
    }

    public void setBuyMbrName(String buyMbrName) {
        this.buyMbrName = buyMbrName;
    }

    private String sellMbrName;

    @Basic
    @javax.persistence.Column(name = "SELL_MBR_NAME", nullable = true, insertable = true, updatable = true, length = 62)
    public String getSellMbrName() {
        return sellMbrName;
    }

    public void setSellMbrName(String sellMbrName) {
        this.sellMbrName = sellMbrName;
    }

    private String txDt;

    @Basic
    @javax.persistence.Column(name = "TX_DT", nullable = true, insertable = true, updatable = true, length = 8)
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

        Jh3Fc011 jh3Fc011 = (Jh3Fc011) o;

        if (id != jh3Fc011.id) return false;
        if (buyMbrName != null ? !buyMbrName.equals(jh3Fc011.buyMbrName) : jh3Fc011.buyMbrName != null) return false;
        if (buyerPayUnfrzAmt != null ? !buyerPayUnfrzAmt.equals(jh3Fc011.buyerPayUnfrzAmt) : jh3Fc011.buyerPayUnfrzAmt != null)
            return false;
        if (buyerPenAmt != null ? !buyerPenAmt.equals(jh3Fc011.buyerPenAmt) : jh3Fc011.buyerPenAmt != null)
            return false;
        if (buyerSitNo != null ? !buyerSitNo.equals(jh3Fc011.buyerSitNo) : jh3Fc011.buyerSitNo != null) return false;
        if (buyerSvcAmt != null ? !buyerSvcAmt.equals(jh3Fc011.buyerSvcAmt) : jh3Fc011.buyerSvcAmt != null)
            return false;
        if (buyerSvcUnfrzAmt != null ? !buyerSvcUnfrzAmt.equals(jh3Fc011.buyerSvcUnfrzAmt) : jh3Fc011.buyerSvcUnfrzAmt != null)
            return false;
        if (ctrtNo != null ? !ctrtNo.equals(jh3Fc011.ctrtNo) : jh3Fc011.ctrtNo != null) return false;
        if (currCod != null ? !currCod.equals(jh3Fc011.currCod) : jh3Fc011.currCod != null) return false;
        if (mchName != null ? !mchName.equals(jh3Fc011.mchName) : jh3Fc011.mchName != null) return false;
        if (mchNo != null ? !mchNo.equals(jh3Fc011.mchNo) : jh3Fc011.mchNo != null) return false;
        if (payPrdNo != null ? !payPrdNo.equals(jh3Fc011.payPrdNo) : jh3Fc011.payPrdNo != null) return false;
        if (rmrk != null ? !rmrk.equals(jh3Fc011.rmrk) : jh3Fc011.rmrk != null) return false;
        if (sellMbrName != null ? !sellMbrName.equals(jh3Fc011.sellMbrName) : jh3Fc011.sellMbrName != null)
            return false;
        if (sellerPayUnfrzAmt != null ? !sellerPayUnfrzAmt.equals(jh3Fc011.sellerPayUnfrzAmt) : jh3Fc011.sellerPayUnfrzAmt != null)
            return false;
        if (sellerPenAmt != null ? !sellerPenAmt.equals(jh3Fc011.sellerPenAmt) : jh3Fc011.sellerPenAmt != null)
            return false;
        if (sellerSitNo != null ? !sellerSitNo.equals(jh3Fc011.sellerSitNo) : jh3Fc011.sellerSitNo != null)
            return false;
        if (sellerSvcAmt != null ? !sellerSvcAmt.equals(jh3Fc011.sellerSvcAmt) : jh3Fc011.sellerSvcAmt != null)
            return false;
        if (sellerSvcUnfrzAmt != null ? !sellerSvcUnfrzAmt.equals(jh3Fc011.sellerSvcUnfrzAmt) : jh3Fc011.sellerSvcUnfrzAmt != null)
            return false;
        if (txDt != null ? !txDt.equals(jh3Fc011.txDt) : jh3Fc011.txDt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (mchNo != null ? mchNo.hashCode() : 0);
        result = 31 * result + (buyerSitNo != null ? buyerSitNo.hashCode() : 0);
        result = 31 * result + (sellerSitNo != null ? sellerSitNo.hashCode() : 0);
        result = 31 * result + (ctrtNo != null ? ctrtNo.hashCode() : 0);
        result = 31 * result + (payPrdNo != null ? payPrdNo.hashCode() : 0);
        result = 31 * result + (buyerPenAmt != null ? buyerPenAmt.hashCode() : 0);
        result = 31 * result + (sellerPenAmt != null ? sellerPenAmt.hashCode() : 0);
        result = 31 * result + (buyerSvcAmt != null ? buyerSvcAmt.hashCode() : 0);
        result = 31 * result + (sellerSvcAmt != null ? sellerSvcAmt.hashCode() : 0);
        result = 31 * result + (currCod != null ? currCod.hashCode() : 0);
        result = 31 * result + (rmrk != null ? rmrk.hashCode() : 0);
        result = 31 * result + (buyerPayUnfrzAmt != null ? buyerPayUnfrzAmt.hashCode() : 0);
        result = 31 * result + (sellerPayUnfrzAmt != null ? sellerPayUnfrzAmt.hashCode() : 0);
        result = 31 * result + (buyerSvcUnfrzAmt != null ? buyerSvcUnfrzAmt.hashCode() : 0);
        result = 31 * result + (sellerSvcUnfrzAmt != null ? sellerSvcUnfrzAmt.hashCode() : 0);
        result = 31 * result + (mchName != null ? mchName.hashCode() : 0);
        result = 31 * result + (buyMbrName != null ? buyMbrName.hashCode() : 0);
        result = 31 * result + (sellMbrName != null ? sellMbrName.hashCode() : 0);
        result = 31 * result + (txDt != null ? txDt.hashCode() : 0);
        return result;
    }
}
