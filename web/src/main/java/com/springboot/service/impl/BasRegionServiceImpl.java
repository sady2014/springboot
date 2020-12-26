package com.springboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.springboot.entity.BasRegion;
import com.springboot.mapper.BasRegionMapper;
import com.springboot.service.IBasRegionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 产品地区信息 服务实现类
 * </p>
 *
 * @author Mugua
 * @since 2020-12-21
 */
@Service
public class BasRegionServiceImpl extends ServiceImpl<BasRegionMapper, BasRegion> implements IBasRegionService {
    @Autowired
    private BasRegionMapper basRegionMapper;

    /**
     * <p>
     *
     * </p>
     * @param basRegion
     * @return
     */
    @Override
    public List getInfo(BasRegion basRegion) {
        System.out.println(basRegion.getRegionId());
        QueryWrapper<BasRegion> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("id", "RegionName", "RegionID");
        queryWrapper.like("RegionID", basRegion.getRegionId());
        List<BasRegion> list = basRegionMapper.selectList(queryWrapper);
        return list;
    }
}
