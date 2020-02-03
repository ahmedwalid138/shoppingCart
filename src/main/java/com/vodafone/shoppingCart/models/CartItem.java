package com.vodafone.shoppingCart.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity (name = "cart_items")
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cart_item_id;
    private int cart_item_product_id;
    private int cart_item_quantity;
    private double cart_item_total;

}
