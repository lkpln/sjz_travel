package com.systop.sjz_travel.service.userservice.Userserviceimpl;

import com.systop.sjz_travel.Mapper.UserMapper;
import com.systop.sjz_travel.pojo.User;
import com.systop.sjz_travel.service.userservice.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Userserviceimpl implements Userservice {
    @Autowired
    private UserMapper usermapper;

    @Override
    public User userlogin(User user) {
        return usermapper.userlogin(user);
    }

    @Override
    public Integer userzhuce(User user) {
        return usermapper.userzhuce(user);
    }

    @Override
    public User userpassback(User user) {
        return usermapper.userpassback(user);
    }

    @Override
    public User userupdatepassword(User user) {
        return usermapper.userupdatepassword(user);
    }

    @Override
    public User userselectbyid(User user) {
        return usermapper.userselectbyid(user);
    }

    @Override
    public int userupdate(User user) {
        return usermapper.userupdate(user);
    }
}
