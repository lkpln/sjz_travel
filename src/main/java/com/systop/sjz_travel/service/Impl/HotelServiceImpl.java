package com.systop.sjz_travel.service.Impl;

import com.systop.sjz_travel.Mapper.HotelMapper;
import com.systop.sjz_travel.pojo.Hotel;
import com.systop.sjz_travel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.List;

@Service
@Transactional
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelMapper hotelMapper;

    @Override
    public List<Hotel> SelectAllHotel(Hotel hotel){
        return hotelMapper.SelectAllHotel(hotel);
    }

    @Override
    public Integer AddHotel(Hotel hotel) {
        return hotelMapper.AddHotel(hotel);
    }

    @Override
    public Integer UpdateHotel(Hotel hotel) {
        return hotelMapper.UpdateHotel(hotel);
    }

    @Override
    public Integer DeleteHotel(Hotel hotel) {
        return hotelMapper.DeleteHotel(hotel);
    }
}
