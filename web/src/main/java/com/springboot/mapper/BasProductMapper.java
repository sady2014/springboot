package com.springboot.mapper;

import com.springboot.entity.BasProduct;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 产品信息记录 Mapper 接口
 * </p>
 *
 * @author Mugau
 * @since 2020-12-26
 */
@Mapper
public interface BasProductMapper extends BaseMapper<BasProduct> {

}
