package com.springboot.controller;

import com.springboot.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    /**
     * 获取用户信息
     * @return
     */
    @GetMapping("/")
    public Object getUserInfo() {
        return userInfoService.getUserInfo();
    }
}
