package com.systop.sjz_travel.Mapper;

import com.systop.sjz_travel.pojo.Hotel;
import com.systop.sjz_travel.pojo.Orders;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface OrdersMapper {

    //查询全部订单信息
    @Select("select * from orders")
    List<Orders> SelectAllOrders(Orders orders);
}
