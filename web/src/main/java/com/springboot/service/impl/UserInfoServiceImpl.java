package com.springboot.service.impl;

import com.springboot.dao.UserInfoMapper;
import com.springboot.entity.UserInfo;
import com.springboot.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     * @TODO
     * @return userInfoMapper.getUserInfo();
     */
    @Override
    public List<UserInfo> getUserInfo() {
        return userInfoMapper.getUserInfo();
    }
}
