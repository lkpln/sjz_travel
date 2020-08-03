package com.systop.sjz_travel.service.hotelservice;

import com.systop.sjz_travel.pojo.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HotelService {

    //查询所有的酒店信息
    public List<Hotel> SelectAllHotel(Hotel hotel);

    //根据id查询酒店信息
    public Hotel SelectById(String id );

    //添加酒店信息
    public Integer AddHotel(Hotel hotel);

    //修改酒店信息
    public Integer UpdateHotel(Hotel hotel);

    //通过id删除酒店信息
    public Integer DeleteHotel(Hotel hotel);


    /**
     * 功能描述: <br>
     * @Info: 条件查询和分页
     * @Return:
     * @Author: 李航飞
     * @Date: 2020/7/30 10:18
     * @return
     */
//    public List<Hotel> findsearch(Map whereMap, int page, int size){
//        Specification<Hotel> specification = createSpecification(whereMap);
//        PageRequest pageRequest = PageRequest.of(page-1,size);
//        return hotelMapper.SelectAllHotel(specification,pageRequest);
//    }
//
//    private Specification<Hotel> createSpecification(Map whereMap) {
//    }



    /**
     * 功能描述: <br>
     * @Info: 根据城市名字进行模糊查询
     * @Return:
     * @Author: 李航飞
     * @Date: 2020/7/30 10:30
     */

    public  List<Hotel> findByCountryLike(String country);


}
