package com.systop.sjz_travel.Mapper;

import com.systop.sjz_travel.pojo.Admin;
import com.systop.sjz_travel.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {
    //用户登录
    @Select("select * from user where name=#{name} and password=#{password}")
    User userlogin(User user);
    //用户注册
    @Insert("insert into user (name,password,mobile,email,sex) values (#{name},#{password},#{mobile},#{email},#{sex})")
    Integer userzhuce(User user);
    //找回密码
    @Select("select * from user where name=#{name} and email=#{email}")
    User userpassback(User user);
    //修改密码
    @Update("update user set password=#{password}")
    User userupdatepassword (User user);
    //查询自己的个人信息
    @Select("select * from user where id=#{id}")
    User userselectbyid (User user);
    //修改个人信息
    @Update("update user set name=#{name},password=#{password},mobile=#{mobile},email=#{email} where id=#{id}")
    int userupdate (User user);
}
