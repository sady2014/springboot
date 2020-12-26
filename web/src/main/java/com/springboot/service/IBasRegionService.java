package com.springboot.service;

import com.springboot.entity.BasRegion;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 产品地区信息 服务类
 * </p>
 *
 * @author Mugua
 * @since 2020-12-21
 */
public interface IBasRegionService extends IService<BasRegion> {
    public List getInfo(BasRegion basRegion);
}
