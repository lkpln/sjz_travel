package com.systop.sjz_travel.service;

import com.systop.sjz_travel.pojo.Hotel;

import java.util.List;

public interface HotelService {


    //查询所有的酒店信息
    List<Hotel> SelectAllHotel(Hotel hotel);

    //添加酒店信息
    Integer AddHotel(Hotel hotel);

    //修改酒店信息
    Integer UpdateHotel(Hotel hotel);

    //通过id删除酒店信息
    Integer DeleteHotel(Hotel hotel);
}
