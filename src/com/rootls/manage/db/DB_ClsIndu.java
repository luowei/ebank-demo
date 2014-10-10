package com.rootls.manage.db;

import javax.persistence.*;

/**
 * Created by Administrator on 2014/9/3.
 */
@Entity
@Table(name = "CLS_INDU", schema = "dbo", catalog = "netbank")
public class DB_ClsIndu {
    private int id;
    private String induCod;
    private String induTitle;
    private Integer induGrade;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "INDU_COD")
    public String getInduCod() {
        return induCod;
    }

    public void setInduCod(String induCod) {
        this.induCod = induCod;
    }

    @Basic
    @Column(name = "INDU_TITLE")
    public String getInduTitle() {
        return induTitle;
    }

    public void setInduTitle(String induTitle) {
        this.induTitle = induTitle;
    }

    @Basic
    @Column(name = "INDU_GRADE")
    public Integer getInduGrade() {
        return induGrade;
    }

    public void setInduGrade(Integer induGrade) {
        this.induGrade = induGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DB_ClsIndu that = (DB_ClsIndu) o;

        if (id != that.id) return false;
        if (induCod != null ? !induCod.equals(that.induCod) : that.induCod != null) return false;
        if (induGrade != null ? !induGrade.equals(that.induGrade) : that.induGrade != null) return false;
        if (induTitle != null ? !induTitle.equals(that.induTitle) : that.induTitle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (induCod != null ? induCod.hashCode() : 0);
        result = 31 * result + (induTitle != null ? induTitle.hashCode() : 0);
        result = 31 * result + (induGrade != null ? induGrade.hashCode() : 0);
        return result;
    }
}
