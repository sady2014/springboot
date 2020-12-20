package com.springboot.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.springboot.entity.BasRegion;
import com.springboot.service.IBasRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 产品地区信息 前端控制器
 * </p>
 *
 * @author Mugua
 * @since 2020-12-21
 */
@RestController
@RequestMapping("/bas-region")
public class BasRegionController {
    @Autowired
    private IBasRegionService iBasRegionService;

    /**
     * 返回所有的地区信息
     *
     * @return iBasRegionService.list()
     * @description 管理员接口
     * @author Mugua
     */
    @GetMapping("/getAllRegion")
    public List getAllRegion() {
        return iBasRegionService.list();
    }

    /**
     * 根据id 显示信息
     * @param regionName
     * @return
     * @date 2020年12月21日
     */


    @GetMapping("/getRegionByName")
    public List getRegionByName(String regionName) {
//        QueryWrapper
        QueryWrapper<BasRegion> queryWrapper = new QueryWrapper<>();
        System.out.printf(regionName);
        queryWrapper.eq("RegionName",regionName);
        return iBasRegionService.list(queryWrapper);
    }

}
