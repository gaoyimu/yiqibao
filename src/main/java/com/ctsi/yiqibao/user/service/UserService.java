package com.ctsi.yiqibao.user.service;

import com.ctsi.yiqibao.user.pojo.User;

public interface UserService {
    User getUser(String openId);

    int insertUser(User user);

    int updateUserByOpenId(User user);
}
