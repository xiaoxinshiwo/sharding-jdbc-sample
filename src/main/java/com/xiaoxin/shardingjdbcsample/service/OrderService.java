package com.xiaoxin.shardingjdbcsample.service;

import com.xiaoxin.shardingjdbcsample.model.TOrder;

import java.math.BigInteger;

/**
 * @author zhangyongxin
 * @date 2018/10/19 11:46 AM
 */
public interface OrderService {

    BigInteger add();

    TOrder query(Integer orderId);

    boolean update(TOrder order);

    boolean delete(Integer orderId);
}
