package com.rootls.manage.model;

import javax.persistence.*;

/**
 * Created by luowei on 2014/9/19.
 */
@Entity
@Table(name = "Sys_Corporation", schema = "dbo", catalog = "trade")
public class SysCorporation {
    private int corporationId;
    private String corporationName;
    private String corporationEName;
    private String corporationAbName;
    private Integer adminid;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Corporation_ID", nullable = false, insertable = true, updatable = true)
    public int getCorporationId() {
        return corporationId;
    }

    public void setCorporationId(int corporationId) {
        this.corporationId = corporationId;
    }

    @Basic
    @Column(name = "Corporation_Name", nullable = false, insertable = true, updatable = true)
    public String getCorporationName() {
        return corporationName;
    }

    public void setCorporationName(String corporationName) {
        this.corporationName = corporationName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysCorporation that = (SysCorporation) o;

        if (corporationId != that.corporationId) return false;
        if (corporationName != null ? !corporationName.equals(that.corporationName) : that.corporationName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = corporationId;
        result = 31 * result + (corporationName != null ? corporationName.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "Corporation_EName", nullable = true, insertable = true, updatable = true)
    public String getCorporationEName() {
        return corporationEName;
    }

    public void setCorporationEName(String corporationEName) {
        this.corporationEName = corporationEName;
    }

    @Basic
    @Column(name = "Corporation_AbName", nullable = true, insertable = true, updatable = true)
    public String getCorporationAbName() {
        return corporationAbName;
    }

    public void setCorporationAbName(String corporationAbName) {
        this.corporationAbName = corporationAbName;
    }

    @Basic
    @Column(name = "adminid", nullable = true, insertable = true, updatable = true)
    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }
}
