package com.vodafone.shoppingCart.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int category_id;
    private String category_name;
    private Date category_date;
    @OneToMany(targetEntity=Product.class, mappedBy = "category")
    @JsonManagedReference
    private List<Product> products = new ArrayList<Product>();

}
