package com.systop.sjz_travel.service.userservice;

import com.systop.sjz_travel.pojo.User;

public interface Userservice {
    //用户登录
    User userlogin(User user);
    //用户注册
    Integer userzhuce(User user);
    //找回密码
    User userpassback(User user);
    //修改密码
    User userupdatepassword (User user);
    //查询个人信息
    User userselectbyid (User user);
    //修改个人信息
    int userupdate (User user);
}
