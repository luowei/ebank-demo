package com.rootls.manage.db;

import javax.persistence.*;

/**
 * Created by Administrator on 2014/9/3.
 */
@Entity
@Table(name = "CLS_CURR", schema = "dbo", catalog = "netbank")
public class DB_ClsCurr {
    private String currCod;
    private String currTitle;

    @Id
    @Column(name = "CURR_COD")
    public String getCurrCod() {
        return currCod;
    }

    public void setCurrCod(String currCod) {
        this.currCod = currCod;
    }

    @Basic
    @Column(name = "CURR_TITLE")
    public String getCurrTitle() {
        return currTitle;
    }

    public void setCurrTitle(String currTitle) {
        this.currTitle = currTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DB_ClsCurr that = (DB_ClsCurr) o;

        if (currCod != null ? !currCod.equals(that.currCod) : that.currCod != null) return false;
        if (currTitle != null ? !currTitle.equals(that.currTitle) : that.currTitle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = currCod != null ? currCod.hashCode() : 0;
        result = 31 * result + (currTitle != null ? currTitle.hashCode() : 0);
        return result;
    }
}
