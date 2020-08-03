package com.systop.sjz_travel.Mapper;

import com.systop.sjz_travel.pojo.Hotel;
import com.systop.sjz_travel.pojo.Hotel_orders;
import org.apache.ibatis.annotations.*;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Mapper
public interface Hotel_ordersMapper {

    //查询全部酒店信息
    @Select("select * from hotel_orders")
    List<Hotel> SelectAllHotel(Hotel hotel);

    //添加酒店信息
    @Insert("insert into hotel_orders (img,name,price,miaoshu,bed,day,star,startdate,addr) values (#{img},#{name},#{price},#{miaoshu}," +
            "#{bed},#{day},#{star},#{startdate},#{addr})")
    Integer AddHotelOrders(Hotel hotel);

    //修改酒店信息
    @Update("update hotel_orders set img = #{img},name = #{name}, price = #{price}, miaoshu=#{miaoshu}." +
            "bed = #{bed},day = #{day}, star = #{star},startdate = #{startdate}, addr=#{addr}")
    Integer UpdateHotel(Hotel hotel);

    //通过id删除酒店信息
    @Delete("delete from hotel_orders where id = #{id}")
    Integer DeleteHotel(Hotel hotel);


    @Modifying
    @Transactional
    @Query(value = "UPDATE orders SET `status`='1' WHERE id = ? ",nativeQuery = true)
    void updateStatus(String id);


    List<Hotel_orders> findByUserid(String userId);

    void save(Hotel_orders orders);
}
