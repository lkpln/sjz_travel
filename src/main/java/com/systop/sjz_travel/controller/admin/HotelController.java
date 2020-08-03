package com.systop.sjz_travel.controller.admin;

import com.systop.sjz_travel.common.Result;
import com.systop.sjz_travel.common.StatusCode;
import com.systop.sjz_travel.pojo.Hotel;
import com.systop.sjz_travel.service.hotelservice.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author lenovo
 */
@RestController
@CrossOrigin //跨域访问不同模块的
@RequestMapping("/hotel")
public class HotelController {

//    把service注入
    @Autowired
    private HotelService hotelService;



    /**
     * 功能描述: <br>
     * @Info: //查询全部酒店信息
     * @Return: java.util.List<com.systop.sjz_travel.pojo.Hotel>
     * @Author: 李航飞
     * @Date: 2020/7/30 9:47
     */
    @ResponseBody
    @RequestMapping(value = "/findAll",method = RequestMethod.POST)
    public List<Hotel> findAllHotel(){
        Hotel hotel = new Hotel();
        return  hotelService.SelectAllHotel(hotel);
    }

    /**
     * 功能描述: <br>
     * @Info:     根据id查询酒店信息
     * @Return: java.lang.Integer
     * @Author: 李航飞
     * @Date: 2020/7/30 9:47
     */
    @ResponseBody
    @RequestMapping(value = "/findById",method = RequestMethod.POST)
    public  List<Hotel> findById(){
        Hotel hotel = new Hotel();
        return  hotelService.SelectById(hotel);
    }

    /**
     * 功能描述: <br>
     * @Info: //添加酒店信息
     * @Return: java.lang.Integer
     * @Author: 李航飞
     * @Date: 2020/7/30 10:03
     */
    @ResponseBody
    @RequestMapping(value = "/addhotel",method = RequestMethod.POST)
    public  Integer AddHotel(@RequestParam String img,@RequestParam String name,
                             @RequestParam Double price, @RequestParam String miaoshu,
                             @RequestParam Integer bed,@RequestParam Integer day,
                             @RequestParam Integer star,@RequestParam java.util.Date startdate,
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

   /**
    * 功能描述: <br>
    * @Info:  //修改酒店信息
    * @Return: java.lang.Integer
    * @Author: 李航飞
    * @Date: 2020/7/30 10:03
    */
    @ResponseBody
    @RequestMapping(value = "/updatehotel",method = RequestMethod.POST)
    public  Integer UpdateHotel(@RequestParam String img,@RequestParam String name,
                             @RequestParam Double price, @RequestParam String miaoshu,
                             @RequestParam Integer bed,@RequestParam Integer day,
                             @RequestParam Integer star,@RequestParam java.util.Date startdate,
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


    /**
     * 功能描述: <br>
     * @Info: //通过id删除酒店信息
     * @Return: java.lang.Integer
     * @Author: 李航飞
     * @Date: 2020/7/30 10:03
     */
    @ResponseBody
    @RequestMapping(value = "/deletehotel",method = RequestMethod.POST)
    public Integer DeleteHotel(@RequestParam String id){
        Hotel hotel = new Hotel();
        hotel.setId(id);
        return hotelService.DeleteHotel(hotel);
    }
}
    /**
     * 根据条件查询
     * @param searchMap
     * @return
     */
//    @ResponseBody
//    @RequestMapping(value="/search",method = RequestMethod.POST)
//    public Result findSearch(@RequestBody Map searchMap){
//        return new Result(true, StatusCode.OK,"查询成功",hotelService.findSearch(searchMap));
//    }
