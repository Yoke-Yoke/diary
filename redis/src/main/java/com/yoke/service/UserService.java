package com.yoke.service;

import com.yoke.obj.User;

public interface UserService {
    /**
     * 根据用户id查询用户信息
     * @param id 用户的id
     * @return  用户
     */
    User find(int id);
}
