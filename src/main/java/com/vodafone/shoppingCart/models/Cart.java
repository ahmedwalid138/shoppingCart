package com.vodafone.shoppingCart.models;


import lombok.Data;

import javax.persistence.Entity;
import java.util.List;

@Data
@Entity(name = "cart")
public class Cart {

    private List<CartItem> cart_items;
    private double cart_total;

}
