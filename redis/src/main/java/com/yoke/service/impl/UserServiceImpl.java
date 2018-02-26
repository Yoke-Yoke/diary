package com.yoke.service.impl;

import com.yoke.dao.UserMapper;
import com.yoke.obj.User;
import com.yoke.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
//开启申明的类参与缓存
@CacheConfig(cacheNames = "user")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Cacheable  //配置方法的缓存参数，可以自定义缓存的key和value
    @Override
    public User find(int id) {
        System.out.println("test");
        return userMapper.find(id);
    }
}
