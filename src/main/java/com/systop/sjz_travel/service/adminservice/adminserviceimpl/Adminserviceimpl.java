package com.systop.sjz_travel.service.adminservice.adminserviceimpl;

import com.systop.sjz_travel.Mapper.AdminMapper;
import com.systop.sjz_travel.pojo.Admin;
import com.systop.sjz_travel.pojo.User;
import com.systop.sjz_travel.service.adminservice.Adminservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class Adminserviceimpl implements Adminservice {
    @Autowired
    private AdminMapper adminmapper;


    //管理员查询用户
    @Override
    public List<User> finduserall() {

        return adminmapper.finduserall();
    }

    @Override
    public Admin adminlogin(Admin admin) {
        return adminmapper.adminlogin(admin);
    }
}
