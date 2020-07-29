package com.systop.sjz_travel.controller.admin;

import com.systop.sjz_travel.pojo.Hotel;
import com.systop.sjz_travel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lenovo
 */
@RestController
@RequestMapping("/hotel")
public class HotelController {

//    把service注入
    @Autowired
    private HotelService hotelService;

    //查询全部酒店信息
    @ResponseBody
    @RequestMapping(value = "/findAll",method = RequestMethod.POST)
    public List<Hotel> findAllHotel(){
        Hotel hotel = new Hotel();
        return  hotelService.SelectAllHotel(hotel);
    }

    //添加酒店信息
    @ResponseBody
    @RequestMapping(value = "/addhotel",method = RequestMethod.POST)
    public  Integer AddHotel(@RequestParam String img,@RequestParam String name,
                             @RequestParam String price, @RequestParam String miaoshu,
                             @RequestParam Integer bed,@RequestParam Integer day,
                             @RequestParam Integer star,@RequestParam String startdate,
                             @RequestParam String addr){
        Hotel hotel = new Hotel();
        hotel.setImg(img);
        hotel.setName(name);
        hotel.setPrice(price);
        hotel.setMiaoshu(miaoshu);
        hotel.setBed(bed);
        hotel.setDay(day);
        hotel.setStar(star);
        hotel.setStartdate(startdate);
        hotel.setAddr(addr);
        return hotelService.AddHotel(hotel);
    }

    //修改酒店信息
    @ResponseBody
    @RequestMapping(value = "/updatehotel",method = RequestMethod.POST)
    public  Integer UpdateHotel(@RequestParam String img,@RequestParam String name,
                             @RequestParam String price, @RequestParam String miaoshu,
                             @RequestParam Integer bed,@RequestParam Integer day,
                             @RequestParam Integer star,@RequestParam String startdate,
                             @RequestParam String addr){
        Hotel hotel = new Hotel();
        hotel.setImg(img);
        hotel.setName(name);
        hotel.setPrice(price);
        hotel.setMiaoshu(miaoshu);
        hotel.setBed(bed);
        hotel.setDay(day);
        hotel.setStar(star);
        hotel.setStartdate(startdate);
        hotel.setAddr(addr);
        return hotelService.UpdateHotel(hotel);
    }


    //通过id删除酒店信息
    @ResponseBody
    @RequestMapping(value = "/deletehotel",method = RequestMethod.POST)
    public Integer DeleteHotel(@RequestParam String id){
        Hotel hotel = new Hotel();
        hotel.setId(id);
        return hotelService.DeleteHotel(hotel);
    }
}
