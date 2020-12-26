package com.springboot.util;

import com.springboot.entity.BasProductusedata;

import java.util.*;

/**
 * 返回LayUI可用的格式
 * @param <T>
 * @Author Mugua
 * @date 2020年12月27日 04点55分
 */
public class LayuiTypeJson<T>{
    private int code=0;
    private String msg="";
    private int count;
    private List<T> data = new ArrayList<T>();
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

}
