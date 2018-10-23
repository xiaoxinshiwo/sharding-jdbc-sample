package com.xiaoxin.shardingjdbcsample.service;

import com.xiaoxin.shardingjdbcsample.model.TOrder;

import java.math.BigInteger;
import java.util.List;

/**
 * @author zhangyongxin
 * @date 2018/10/19 11:46 AM
 */
public interface OrderService {

    BigInteger add();

    TOrder query(BigInteger orderId);

    boolean update(TOrder order);

    boolean delete(BigInteger orderId);

    List<TOrder> queryByUserId(Integer userId);
}
