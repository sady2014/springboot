package com.springboot.controller;

import com.springboot.entity.UserInfo;
import com.springboot.service.UserInfoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Administrator
 * @Date 2020年12月8日 10:24:55
 */
@Api(tags = "用户相关接口",  description= "提供用户相关的 Rest API")
@RestController
@RequestMapping("/userInfo")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;
    /**
     * 获取用户信息
     * @return
     */
    @GetMapping("/json")
    public List<UserInfo> getUserInfo() {
        List<UserInfo> list = userInfoService.getUserInfo();
        return list;
    }

    @GetMapping("/page")
    public String reUserInfo() {
        List<UserInfo> list = userInfoService.getUserInfo();
        return "home";
    }
}
