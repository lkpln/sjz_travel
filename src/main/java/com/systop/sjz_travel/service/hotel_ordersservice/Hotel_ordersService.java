package com.systop.sjz_travel.service.hotel_ordersservice;

import com.systop.sjz_travel.Mapper.Hotel_ordersMapper;
import com.systop.sjz_travel.common.Result;
import com.systop.sjz_travel.common.StatusCode;
import com.systop.sjz_travel.pojo.Hotel_orders;
import com.systop.sjz_travel.pojo.User;
import com.systop.sjz_travel.service.hotelservice.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface Hotel_ordersService {


    public Result add(Hotel_orders orders, User user, String id, Integer qty, String begin, String end);
}
