package com.rootls.manage.db;

import javax.persistence.*;

/**
 * Created by Administrator on 2014/9/3.
 */
@Entity
@Table(name = "CLS_CURR_IDEN", schema = "dbo", catalog = "netbank")
public class DB_ClsCurrIden {
    private String currIdenCod;
    private String currIdenTitle;

    @Id
    @Column(name = "CURR_IDEN_COD")
    public String getCurrIdenCod() {
        return currIdenCod;
    }

    public void setCurrIdenCod(String currIdenCod) {
        this.currIdenCod = currIdenCod;
    }

    @Basic
    @Column(name = "CURR_IDEN_TITLE")
    public String getCurrIdenTitle() {
        return currIdenTitle;
    }

    public void setCurrIdenTitle(String currIdenTitle) {
        this.currIdenTitle = currIdenTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DB_ClsCurrIden that = (DB_ClsCurrIden) o;

        if (currIdenCod != null ? !currIdenCod.equals(that.currIdenCod) : that.currIdenCod != null) return false;
        if (currIdenTitle != null ? !currIdenTitle.equals(that.currIdenTitle) : that.currIdenTitle != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = currIdenCod != null ? currIdenCod.hashCode() : 0;
        result = 31 * result + (currIdenTitle != null ? currIdenTitle.hashCode() : 0);
        return result;
    }
}
