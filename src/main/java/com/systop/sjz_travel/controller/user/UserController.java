package com.systop.sjz_travel.controller.user;

import com.systop.sjz_travel.pojo.User;
import com.systop.sjz_travel.service.userservice.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@RestController
public class UserController {
    @Autowired
    private BCryptPasswordEncoder encoder;
    @Autowired
    private Userservice userservice;
    //用户登录

    @RequestMapping(value = "/userlogin",method = RequestMethod.POST)
    @ResponseBody
    public User userlogin(User user, @RequestParam("name") String name,
                         @RequestParam("password") String password){

        user.setName(name);
        user.setPassword(password);

        User u = userservice.userlogin(user);
        System.out.println(u);
        if(u!=null){
            return u;
        }else {
            return null;
        }
    }
//用户注册

    @RequestMapping(value = "/userzhuce",method = RequestMethod.POST)
    @ResponseBody
    public User userzhuce(User user,@RequestParam("name") String name,
                         @RequestParam("password") String password,
                         @RequestParam("mobile") String mobile,
                         @RequestParam("email") String email,
                         @RequestParam("sex") String sex){

        System.out.println(password);
        user.setName(name);
        user.setPassword(encoder.encode(user.getPassword()));
        user.setMobile(mobile);
        user.setEmail(email);
        user.setSex(sex);

        userservice.userzhuce(user);


            return user;
    }

    //找回密码
    @RequestMapping(value = "/userpassback",method = RequestMethod.POST)
    @ResponseBody
    public User userpassback(User user,@RequestParam("name") String name,
                            @RequestParam("email") String email){
        user.setName(name);
        user.setEmail(email);
        User u = userservice.userpassback(user);
        return u;
    }
    //查询用户信息
    @RequestMapping(value = "/userselectbyid",method = RequestMethod.POST)
    @ResponseBody
    public User userselectbyid(User user,@RequestParam("id") String id){
        user.setId(id);
        return userservice.userselectbyid(user);
    }
    //修改个人信息
    @RequestMapping(value = "/userupdate",method = RequestMethod.POST)
    @ResponseBody
    public int userupdate(User user,@RequestParam("id") String id,
                          @RequestParam("name") String name,
                          @RequestParam("password") String password,
                          @RequestParam("mobile") String mobile,
                          @RequestParam("email") String email,
                          @RequestParam("sex") String sex){
        user.setId(id);
        user.setName(name);
        user.setPassword(password);
        user.setMobile(mobile);
        user.setEmail(email);
        user.setSex(sex);
        int u = userservice.userupdate(user);
        return 1;
    }
}
