package com.systop.sjz_travel.Mapper;

import com.systop.sjz_travel.pojo.Admin;
import com.systop.sjz_travel.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface UserMapper {
    //管理员登录
    @Select("select * from user where name=#{name} and password=#{password}")
    User userlogin(User user);
}
