package com.vodafone.shoppingCart.services;

import com.vodafone.shoppingCart.models.Product;

import java.util.List;


public interface ProductService {

    List<Product> getAllProducts();
    Product addProduct(Product product);

}
