package com.rootls.manage.db;

import javax.persistence.*;

/**
 * Created by Administrator on 2014/9/3.
 */
@Entity
@Table(name = "CLS_EP", schema = "dbo", catalog = "netbank")
public class DB_ClsEp {
    private String epCod;
    private String epTitle;

    @Id
    @Column(name = "EP_COD")
    public String getEpCod() {
        return epCod;
    }

    public void setEpCod(String epCod) {
        this.epCod = epCod;
    }

    @Basic
    @Column(name = "EP_TITLE")
    public String getEpTitle() {
        return epTitle;
    }

    public void setEpTitle(String epTitle) {
        this.epTitle = epTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DB_ClsEp db_clsEp = (DB_ClsEp) o;

        if (epCod != null ? !epCod.equals(db_clsEp.epCod) : db_clsEp.epCod != null) return false;
        if (epTitle != null ? !epTitle.equals(db_clsEp.epTitle) : db_clsEp.epTitle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = epCod != null ? epCod.hashCode() : 0;
        result = 31 * result + (epTitle != null ? epTitle.hashCode() : 0);
        return result;
    }
}
