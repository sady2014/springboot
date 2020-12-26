package com.springboot.controller;


import com.springboot.entity.BasProductusedata;
import com.springboot.entity.DBServiceError;
import com.springboot.service.IBasProductusedataService;
import com.springboot.util.LayuiTypeJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    @PostMapping("/getInfo")
    public LayuiTypeJson<BasProductusedata> getInfo(String keySN) {
        System.out.println("KeySN:"+keySN);
        BasProductusedata basProductusedata = new BasProductusedata();
        basProductusedata.setKeySN(keySN);
        LayuiTypeJson<BasProductusedata> layuiTypeJson=new LayuiTypeJson<>();
        layuiTypeJson.setMsg("查询成功");
        layuiTypeJson.setCount(iBasProductusedataService.getInfo(basProductusedata).size());
        layuiTypeJson.setData(iBasProductusedataService.getInfo(basProductusedata));
        return layuiTypeJson;
    }
}
