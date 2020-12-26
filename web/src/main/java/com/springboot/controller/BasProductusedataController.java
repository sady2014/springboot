package com.springboot.controller;


import com.springboot.entity.BasProductusedata;
import com.springboot.entity.DBServiceError;
import com.springboot.service.IBasProductusedataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Timer;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Mugau
 * @since 2020-12-26
 */
@RestController
@RequestMapping("/bas-productusedata")
public class BasProductusedataController {
    @Autowired
    private IBasProductusedataService iBasProductusedataService;

    /**
     * <p>
     *     通过锁号获取使用信息
     * </p>
     * @param keySN 锁号
     * @return iBasProductusedataService.getInfo(basProductusedata)
     */
    @PostMapping("getInfo")
    public List<BasProductusedata> getInfo(String keySN) {
        BasProductusedata basProductusedata = new BasProductusedata();
        basProductusedata.setKeySN(keySN);
        return iBasProductusedataService.getInfo(basProductusedata);
    }
}
