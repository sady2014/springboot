package com.springboot.controller;

import com.springboot.entity.UserInfo;
import com.springboot.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/userInfo")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    /**
     * 获取用户信息
     * @return
     */
    @ResponseBody
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
