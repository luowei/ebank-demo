package com.rootls.manage.db;

import javax.persistence.*;

/**
 * Created by Administrator on 2014/9/3.
 */
@Entity
@Table(name = "CLS_DSCRP", schema = "dbo", catalog = "netbank")
public class DB_ClsDscrp {
    private String dscrpCod;
    private String dscrpTitle;

    @Id
    @Column(name = "DSCRP_COD")
    public String getDscrpCod() {
        return dscrpCod;
    }

    public void setDscrpCod(String dscrpCod) {
        this.dscrpCod = dscrpCod;
    }

    @Basic
    @Column(name = "DSCRP_TITLE")
    public String getDscrpTitle() {
        return dscrpTitle;
    }

    public void setDscrpTitle(String dscrpTitle) {
        this.dscrpTitle = dscrpTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DB_ClsDscrp that = (DB_ClsDscrp) o;

        if (dscrpCod != null ? !dscrpCod.equals(that.dscrpCod) : that.dscrpCod != null) return false;
        if (dscrpTitle != null ? !dscrpTitle.equals(that.dscrpTitle) : that.dscrpTitle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dscrpCod != null ? dscrpCod.hashCode() : 0;
        result = 31 * result + (dscrpTitle != null ? dscrpTitle.hashCode() : 0);
        return result;
    }
}
