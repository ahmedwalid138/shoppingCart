package com.vodafone.saafana.service.models;



import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class Category {

    private int category_id;
    private String category_name;
    private Date category_date;
    private List<Product> products = new ArrayList<Product>();

}
