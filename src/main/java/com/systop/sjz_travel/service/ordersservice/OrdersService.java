package com.systop.sjz_travel.service.ordersservice;

import com.systop.sjz_travel.Mapper.Hotel_ordersMapper;
import com.systop.sjz_travel.Mapper.OrdersMapper;
import com.systop.sjz_travel.Util.IdWorker;
import com.systop.sjz_travel.pojo.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public interface OrdersService {

    public List<Orders> findAll(Orders orders);
}
