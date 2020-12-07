package com.springboot.controller;

import com.springboot.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;
    public Object getUserInfo() {

        return userInfoService.getUserInfo();
    }
}
