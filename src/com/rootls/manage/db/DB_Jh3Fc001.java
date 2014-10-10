package com.rootls.manage.db;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2014/9/3.
 */
@Entity
@javax.persistence.Table(name = "JH_3FC001", schema = "dbo", catalog = "netbank")
public class DB_Jh3Fc001 {
    private int corpId;

    @Id
    @javax.persistence.Column(name = "CORP_ID")
    public int getCorpId() {
        return corpId;
    }

    public void setCorpId(int corpId) {
        this.corpId = corpId;
    }

    private String mchNo;

    @Basic
    @javax.persistence.Column(name = "MCH_NO")
    public String getMchNo() {
        return mchNo;
    }

    public void setMchNo(String mchNo) {
        this.mchNo = mchNo;
    }

    private String mbrCertType;

    @Basic
    @javax.persistence.Column(name = "MBR_CERT_TYPE")
    public String getMbrCertType() {
        return mbrCertType;
    }

    public void setMbrCertType(String mbrCertType) {
        this.mbrCertType = mbrCertType;
    }

    private String mbrCertNo;

    @Basic
    @javax.persistence.Column(name = "MBR_CERT_NO")
    public String getMbrCertNo() {
        return mbrCertNo;
    }

    public void setMbrCertNo(String mbrCertNo) {
        this.mbrCertNo = mbrCertNo;
    }

    private String spotSitNo;

    @Basic
    @javax.persistence.Column(name = "SPOT_SIT_NO")
    public String getSpotSitNo() {
        return spotSitNo;
    }

    public void setSpotSitNo(String spotSitNo) {
        this.spotSitNo = spotSitNo;
    }

    private String futureSitNo;

    @Basic
    @javax.persistence.Column(name = "FUTURE_SIT_NO")
    public String getFutureSitNo() {
        return futureSitNo;
    }

    public void setFutureSitNo(String futureSitNo) {
        this.futureSitNo = futureSitNo;
    }

    private String mbrName;

    @Basic
    @javax.persistence.Column(name = "MBR_NAME")
    public String getMbrName() {
        return mbrName;
    }

    public void setMbrName(String mbrName) {
        this.mbrName = mbrName;
    }

    private String mbrNo;

    @Basic
    @javax.persistence.Column(name = "MBR_NO")
    public String getMbrNo() {
        return mbrNo;
    }

    public void setMbrNo(String mbrNo) {
        this.mbrNo = mbrNo;
    }

    private String mbrSpeAcctNo;

    @Basic
    @javax.persistence.Column(name = "MBR_SPE_ACCT_NO")
    public String getMbrSpeAcctNo() {
        return mbrSpeAcctNo;
    }

    public void setMbrSpeAcctNo(String mbrSpeAcctNo) {
        this.mbrSpeAcctNo = mbrSpeAcctNo;
    }

    private String mbrSpeAcctBkid;

    @Basic
    @javax.persistence.Column(name = "MBR_SPE_ACCT_BKID")
    public String getMbrSpeAcctBkid() {
        return mbrSpeAcctBkid;
    }

    public void setMbrSpeAcctBkid(String mbrSpeAcctBkid) {
        this.mbrSpeAcctBkid = mbrSpeAcctBkid;
    }

    private String mbrContact;

    @Basic
    @javax.persistence.Column(name = "MBR_CONTACT")
    public String getMbrContact() {
        return mbrContact;
    }

    public void setMbrContact(String mbrContact) {
        this.mbrContact = mbrContact;
    }

    private String mbrPhoneNum;

    @Basic
    @javax.persistence.Column(name = "MBR_PHONE_NUM")
    public String getMbrPhoneNum() {
        return mbrPhoneNum;
    }

    public void setMbrPhoneNum(String mbrPhoneNum) {
        this.mbrPhoneNum = mbrPhoneNum;
    }

    private String mbrAddr;

    @Basic
    @javax.persistence.Column(name = "MBR_ADDR")
    public String getMbrAddr() {
        return mbrAddr;
    }

    public void setMbrAddr(String mbrAddr) {
        this.mbrAddr = mbrAddr;
    }

    private BigDecimal mbrAnnualFeeAmt;

    @Basic
    @javax.persistence.Column(name = "MBR_ANNUAL_FEE_AMT")
    public BigDecimal getMbrAnnualFeeAmt() {
        return mbrAnnualFeeAmt;
    }

    public void setMbrAnnualFeeAmt(BigDecimal mbrAnnualFeeAmt) {
        this.mbrAnnualFeeAmt = mbrAnnualFeeAmt;
    }

    private BigDecimal mbrInoutAmtSvcAmt;

    @Basic
    @javax.persistence.Column(name = "MBR_INOUT_AMT_SVC_AMT")
    public BigDecimal getMbrInoutAmtSvcAmt() {
        return mbrInoutAmtSvcAmt;
    }

    public void setMbrInoutAmtSvcAmt(BigDecimal mbrInoutAmtSvcAmt) {
        this.mbrInoutAmtSvcAmt = mbrInoutAmtSvcAmt;
    }

    private String mbrInoutAmtSvcDrawee;

    @Basic
    @javax.persistence.Column(name = "MBR_INOUT_AMT_SVC_DRAWEE")
    public String getMbrInoutAmtSvcDrawee() {
        return mbrInoutAmtSvcDrawee;
    }

    public void setMbrInoutAmtSvcDrawee(String mbrInoutAmtSvcDrawee) {
        this.mbrInoutAmtSvcDrawee = mbrInoutAmtSvcDrawee;
    }

    private String mbrInoutAmtSvcRcvSty;

    @Basic
    @javax.persistence.Column(name = "MBR_INOUT_AMT_SVC_RCV_STY")
    public String getMbrInoutAmtSvcRcvSty() {
        return mbrInoutAmtSvcRcvSty;
    }

    public void setMbrInoutAmtSvcRcvSty(String mbrInoutAmtSvcRcvSty) {
        this.mbrInoutAmtSvcRcvSty = mbrInoutAmtSvcRcvSty;
    }

    private Timestamp signedDate;

    @Basic
    @javax.persistence.Column(name = "SIGNED_DATE")
    public Timestamp getSignedDate() {
        return signedDate;
    }

    public void setSignedDate(Timestamp signedDate) {
        this.signedDate = signedDate;
    }

    private Timestamp disSgnDate;

    @Basic
    @javax.persistence.Column(name = "DIS_SGN_DATE")
    public Timestamp getDisSgnDate() {
        return disSgnDate;
    }

    public void setDisSgnDate(Timestamp disSgnDate) {
        this.disSgnDate = disSgnDate;
    }

    private String mbrSts;

    @Basic
    @javax.persistence.Column(name = "MBR_STS")
    public String getMbrSts() {
        return mbrSts;
    }

    public void setMbrSts(String mbrSts) {
        this.mbrSts = mbrSts;
    }

    private String rmrk;

    @Basic
    @javax.persistence.Column(name = "RMRK")
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

        DB_Jh3Fc001 that = (DB_Jh3Fc001) o;

        if (corpId != that.corpId) return false;
        if (disSgnDate != null ? !disSgnDate.equals(that.disSgnDate) : that.disSgnDate != null) return false;
        if (futureSitNo != null ? !futureSitNo.equals(that.futureSitNo) : that.futureSitNo != null) return false;
        if (mbrAddr != null ? !mbrAddr.equals(that.mbrAddr) : that.mbrAddr != null) return false;
        if (mbrAnnualFeeAmt != null ? !mbrAnnualFeeAmt.equals(that.mbrAnnualFeeAmt) : that.mbrAnnualFeeAmt != null)
            return false;
        if (mbrCertNo != null ? !mbrCertNo.equals(that.mbrCertNo) : that.mbrCertNo != null) return false;
        if (mbrCertType != null ? !mbrCertType.equals(that.mbrCertType) : that.mbrCertType != null) return false;
        if (mbrContact != null ? !mbrContact.equals(that.mbrContact) : that.mbrContact != null) return false;
        if (mbrInoutAmtSvcAmt != null ? !mbrInoutAmtSvcAmt.equals(that.mbrInoutAmtSvcAmt) : that.mbrInoutAmtSvcAmt != null)
            return false;
        if (mbrInoutAmtSvcDrawee != null ? !mbrInoutAmtSvcDrawee.equals(that.mbrInoutAmtSvcDrawee) : that.mbrInoutAmtSvcDrawee != null)
            return false;
        if (mbrInoutAmtSvcRcvSty != null ? !mbrInoutAmtSvcRcvSty.equals(that.mbrInoutAmtSvcRcvSty) : that.mbrInoutAmtSvcRcvSty != null)
            return false;
        if (mbrName != null ? !mbrName.equals(that.mbrName) : that.mbrName != null) return false;
        if (mbrNo != null ? !mbrNo.equals(that.mbrNo) : that.mbrNo != null) return false;
        if (mbrPhoneNum != null ? !mbrPhoneNum.equals(that.mbrPhoneNum) : that.mbrPhoneNum != null) return false;
        if (mbrSpeAcctBkid != null ? !mbrSpeAcctBkid.equals(that.mbrSpeAcctBkid) : that.mbrSpeAcctBkid != null)
            return false;
        if (mbrSpeAcctNo != null ? !mbrSpeAcctNo.equals(that.mbrSpeAcctNo) : that.mbrSpeAcctNo != null) return false;
        if (mbrSts != null ? !mbrSts.equals(that.mbrSts) : that.mbrSts != null) return false;
        if (mchNo != null ? !mchNo.equals(that.mchNo) : that.mchNo != null) return false;
        if (rmrk != null ? !rmrk.equals(that.rmrk) : that.rmrk != null) return false;
        if (signedDate != null ? !signedDate.equals(that.signedDate) : that.signedDate != null) return false;
        if (spotSitNo != null ? !spotSitNo.equals(that.spotSitNo) : that.spotSitNo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = corpId;
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
