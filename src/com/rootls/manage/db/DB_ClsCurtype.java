package com.rootls.manage.db;

import javax.persistence.*;

/**
 * Created by Administrator on 2014/9/3.
 */
@Entity
@Table(name = "CLS_CURTYPE", schema = "dbo", catalog = "netbank")
public class DB_ClsCurtype {
    private String curtypeCod;
    private String curtypeTitle;

    @Id
    @Column(name = "CURTYPE_COD")
    public String getCurtypeCod() {
        return curtypeCod;
    }

    public void setCurtypeCod(String curtypeCod) {
        this.curtypeCod = curtypeCod;
    }

    @Basic
    @Column(name = "CURTYPE_TITLE")
    public String getCurtypeTitle() {
        return curtypeTitle;
    }

    public void setCurtypeTitle(String curtypeTitle) {
        this.curtypeTitle = curtypeTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DB_ClsCurtype that = (DB_ClsCurtype) o;

        if (curtypeCod != null ? !curtypeCod.equals(that.curtypeCod) : that.curtypeCod != null) return false;
        if (curtypeTitle != null ? !curtypeTitle.equals(that.curtypeTitle) : that.curtypeTitle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = curtypeCod != null ? curtypeCod.hashCode() : 0;
        result = 31 * result + (curtypeTitle != null ? curtypeTitle.hashCode() : 0);
        return result;
    }
}
