package com.systop.sjz_travel.service.ordersservice.ordersserviceimpl;

import com.systop.sjz_travel.Mapper.OrdersMapper;
import com.systop.sjz_travel.service.hotel_ordersservice.Hotel_ordersService;
import com.systop.sjz_travel.service.hotelservice.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrdersServiceImpl {

    @Autowired
    private HotelService hotelService;

    @Autowired
    private Hotel_ordersService hotel_ordersService;

    @Autowired
    private OrdersMapper ordersMapper;
}

