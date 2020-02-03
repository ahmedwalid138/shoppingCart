package com.vodafone.shoppingCart.models;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity(name = "products")
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int product_id;
    private String product_code;
    private String product_description;
    private int product_quantity;

//    @Lob
//    @Type(type="org.hibernate.type.BinaryType")
//    private byte [] product_image;
    private double product_price;
    private Date product_last_update;
    private int product_category_id;

}
