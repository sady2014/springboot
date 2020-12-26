package com.springboot.entity;

public enum DBServiceError {
    success(0, "返回成功"),
    error(1," 返回失败"),
    ;
    private int code;
    private String info;
    DBServiceError(int code, String info) {
        this.code = code;
        this.info = info;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
