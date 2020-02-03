package com.vodafone.shoppingCart.models;


import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int productID;
    @Column(name = "product_code")
    private String productCode;
    @Column(name = "product_description")
    private String productDescription;
    @Column(name = "product_quantity")
    private int productQuantity;
    @Column(name = "product_price")
    private double productPrice;
    @Column(name = "product_last_update")
    private Date productLastUpdate;
    @JoinColumn(name="category_id", referencedColumnName = "category_id")
    @ManyToOne(optional = false,targetEntity = Category.class)
    private Category category;
    @Lob
    @Type(type="org.hibernate.type.BinaryType")
    private byte [] product_image;


}

