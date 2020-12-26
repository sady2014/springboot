package com.springboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.springboot.entity.BasProductusedata;
import com.springboot.mapper.BasProductusedataMapper;
import com.springboot.service.IBasProductusedataService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springboot.util.LayuiTypeJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Mugau
 * @since 2020-12-26
 */
@Service
public class BasProductusedataServiceImpl extends ServiceImpl<BasProductusedataMapper, BasProductusedata> implements IBasProductusedataService {
    @Autowired
    private BasProductusedataMapper basProductusedataMapper;
    public List<BasProductusedata> getInfo(BasProductusedata basProductusedata) {
        System.out.println(basProductusedata.getKeySN());
        QueryWrapper<BasProductusedata> queryWrapper=new QueryWrapper<>();
        queryWrapper.select("id", "ProductName", "RegionId", "RegionName", "KeySerial", "KeySN","Version",
                "InnerVersion","IP","KeySNType","LoginName","OSVersion","LastOut","LoginDateLocal","LoginDateServer","Province",
                "City", "IPAddress");
        queryWrapper.eq("KeySN", basProductusedata.getKeySN());
        long startTime = System.currentTimeMillis();
        List<BasProductusedata> list = basProductusedataMapper.selectList(queryWrapper);
        long endTime = System.currentTimeMillis();
        System.out.println("中间耗时"+(endTime-startTime));
        return list;
    }
}
