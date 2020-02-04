package com.vodafone.shoppingCart.services;

import com.vodafone.shoppingCart.models.Product;
import com.vodafone.shoppingCart.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return (List<Product>) productRepository.findAll();
    }

    public Product addProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }


}
