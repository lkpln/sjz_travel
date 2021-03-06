package com.systop.sjz_travel.Mapper;

import com.systop.sjz_travel.pojo.Hotel;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface HotelMapper  {


    //查询全部酒店信息
    @Select("select * from hotel")
    List<Hotel> SelectAllHotel(Hotel hotel);

    @Select("select * from hotel where id=#{?}")
    List<Hotel> SelectById(String hotel);

    //添加酒店信息
    @Insert("insert into hotel (img,name,price,miaoshu,bed,day,star,startdate,addr) values (#{img},#{name},#{price},#{miaoshu}," +
            "#{bed},#{day},#{star},#{startdate},#{addr})")
    Integer AddHotel(Hotel hotel);

    //修改酒店信息
    @Update("update hotel set img = #{img},name = #{name}, price = #{price}, miaoshu=#{miaoshu}." +
            "bed = #{bed},day = #{day}, star = #{star},startdate = #{startdate}, addr=#{addr}")
    Integer UpdateHotel(Hotel hotel);

    //通过id删除酒店信息
    @Delete("delete from hotel where id = #{id}")
    Integer DeleteHotel(Hotel hotel);

    //根据城市名字模糊查询
    @Select("select * from hotel where name like '%嘿嘿%'")
    List<Hotel> findByAddrLike(String addr);
}
