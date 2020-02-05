package com.vodafone.saafana.service;


import com.vodafone.saafana.service.models.Product;

import java.util.List;


public interface ProductService {

    List<Product> getAllProducts();
    boolean addProduct(Product product);

}
