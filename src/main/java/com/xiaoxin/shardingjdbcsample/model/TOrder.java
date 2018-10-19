package com.xiaoxin.shardingjdbcsample.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;

@Table(name = "t_order")
@Getter
@Setter
@ToString
public class TOrder {
    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT UUID_SHORT()" )
    private BigInteger orderId;

    @Column(name = "user_id")
    private Integer userId;

    private String status;

    private List<TOrderItem> itemList;
}