package com.vodafone.shoppingCart.controllers;


import com.vodafone.shoppingCart.models.Product;
import com.vodafone.shoppingCart.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    Product addProduct(@ModelAttribute Product newProduct) {
        return productService.addProduct(newProduct);
    }
}
