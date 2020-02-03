package com.vodafone.shoppingCart.models;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class CustomerOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int order_id;
    private double order_total_price;
    private Date order_date;
    private String order_status;
    private int order_customer_id;
    private List<CartItem> order_cart_items;

}
