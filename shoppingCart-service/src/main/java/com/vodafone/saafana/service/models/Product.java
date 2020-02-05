package com.vodafone.saafana.service.models;

import com.vodafone.saafana.repositories.model.Category;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Data
public class Product {
    private int productID;
    private String productCode;
    private String productDescription;
    private int productQuantity;
    private double productPrice;
    private Date productLastUpdate;
    private Category category;
    private MultipartFile product_image;
}
