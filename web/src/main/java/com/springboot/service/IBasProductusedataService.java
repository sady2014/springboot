package com.springboot.service;

import com.springboot.entity.BasProductusedata;
import com.baomidou.mybatisplus.extension.service.IService;
import com.springboot.util.LayuiTypeJson;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Mugau
 * @since 2020-12-26
 */
public interface IBasProductusedataService extends IService<BasProductusedata> {
    List<BasProductusedata> getInfo(BasProductusedata basProductusedata);
}
