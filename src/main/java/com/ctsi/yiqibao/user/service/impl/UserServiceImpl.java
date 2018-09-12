package com.ctsi.yiqibao.user.service.impl;

import com.ctsi.yiqibao.user.mapper.UserMapper;
import com.ctsi.yiqibao.user.pojo.User;
import com.ctsi.yiqibao.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUser(String openId) {
        return userMapper.getUser(openId);
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public int updateUserByOpenId(User user) {
        return userMapper.updateUserByOpenId(user);
    }
}
