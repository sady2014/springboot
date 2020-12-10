package com.springboot.mapper;

import com.springboot.entity.Userinfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Mugua
 * @since 2020-12-09
 */

@Mapper
public interface UserinfoMapper extends BaseMapper<Userinfo> {

}
