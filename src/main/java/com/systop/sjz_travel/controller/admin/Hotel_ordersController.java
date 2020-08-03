package com.systop.sjz_travel.controller.admin;

import com.systop.sjz_travel.common.Result;
import com.systop.sjz_travel.common.StatusCode;
import com.systop.sjz_travel.pojo.Hotel_orders;
import com.systop.sjz_travel.pojo.User;
import com.systop.sjz_travel.service.hotel_ordersservice.Hotel_ordersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@CrossOrigin
@RequestMapping("/hotelorders")
public class Hotel_ordersController {

    @Autowired
    private Hotel_ordersService hotel_ordersService;

    /**
     * 功能描述: <br>
     * @Info: 订单增加
     * @Return:
     * @Author: 李航飞
     * @Date: 2020/7/30 15:24
     */
    @ResponseBody
    @RequestMapping(value = "/addhotel",method = RequestMethod.POST)
    public Result add(@RequestBody Hotel_orders orders, HttpSession session){

        //获取数量
        System.out.println("id为--->" + orders.getId());
        System.out.println("数量为--->" + orders.getQty());
        System.out.println("数量为--->" + orders.getBegin());
        System.out.println("数量为--->" + orders.getEnd());
        User user = (User) session.getAttribute("user");
        if (user == null){
            return  new Result(false, StatusCode.ACCESSERROR,"请先登录");
        }
        return hotel_ordersService.add(orders,user,orders.getId(),orders.getQty(),orders.getBegin(),orders.getEnd());
    }
}
