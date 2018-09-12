package com.ctsi.yiqibao.user.mapper;

import com.ctsi.yiqibao.user.pojo.User;

public interface UserMapper {
    User getUser(String openId);

    int insertUser(User user);

    int updateUserByOpenId(User user);
}
