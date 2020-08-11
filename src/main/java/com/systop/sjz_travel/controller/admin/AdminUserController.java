package com.systop.sjz_travel.controller.admin;

import com.systop.sjz_travel.pojo.Admin;
import com.systop.sjz_travel.pojo.User;
import com.systop.sjz_travel.service.adminservice.Adminservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminUserController {
    @Autowired
    private Adminservice adminservice;
//管理员登录
@RequestMapping(value = "/adminlogin",method = RequestMethod.POST)
@ResponseBody
public Admin adminlogin(Admin admin, @RequestParam("name") String name,
                        @RequestParam("password") String password){
admin.setName(name);
admin.setPassword(password);
Admin a=adminservice.adminlogin(admin);
if(a==null){
    return null;
}else {
    return a;
}

}
    //管理员查询
    @RequestMapping(value = "/finduserall",method = RequestMethod.POST)
    @ResponseBody
        public List<User> finduserall(){
        return adminservice.finduserall();
    }
}
