package com.systop.sjz_travel.controller.user;

import com.systop.sjz_travel.common.Result;
import com.systop.sjz_travel.common.StatusCode;
import com.systop.sjz_travel.pojo.Orders;
import com.systop.sjz_travel.service.hotel_ordersservice.Hotel_ordersService;
import com.systop.sjz_travel.service.ordersservice.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @Autowired
    private Hotel_ordersService hotel_ordersService;


    public List<Orders> findAll(){

        return  ordersService.findAll(Orders);
    }

}
