package org.example.bigevent.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.example.bigevent.pojo.User;

/**
 * Author: Vivienne
 */
@Mapper
public interface UserMapper {
    @Select("select * from user where username=#{username}")
    //根据用户名查询用户
    public User findByUsername(String username);


    @Insert("insert into user (username,password,create_time,update_time)"+
            "values (#{username},#{password},now(),now())")
    //添加用户
    public void add(String username, String password);
    
    @Update("update user set nickname=#{nickname},email=#{email},update_time=#{updateTime} where id=#{id}")
    void update(User user);
}
