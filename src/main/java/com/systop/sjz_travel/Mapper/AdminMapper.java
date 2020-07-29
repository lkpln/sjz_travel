package com.systop.sjz_travel.Mapper;

import com.systop.sjz_travel.pojo.Admin;
import com.systop.sjz_travel.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AdminMapper {
    //查询用户信息
    @Select("select * from user")
    List<User> finduserall();
//管理员登录
    @Select("select * from admin where name=#{name} and password=#{password}")
    Admin adminlogin(Admin admin);
}
