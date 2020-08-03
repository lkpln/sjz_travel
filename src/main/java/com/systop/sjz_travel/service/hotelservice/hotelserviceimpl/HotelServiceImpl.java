package com.systop.sjz_travel.service.hotelservice.hotelserviceimpl;

import com.systop.sjz_travel.Mapper.HotelMapper;
import com.systop.sjz_travel.pojo.Hotel;
import com.systop.sjz_travel.service.hotelservice.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public Hotel SelectById(String id) { return (Hotel) hotelMapper.SelectById(id); }

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

    /**
     * 功能描述: <br>
     *
     * @param country
     * @Info: 根据城市名字进行模糊查询
     * @Return:
     * @Author: 李航飞
     * @Date: 2020/7/30 10:30
     */
    @Override
    public List<Hotel> findByCountryLike(String country) {
        return null;
    }
}
