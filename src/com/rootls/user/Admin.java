package com.rootls.user;

import java.io.Serializable;

/**
 * Created by luowei on 2014/8/15.
 */
public class Admin implements Serializable {

    Integer userId;
    String username;
    String password;

    String truename;
    Integer mastergrade;

    public Admin() {
    }

    public Admin(Integer userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
    }

    public Admin(Integer userId, String username, String password, String truename, Integer mastergrade) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.truename = truename;
        this.mastergrade = mastergrade;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public Integer getMastergrade() {
        return mastergrade;
    }

    public void setMastergrade(Integer mastergrade) {
        this.mastergrade = mastergrade;
    }
}
