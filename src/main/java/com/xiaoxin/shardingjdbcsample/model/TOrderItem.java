package com.xiaoxin.shardingjdbcsample.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;

@Table(name = "t_order_item")
@Getter
@Setter
@ToString
public class TOrderItem {
    @Id
    @Column(name = "order_item_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT UUID_SHORT()" )
    private BigInteger orderItemId;

    @Column(name = "order_id")
    private BigInteger orderId;

    @Column(name = "item_id")
    private Integer itemId;

    private Integer price;

}