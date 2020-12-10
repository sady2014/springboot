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
 *  前端控制器
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
    @PostMapping("/postinfo")
    public Object test(int id) {
        return userinfoService.getById(id);
    }

    @GetMapping("/getinfo")
    public Object getInfo() {
        return userinfoService.list();
    }

}

