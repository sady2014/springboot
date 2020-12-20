package com.springboot.controller;


import com.springboot.entity.Userinfo;
import com.springboot.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  用户信息记录 前端控制器
 * </p>
 *
 * @author Mugua
 * @since 2020-12-09
 */
@RestController
@RequestMapping("/userinfo")
public class UserinfoController {

    @Autowired
    private UserinfoService userinfoService;
    @PostMapping("/postInfo")
    public Object postInfo(int id) {
        return userinfoService.getById(id);
    }

    @GetMapping("/getInfo")
    public Object getInfo() {
        return userinfoService.list();
    }

}

