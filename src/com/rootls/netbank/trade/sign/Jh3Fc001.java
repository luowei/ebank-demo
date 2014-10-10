package com.rootls.netbank.trade.sign;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by luowei on 2014/9/24.
 */
@Entity
@javax.persistence.Table(name = "JH_3FC001", schema = "dbo", catalog = "netbank")
public class Jh3Fc001 {
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

    private int corpId;

    @Basic
    @javax.persistence.Column(name = "CORP_ID", nullable = false, insertable = true, updatable = true)
    public int getCorpId() {
        return corpId;
    }

    public void setCorpId(int corpId) {
        this.corpId = corpId;
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

    private String mbrCertType;

    @Basic
    @javax.persistence.Column(name = "MBR_CERT_TYPE", nullable = false, insertable = true, updatable = true, length = 1)
    public String getMbrCertType() {
        return mbrCertType;
    }

    public void setMbrCertType(String mbrCertType) {
        this.mbrCertType = mbrCertType;
    }

    private String mbrCertNo;

    @Basic
    @javax.persistence.Column(name = "MBR_CERT_NO", nullable = false, insertable = true, updatable = true, length = 20)
    public String getMbrCertNo() {
        return mbrCertNo;
    }

    public void setMbrCertNo(String mbrCertNo) {
        this.mbrCertNo = mbrCertNo;
    }

    private String spotSitNo;

    @Basic
//    @GeneratedValue(strategy = GenerationType.AUTO,generator= "alksdk")
    @javax.persistence.Column(name = "SPOT_SIT_NO", nullable = true, insertable = true, updatable = true, length = 15)
    public String getSpotSitNo() {
        return spotSitNo;
    }

    public void setSpotSitNo(String spotSitNo) {
        this.spotSitNo = spotSitNo;
    }

    private String futureSitNo;

    @Basic
    @javax.persistence.Column(name = "FUTURE_SIT_NO", nullable = true, insertable = true, updatable = true, length = 15)
    public String getFutureSitNo() {
        return futureSitNo;
    }

    public void setFutureSitNo(String futureSitNo) {
        this.futureSitNo = futureSitNo;
    }

    private String mbrName;

    @Basic
    @javax.persistence.Column(name = "MBR_NAME", nullable = false, insertable = true, updatable = true, length = 62)
    public String getMbrName() {
        return mbrName;
    }

    public void setMbrName(String mbrName) {
        this.mbrName = mbrName;
    }

    private String mbrNo;

    @Basic
    @javax.persistence.Column(name = "MBR_NO", nullable = true, insertable = true, updatable = true, length = 10)
    public String getMbrNo() {
        return mbrNo;
    }

    public void setMbrNo(String mbrNo) {
        this.mbrNo = mbrNo;
    }

    private String mbrSpeAcctNo;

    @Basic
    @javax.persistence.Column(name = "MBR_SPE_ACCT_NO", nullable = false, insertable = true, updatable = true, length = 32)
    public String getMbrSpeAcctNo() {
        return mbrSpeAcctNo;
    }

    public void setMbrSpeAcctNo(String mbrSpeAcctNo) {
        this.mbrSpeAcctNo = mbrSpeAcctNo;
    }

    private String mbrSpeAcctBkid;

    @Basic
    @javax.persistence.Column(name = "MBR_SPE_ACCT_BKID", nullable = false, insertable = true, updatable = true, length = 1)
    public String getMbrSpeAcctBkid() {
        return mbrSpeAcctBkid;
    }

    public void setMbrSpeAcctBkid(String mbrSpeAcctBkid) {
        this.mbrSpeAcctBkid = mbrSpeAcctBkid;
    }

    private String mbrContact;

    @Basic
    @javax.persistence.Column(name = "MBR_CONTACT", nullable = true, insertable = true, updatable = true, length = 20)
    public String getMbrContact() {
        return mbrContact;
    }

    public void setMbrContact(String mbrContact) {
        this.mbrContact = mbrContact;
    }

    private String mbrPhoneNum;

    @Basic
    @javax.persistence.Column(name = "MBR_PHONE_NUM", nullable = true, insertable = true, updatable = true, length = 20)
    public String getMbrPhoneNum() {
        return mbrPhoneNum;
    }

    public void setMbrPhoneNum(String mbrPhoneNum) {
        this.mbrPhoneNum = mbrPhoneNum;
    }

    private String mbrAddr;

    @Basic
    @javax.persistence.Column(name = "MBR_ADDR", nullable = true, insertable = true, updatable = true)
    public String getMbrAddr() {
        return mbrAddr;
    }

    public void setMbrAddr(String mbrAddr) {
        this.mbrAddr = mbrAddr;
    }

    private BigDecimal mbrAnnualFeeAmt;

    @Basic
    @javax.persistence.Column(name = "MBR_ANNUAL_FEE_AMT", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getMbrAnnualFeeAmt() {
        return mbrAnnualFeeAmt;
    }

    public void setMbrAnnualFeeAmt(BigDecimal mbrAnnualFeeAmt) {
        this.mbrAnnualFeeAmt = mbrAnnualFeeAmt;
    }

    private BigDecimal mbrInoutAmtSvcAmt;

    @Basic
    @javax.persistence.Column(name = "MBR_INOUT_AMT_SVC_AMT", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getMbrInoutAmtSvcAmt() {
        return mbrInoutAmtSvcAmt;
    }

    public void setMbrInoutAmtSvcAmt(BigDecimal mbrInoutAmtSvcAmt) {
        this.mbrInoutAmtSvcAmt = mbrInoutAmtSvcAmt;
    }

    private String mbrInoutAmtSvcDrawee;

    @Basic
    @javax.persistence.Column(name = "MBR_INOUT_AMT_SVC_DRAWEE", nullable = false, insertable = true, updatable = true, length = 1)
    public String getMbrInoutAmtSvcDrawee() {
        return mbrInoutAmtSvcDrawee;
    }

    public void setMbrInoutAmtSvcDrawee(String mbrInoutAmtSvcDrawee) {
        this.mbrInoutAmtSvcDrawee = mbrInoutAmtSvcDrawee;
    }

    private String mbrInoutAmtSvcRcvSty;

    @Basic
    @javax.persistence.Column(name = "MBR_INOUT_AMT_SVC_RCV_STY", nullable = false, insertable = true, updatable = true, length = 1)
    public String getMbrInoutAmtSvcRcvSty() {
        return mbrInoutAmtSvcRcvSty;
    }

    public void setMbrInoutAmtSvcRcvSty(String mbrInoutAmtSvcRcvSty) {
        this.mbrInoutAmtSvcRcvSty = mbrInoutAmtSvcRcvSty;
    }

    private Date signedDate;

    @Basic
    @javax.persistence.Column(name = "SIGNED_DATE", nullable = false, insertable = true, updatable = true)
    public Date getSignedDate() {
        return signedDate;
    }

    @DateTimeFormat(pattern="yyyyMMdd")
    public void setSignedDate(Date signedDate) {
        this.signedDate = signedDate;
    }

    private Date disSgnDate;

    @Basic
    @javax.persistence.Column(name = "DIS_SGN_DATE", nullable = true, insertable = true, updatable = true)
    public Date getDisSgnDate() {
        return disSgnDate;
    }

    @DateTimeFormat(pattern="yyyyMMdd")
    public void setDisSgnDate(Date disSgnDate) {
        this.disSgnDate = disSgnDate;
    }

    private String mbrSts;

    @Basic
    @javax.persistence.Column(name = "MBR_STS", nullable = false, insertable = true, updatable = true, length = 1)
    public String getMbrSts() {
        return mbrSts;
    }

    public void setMbrSts(String mbrSts) {
        this.mbrSts = mbrSts;
    }

    private String rmrk;

    @Basic
    @javax.persistence.Column(name = "RMRK", nullable = true, insertable = true, updatable = true)
    public String getRmrk() {
        return rmrk;
    }

    public void setRmrk(String rmrk) {
        this.rmrk = rmrk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Jh3Fc001 jh3Fc001 = (Jh3Fc001) o;

        if (corpId != jh3Fc001.corpId) return false;
        if (id != jh3Fc001.id) return false;
        if (disSgnDate != null ? !disSgnDate.equals(jh3Fc001.disSgnDate) : jh3Fc001.disSgnDate != null) return false;
        if (futureSitNo != null ? !futureSitNo.equals(jh3Fc001.futureSitNo) : jh3Fc001.futureSitNo != null)
            return false;
        if (mbrAddr != null ? !mbrAddr.equals(jh3Fc001.mbrAddr) : jh3Fc001.mbrAddr != null) return false;
        if (mbrAnnualFeeAmt != null ? !mbrAnnualFeeAmt.equals(jh3Fc001.mbrAnnualFeeAmt) : jh3Fc001.mbrAnnualFeeAmt != null)
            return false;
        if (mbrCertNo != null ? !mbrCertNo.equals(jh3Fc001.mbrCertNo) : jh3Fc001.mbrCertNo != null) return false;
        if (mbrCertType != null ? !mbrCertType.equals(jh3Fc001.mbrCertType) : jh3Fc001.mbrCertType != null)
            return false;
        if (mbrContact != null ? !mbrContact.equals(jh3Fc001.mbrContact) : jh3Fc001.mbrContact != null) return false;
        if (mbrInoutAmtSvcAmt != null ? !mbrInoutAmtSvcAmt.equals(jh3Fc001.mbrInoutAmtSvcAmt) : jh3Fc001.mbrInoutAmtSvcAmt != null)
            return false;
        if (mbrInoutAmtSvcDrawee != null ? !mbrInoutAmtSvcDrawee.equals(jh3Fc001.mbrInoutAmtSvcDrawee) : jh3Fc001.mbrInoutAmtSvcDrawee != null)
            return false;
        if (mbrInoutAmtSvcRcvSty != null ? !mbrInoutAmtSvcRcvSty.equals(jh3Fc001.mbrInoutAmtSvcRcvSty) : jh3Fc001.mbrInoutAmtSvcRcvSty != null)
            return false;
        if (mbrName != null ? !mbrName.equals(jh3Fc001.mbrName) : jh3Fc001.mbrName != null) return false;
        if (mbrNo != null ? !mbrNo.equals(jh3Fc001.mbrNo) : jh3Fc001.mbrNo != null) return false;
        if (mbrPhoneNum != null ? !mbrPhoneNum.equals(jh3Fc001.mbrPhoneNum) : jh3Fc001.mbrPhoneNum != null)
            return false;
        if (mbrSpeAcctBkid != null ? !mbrSpeAcctBkid.equals(jh3Fc001.mbrSpeAcctBkid) : jh3Fc001.mbrSpeAcctBkid != null)
            return false;
        if (mbrSpeAcctNo != null ? !mbrSpeAcctNo.equals(jh3Fc001.mbrSpeAcctNo) : jh3Fc001.mbrSpeAcctNo != null)
            return false;
        if (mbrSts != null ? !mbrSts.equals(jh3Fc001.mbrSts) : jh3Fc001.mbrSts != null) return false;
        if (mchNo != null ? !mchNo.equals(jh3Fc001.mchNo) : jh3Fc001.mchNo != null) return false;
        if (rmrk != null ? !rmrk.equals(jh3Fc001.rmrk) : jh3Fc001.rmrk != null) return false;
        if (signedDate != null ? !signedDate.equals(jh3Fc001.signedDate) : jh3Fc001.signedDate != null) return false;
        if (spotSitNo != null ? !spotSitNo.equals(jh3Fc001.spotSitNo) : jh3Fc001.spotSitNo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + corpId;
        result = 31 * result + (mchNo != null ? mchNo.hashCode() : 0);
        result = 31 * result + (mbrCertType != null ? mbrCertType.hashCode() : 0);
        result = 31 * result + (mbrCertNo != null ? mbrCertNo.hashCode() : 0);
        result = 31 * result + (spotSitNo != null ? spotSitNo.hashCode() : 0);
        result = 31 * result + (futureSitNo != null ? futureSitNo.hashCode() : 0);
        result = 31 * result + (mbrName != null ? mbrName.hashCode() : 0);
        result = 31 * result + (mbrNo != null ? mbrNo.hashCode() : 0);
        result = 31 * result + (mbrSpeAcctNo != null ? mbrSpeAcctNo.hashCode() : 0);
        result = 31 * result + (mbrSpeAcctBkid != null ? mbrSpeAcctBkid.hashCode() : 0);
        result = 31 * result + (mbrContact != null ? mbrContact.hashCode() : 0);
        result = 31 * result + (mbrPhoneNum != null ? mbrPhoneNum.hashCode() : 0);
        result = 31 * result + (mbrAddr != null ? mbrAddr.hashCode() : 0);
        result = 31 * result + (mbrAnnualFeeAmt != null ? mbrAnnualFeeAmt.hashCode() : 0);
        result = 31 * result + (mbrInoutAmtSvcAmt != null ? mbrInoutAmtSvcAmt.hashCode() : 0);
        result = 31 * result + (mbrInoutAmtSvcDrawee != null ? mbrInoutAmtSvcDrawee.hashCode() : 0);
        result = 31 * result + (mbrInoutAmtSvcRcvSty != null ? mbrInoutAmtSvcRcvSty.hashCode() : 0);
        result = 31 * result + (signedDate != null ? signedDate.hashCode() : 0);
        result = 31 * result + (disSgnDate != null ? disSgnDate.hashCode() : 0);
        result = 31 * result + (mbrSts != null ? mbrSts.hashCode() : 0);
        result = 31 * result + (rmrk != null ? rmrk.hashCode() : 0);
        return result;
    }
}
