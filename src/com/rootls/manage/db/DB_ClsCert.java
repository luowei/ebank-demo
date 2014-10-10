package com.rootls.manage.db;

import javax.persistence.*;

/**
 * Created by Administrator on 2014/9/3.
 */
@Entity
@Table(name = "CLS_CERT", schema = "dbo", catalog = "netbank")
public class DB_ClsCert {
    private String certType;
    private String certTitle;

    @Id
    @Column(name = "CERT_TYPE")
    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    @Basic
    @Column(name = "CERT_Title")
    public String getCertTitle() {
        return certTitle;
    }

    public void setCertTitle(String certTitle) {
        this.certTitle = certTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DB_ClsCert that = (DB_ClsCert) o;

        if (certTitle != null ? !certTitle.equals(that.certTitle) : that.certTitle != null) return false;
        if (certType != null ? !certType.equals(that.certType) : that.certType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = certType != null ? certType.hashCode() : 0;
        result = 31 * result + (certTitle != null ? certTitle.hashCode() : 0);
        return result;
    }
}
