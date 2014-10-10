package com.rootls.manage.model;

import javax.persistence.*;

/**
 * Created by luowei on 2014/9/12.
 */
@Entity
@Table(name = "Sys_Corp_Bank", schema = "dbo", catalog = "trade")
public class SysCorpBank {
    private int id;
    private Integer corpId;
    private String corpTime;
    private String corpName;
    private Integer corpBankId;
    private String corpOpeningBank;
    private String corpBankAccount;
    private String corpCertPicture;

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
    @Column(name = "Corp_Id", nullable = true, insertable = true, updatable = true)
    public Integer getCorpId() {
        return corpId;
    }

    public void setCorpId(Integer corpId) {
        this.corpId = corpId;
    }

    @Basic
    @Column(name = "Corp_Time", nullable = true, insertable = true, updatable = true, length = 10)
    public String getCorpTime() {
        return corpTime;
    }

    public void setCorpTime(String corpTime) {
        this.corpTime = corpTime;
    }

    @Basic
    @Column(name = "Corp_Name", nullable = true, insertable = true, updatable = true)
    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    @Basic
    @Column(name = "Corp_bankID", nullable = true, insertable = true, updatable = true)
    public Integer getCorpBankId() {
        return corpBankId;
    }

    public void setCorpBankId(Integer corpBankId) {
        this.corpBankId = corpBankId;
    }

    @Basic
    @Column(name = "Corp_OpeningBank", nullable = true, insertable = true, updatable = true)
    public String getCorpOpeningBank() {
        return corpOpeningBank;
    }

    public void setCorpOpeningBank(String corpOpeningBank) {
        this.corpOpeningBank = corpOpeningBank;
    }

    @Basic
    @Column(name = "Corp_bankAccount", nullable = true, insertable = true, updatable = true)
    public String getCorpBankAccount() {
        return corpBankAccount;
    }

    public void setCorpBankAccount(String corpBankAccount) {
        this.corpBankAccount = corpBankAccount;
    }

    @Basic
    @Column(name = "Corp_CertPicture", nullable = true, insertable = true, updatable = true)
    public String getCorpCertPicture() {
        return corpCertPicture;
    }

    public void setCorpCertPicture(String corpCertPicture) {
        this.corpCertPicture = corpCertPicture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysCorpBank that = (SysCorpBank) o;

        if (id != that.id) return false;
        if (corpBankAccount != null ? !corpBankAccount.equals(that.corpBankAccount) : that.corpBankAccount != null)
            return false;
        if (corpBankId != null ? !corpBankId.equals(that.corpBankId) : that.corpBankId != null) return false;
        if (corpCertPicture != null ? !corpCertPicture.equals(that.corpCertPicture) : that.corpCertPicture != null)
            return false;
        if (corpId != null ? !corpId.equals(that.corpId) : that.corpId != null) return false;
        if (corpName != null ? !corpName.equals(that.corpName) : that.corpName != null) return false;
        if (corpOpeningBank != null ? !corpOpeningBank.equals(that.corpOpeningBank) : that.corpOpeningBank != null)
            return false;
        if (corpTime != null ? !corpTime.equals(that.corpTime) : that.corpTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (corpId != null ? corpId.hashCode() : 0);
        result = 31 * result + (corpTime != null ? corpTime.hashCode() : 0);
        result = 31 * result + (corpName != null ? corpName.hashCode() : 0);
        result = 31 * result + (corpBankId != null ? corpBankId.hashCode() : 0);
        result = 31 * result + (corpOpeningBank != null ? corpOpeningBank.hashCode() : 0);
        result = 31 * result + (corpBankAccount != null ? corpBankAccount.hashCode() : 0);
        result = 31 * result + (corpCertPicture != null ? corpCertPicture.hashCode() : 0);
        return result;
    }
}
