package com.systop.sjz_travel.service.adminservice;

import com.systop.sjz_travel.pojo.Admin;
import com.systop.sjz_travel.pojo.User;

import java.util.List;

public interface Adminservice {
//管理员查询用户
public List<User> finduserall();
//管理员登录
    public Admin adminlogin(Admin admin);
}
