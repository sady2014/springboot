package com.springboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.springboot.entity.Userinfo;
import com.springboot.mapper.UserinfoMapper;
import com.springboot.service.UserinfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Mugua
 * @since 2020-12-09
 */
@Service
public class UserinfoServiceImpl extends ServiceImpl<UserinfoMapper, Userinfo> implements UserinfoService {
    @Autowired
    private UserinfoMapper userinfoMapper;

}
