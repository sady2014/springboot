package com.springboot.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
@ApiModel("用户实体")
public class UserInfo {

    @ApiModelProperty("系统 id")
    private Integer id;

    @ApiModelProperty("用户 id")
    private Integer userid;

    @ApiModelProperty("用户 名")
    private String username;

    @ApiModelProperty("用户 密码")
    private String password;

    @ApiModelProperty("注册日期")
    private Date regdate;

    @ApiModelProperty("用户 昵称")
    private String nickname;

    @ApiModelProperty("用户 手机号")
    private Integer phonenum;

    @ApiModelProperty("用户 邮件")
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Integer getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(Integer phonenum) {
        this.phonenum = phonenum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}