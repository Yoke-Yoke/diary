package com.yoke.dao;

import com.yoke.obj.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    @Insert("insert user(username,password) values(#{username},#{password})")
    int insert(User user);

    @Update("update user set username = #{username} where id=#{id} ")
    User update(User u);

    @Delete("delete from user where id=#{id} ")
    int delete(int id);

    @Select("select * from user where id=#{id} ")
    User find(@Param("id") int id);
}
