package com.systop.sjz_travel.service.hotel_ordersservice.hotel_ordersserviceimpl;

import com.systop.sjz_travel.Mapper.Hotel_ordersMapper;
import com.systop.sjz_travel.Util.BigDecimalUtil;
import com.systop.sjz_travel.Util.DateTimeUtil;
import com.systop.sjz_travel.Util.IdWorker;
import com.systop.sjz_travel.common.Result;
import com.systop.sjz_travel.common.StatusCode;
import com.systop.sjz_travel.pojo.Hotel;
import com.systop.sjz_travel.pojo.Hotel_orders;
import com.systop.sjz_travel.pojo.User;
import com.systop.sjz_travel.service.hotel_ordersservice.Hotel_ordersService;
import com.systop.sjz_travel.service.hotelservice.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author lenovo
 */
@Service
@Transactional
public class Hotel_OrdersServiceImpl implements Hotel_ordersService {

        @Autowired
       private Hotel_ordersMapper hotel_ordersMapper;
        @Autowired
        private HotelService hotelService;
        @Autowired
        private IdWorker idWorker;

    /**
     * 功能描述: <br>
     * @Info: 增加
     * @Return: com.systop.sjz_travel.common.Result
     * @Author: 李航飞
     * @Date: 2020/8/3 9:44
     */
    @Override
    public Result add(Hotel_orders orders, User user, String scenicid, Integer qty, String begin, String end) {
        //通过商品id寻找商品
        Hotel hotel = hotelService.SelectById(scenicid);
        System.out.println("hotel+++++++++++++++++++"+hotel);

//        计算总金额
        double count = 0;
        BigDecimal payment = BigDecimalUtil.mul(hotel.getPrice(),count);

        int stock = hotel.getBed();
        //检验库存
        if (stock<count){
            return new Result(false,StatusCode.ERROR,"库存不足");
        }else{
            //减少库存数量
            int newStock = (int) (hotel.getBed() - count);
            System.out.println("新的库存"+newStock);
            hotel.setBed(newStock);
            hotelService.UpdateHotel(hotel);
        }

        //获取当前时间
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = df.format(new Date());

        //存入数据库
        orders.setId( idWorker.nextId()+"");
        orders.setUserid(user.getId());
        orders.setPayment(payment);
        orders.setQty((int) count);
        orders.setPhone(user.getMobile());
        orders.setScenicid(scenicid);
        orders.setStatus("0");
        orders.setPaytime(DateTimeUtil.strToDate(date,"yyyy-MM-dd HH:mm:ss"));
        orders.setUsername(user.getName());
        orders.setScenicname(hotel.getName());
        orders.setBegin(begin);
        orders.setEnd(end);
        hotel_ordersMapper.save(orders);
        return new Result(true, StatusCode.OK,"添加成功");
    }

    /**
     * 根据ID查询实体
     * @param userId
     * @return
     */
    public List<Hotel_orders> hotel_orders(String userId){
        return hotel_ordersMapper.findByUserid(userId);
    }


}

