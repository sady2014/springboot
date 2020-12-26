package com.springboot.service.impl;

import com.springboot.entity.BasProduct;
import com.springboot.mapper.BasProductMapper;
import com.springboot.service.IBasProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品信息记录 服务实现类
 * </p>
 *
 * @author Mugau
 * @since 2020-12-26
 */
@Service
public class BasProductServiceImpl extends ServiceImpl<BasProductMapper, BasProduct> implements IBasProductService {

}
