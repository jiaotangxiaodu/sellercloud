package com.imooc.cloudseller.order.repository;

import com.imooc.cloudseller.order.OrderApplicationTests;
import com.imooc.cloudseller.order.po.OrderMaster;
import com.netflix.discovery.converters.Auto;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class OrderMasterRepositoryTest extends OrderApplicationTests {
    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Test
    public void testSave(){
        OrderMaster orderMaster = new OrderMaster("1","zs","110","cn","1",1000,1,0,null,null);
        orderMasterRepository.save(orderMaster);
    }

}