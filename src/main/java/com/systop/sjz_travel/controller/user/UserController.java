package com.systop.sjz_travel.controller.user;

import com.systop.sjz_travel.pojo.User;
import com.systop.sjz_travel.service.userservice.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private Userservice userservice;
    //用户登录登录
    @RequestMapping(value = "/userlogin",method = RequestMethod.POST)
    @ResponseBody
    public int userlogin(User user, @RequestParam("name") String name,
                         @RequestParam("password") String password){
        user.setName(name);
        user.setPassword(password);
        User u = userservice.userlogin(user);
        if(u==null){
            return 0;
        }else {
            return 1;
        }


    }
}
