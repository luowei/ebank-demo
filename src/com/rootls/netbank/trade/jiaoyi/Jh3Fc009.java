package com.rootls.netbank.trade.jiaoyi;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by luowei on 2014/9/26.
 */
@Entity
@javax.persistence.Table(name = "JH_3FC009", schema = "dbo", catalog = "netbank")
public class Jh3Fc009 {
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

    private String funcCode;

    @Basic
    @javax.persistence.Column(name = "FUNC_CODE", nullable = false, insertable = true, updatable = true, length = 1)
    public String getFuncCode() {
        return funcCode;
    }

    public void setFuncCode(String funcCode) {
        this.funcCode = funcCode;
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

    private BigDecimal ctrtAmt;

    @Basic
    @javax.persistence.Column(name = "CTRT_AMT", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getCtrtAmt() {
        return ctrtAmt;
    }

    public void setCtrtAmt(BigDecimal ctrtAmt) {
        this.ctrtAmt = ctrtAmt;
    }

    private BigDecimal buyerGuarPayAmt;

    @Basic
    @javax.persistence.Column(name = "BUYER_GUAR_PAY_AMT", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getBuyerGuarPayAmt() {
        return buyerGuarPayAmt;
    }

    public void setBuyerGuarPayAmt(BigDecimal buyerGuarPayAmt) {
        this.buyerGuarPayAmt = buyerGuarPayAmt;
    }

    private BigDecimal sellerGuarPayAmt;

    @Basic
    @javax.persistence.Column(name = "SELLER_GUAR_PAY_AMT", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getSellerGuarPayAmt() {
        return sellerGuarPayAmt;
    }

    public void setSellerGuarPayAmt(BigDecimal sellerGuarPayAmt) {
        this.sellerGuarPayAmt = sellerGuarPayAmt;
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

    private String finFlg;

    @Basic
    @javax.persistence.Column(name = "FIN_FLG", nullable = true, insertable = true, updatable = true, length = 1)
    public String getFinFlg() {
        return finFlg;
    }

    public void setFinFlg(String finFlg) {
        this.finFlg = finFlg;
    }

    private BigDecimal finAmt;

    @Basic
    @javax.persistence.Column(name = "FIN_AMT", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getFinAmt() {
        return finAmt;
    }

    public void setFinAmt(BigDecimal finAmt) {
        this.finAmt = finAmt;
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

        Jh3Fc009 jh3Fc009 = (Jh3Fc009) o;

        if (id != jh3Fc009.id) return false;
        if (buyMbrName != null ? !buyMbrName.equals(jh3Fc009.buyMbrName) : jh3Fc009.buyMbrName != null) return false;
        if (buyerGuarPayAmt != null ? !buyerGuarPayAmt.equals(jh3Fc009.buyerGuarPayAmt) : jh3Fc009.buyerGuarPayAmt != null)
            return false;
        if (buyerSitNo != null ? !buyerSitNo.equals(jh3Fc009.buyerSitNo) : jh3Fc009.buyerSitNo != null) return false;
        if (buyerSvcAmt != null ? !buyerSvcAmt.equals(jh3Fc009.buyerSvcAmt) : jh3Fc009.buyerSvcAmt != null)
            return false;
        if (ctrtAmt != null ? !ctrtAmt.equals(jh3Fc009.ctrtAmt) : jh3Fc009.ctrtAmt != null) return false;
        if (ctrtNo != null ? !ctrtNo.equals(jh3Fc009.ctrtNo) : jh3Fc009.ctrtNo != null) return false;
        if (currCod != null ? !currCod.equals(jh3Fc009.currCod) : jh3Fc009.currCod != null) return false;
        if (finAmt != null ? !finAmt.equals(jh3Fc009.finAmt) : jh3Fc009.finAmt != null) return false;
        if (finFlg != null ? !finFlg.equals(jh3Fc009.finFlg) : jh3Fc009.finFlg != null) return false;
        if (funcCode != null ? !funcCode.equals(jh3Fc009.funcCode) : jh3Fc009.funcCode != null) return false;
        if (mchName != null ? !mchName.equals(jh3Fc009.mchName) : jh3Fc009.mchName != null) return false;
        if (mchNo != null ? !mchNo.equals(jh3Fc009.mchNo) : jh3Fc009.mchNo != null) return false;
        if (rmrk != null ? !rmrk.equals(jh3Fc009.rmrk) : jh3Fc009.rmrk != null) return false;
        if (sellMbrName != null ? !sellMbrName.equals(jh3Fc009.sellMbrName) : jh3Fc009.sellMbrName != null)
            return false;
        if (sellerGuarPayAmt != null ? !sellerGuarPayAmt.equals(jh3Fc009.sellerGuarPayAmt) : jh3Fc009.sellerGuarPayAmt != null)
            return false;
        if (sellerSitNo != null ? !sellerSitNo.equals(jh3Fc009.sellerSitNo) : jh3Fc009.sellerSitNo != null)
            return false;
        if (sellerSvcAmt != null ? !sellerSvcAmt.equals(jh3Fc009.sellerSvcAmt) : jh3Fc009.sellerSvcAmt != null)
            return false;
        if (txDt != null ? !txDt.equals(jh3Fc009.txDt) : jh3Fc009.txDt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (funcCode != null ? funcCode.hashCode() : 0);
        result = 31 * result + (mchNo != null ? mchNo.hashCode() : 0);
        result = 31 * result + (buyerSitNo != null ? buyerSitNo.hashCode() : 0);
        result = 31 * result + (sellerSitNo != null ? sellerSitNo.hashCode() : 0);
        result = 31 * result + (ctrtNo != null ? ctrtNo.hashCode() : 0);
        result = 31 * result + (ctrtAmt != null ? ctrtAmt.hashCode() : 0);
        result = 31 * result + (buyerGuarPayAmt != null ? buyerGuarPayAmt.hashCode() : 0);
        result = 31 * result + (sellerGuarPayAmt != null ? sellerGuarPayAmt.hashCode() : 0);
        result = 31 * result + (buyerSvcAmt != null ? buyerSvcAmt.hashCode() : 0);
        result = 31 * result + (sellerSvcAmt != null ? sellerSvcAmt.hashCode() : 0);
        result = 31 * result + (currCod != null ? currCod.hashCode() : 0);
        result = 31 * result + (rmrk != null ? rmrk.hashCode() : 0);
        result = 31 * result + (finFlg != null ? finFlg.hashCode() : 0);
        result = 31 * result + (finAmt != null ? finAmt.hashCode() : 0);
        result = 31 * result + (mchName != null ? mchName.hashCode() : 0);
        result = 31 * result + (buyMbrName != null ? buyMbrName.hashCode() : 0);
        result = 31 * result + (sellMbrName != null ? sellMbrName.hashCode() : 0);
        result = 31 * result + (txDt != null ? txDt.hashCode() : 0);
        return result;
    }
}
