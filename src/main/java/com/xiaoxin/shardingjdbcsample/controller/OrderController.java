package com.xiaoxin.shardingjdbcsample.controller;

import com.xiaoxin.shardingjdbcsample.model.TOrder;
import com.xiaoxin.shardingjdbcsample.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

/**
 * @author zhangyongxin
 * @date 2018/10/19 11:41 AM
 */
@RestController
@RequestMapping("order")
public class OrderController {

    private static final String SUCCESS = "SUCCESS";
    private static final String ERROR = "ERROR";

    @Autowired
    private OrderService orderService;

    @PostMapping("add")
    public BigInteger add(){
        return orderService.add();
    }

    @GetMapping("query/{orderId}")
    public TOrder query(@PathVariable Integer orderId){
        return orderService.query(orderId);
    }

    @PostMapping("delete/{orderId}")
    public String delete(@PathVariable Integer orderId){
        boolean success =  orderService.delete(orderId);
        return success ? SUCCESS : ERROR;
    }

    @PostMapping("update")
    public String update(@RequestBody TOrder order){
        boolean success =  orderService.update(order);
        return success ? SUCCESS : ERROR;
    }
}
