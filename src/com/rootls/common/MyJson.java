package com.rootls.common;


import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: luowei
 * Date: 14-1-24
 * Time: 下午4:37
 * To change this template use File | Settings | File Templates.
 */
@JsonPropertyOrder({"stat","msg","data"})
public class MyJson<T> implements Serializable {

    Integer stat=1;
    String msg ="ok";
    T data;

    public MyJson() {
    }

    public MyJson(String msg) {
        this.msg = msg;
    }

    public MyJson(Integer stat, String msg) {
        this.stat = stat;
        this.msg = msg;
    }

    public MyJson(Integer stat, String msg, T data) {
        this.stat = stat;
        this.msg = msg;
        this.data = data;
    }

    public Integer getStat() {
        return stat;
    }

    public void setStat(Integer stat) {
        this.stat = stat;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
