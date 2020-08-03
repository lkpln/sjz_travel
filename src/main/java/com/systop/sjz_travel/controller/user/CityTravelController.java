package com.systop.sjz_travel.controller.user;

import com.systop.sjz_travel.Mapper.HotelMapper;
import com.systop.sjz_travel.service.hotelservice.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin
@RequestMapping("/travel")
public class CityTravelController {

    @Autowired
    private HotelService hotelService;

    @Autowired
    private HotelMapper hotelMapper;



}
