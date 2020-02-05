package com.vodafone.saafana.repositories.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity(name = "products")
public class Product implements Serializable {
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
    @JsonBackReference
    private Category category;
    @Transient
    private MultipartFile product_image;


}

