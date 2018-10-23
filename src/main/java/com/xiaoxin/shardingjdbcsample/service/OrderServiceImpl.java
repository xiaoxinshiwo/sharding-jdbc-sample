package com.xiaoxin.shardingjdbcsample.service;

import com.xiaoxin.shardingjdbcsample.mapper.TOrderItemMapper;
import com.xiaoxin.shardingjdbcsample.mapper.TOrderMapper;
import com.xiaoxin.shardingjdbcsample.model.TOrder;
import com.xiaoxin.shardingjdbcsample.model.TOrderItem;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.List;
import java.util.Random;

/**
 * @author zhangyongxin
 * @date 2018/10/19 11:48 AM
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class OrderServiceImpl implements OrderService {
    @Resource
    private TOrderMapper orderMapper;

    @Resource
    private TOrderItemMapper orderItemMapper;

    @Override
    public BigInteger add() {
        TOrder order = new TOrder();
        order.setUserId(this.randomValue());
        order.setStatus("0");
        orderMapper.insert(order);
        for(int i=0;i<this.randomValue() % 5;i++){
            TOrderItem orderItem = new TOrderItem();
            orderItem.setOrderId(order.getOrderId());
            orderItem.setItemId(this.randomValue());
            orderItem.setPrice(this.randomValue());
            orderItemMapper.insert(orderItem);
        }
        return order.getOrderId();
    }

    @Override
    public TOrder query(BigInteger orderId) {
        TOrder order = orderMapper.selectByPrimaryKey(orderId);
        if(order != null){
            TOrderItem orderItem = new TOrderItem();
            orderItem.setOrderId(order.getOrderId());
            List<TOrderItem> orderItemList = orderItemMapper.select(orderItem);
            order.setItemList(orderItemList);
        }
        return order;
    }

    @Override
    public boolean update(TOrder order) {
        int count = orderMapper.updateByPrimaryKeySelective(order);
        if(order.getItemList()!=null && order.getItemList().size() >0){
            for(TOrderItem item : order.getItemList()){
                orderItemMapper.updateByPrimaryKeySelective(item);
            }
        }
        return count > 0;
    }

    @Override
    public boolean delete(BigInteger orderId) {
        TOrder order = orderMapper.selectByPrimaryKey(orderId);
        TOrderItem orderItem = new TOrderItem();
        orderItem.setOrderId(order.getOrderId());
        orderItemMapper.delete(orderItem);
        int count = orderMapper.deleteByPrimaryKey(orderId);
        return count > 0;
    }

    @Override
    public List<TOrder> queryByUserId(Integer userId) {
        TOrder order = new TOrder();
        order.setUserId(userId);
        List<TOrder> orderList =  orderMapper.select(order);

        return orderList;
    }

    private int randomValue(){
        Random random = new Random();
        return Math.abs(random.nextInt());
    }
}
