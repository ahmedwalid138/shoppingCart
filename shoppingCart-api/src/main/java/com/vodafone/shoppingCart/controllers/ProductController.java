package com.vodafone.shoppingCart.controllers;


import com.vodafone.saafana.service.ProductService;
import com.vodafone.saafana.service.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;


    @GetMapping("getProducts")
    public List<Product> getProducts() {
        return productService.getAllProducts();

    }

    @PostMapping("addProduct")
    boolean addProduct(@ModelAttribute Product newProduct) {
        return productService.addProduct(newProduct);
    }
}
