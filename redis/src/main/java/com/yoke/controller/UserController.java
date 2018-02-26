package com.yoke.controller;

import com.yoke.obj.User;
import com.yoke.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Api(description = "用户")
public class UserController {

    @Autowired
    private UserService userService;
    @ApiOperation(value = "获取某个用户的个人信息",notes = "根据用户id查询相关信息")
    @ApiImplicitParam(name = "id",value = "实体类用户id",required = true,dataType = "String")
    @GetMapping("/find/{id}")
    public User findOne (@PathVariable("id") Integer id){
        return userService.find(id);
    }
}
