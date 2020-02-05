package com.vodafone.saafana.service;

import com.vodafone.saafana.repositories.ProductRepository;
import com.vodafone.saafana.service.modelMapper.ModelMapperSingleton;
import com.vodafone.saafana.service.models.Product;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        List<com.vodafone.saafana.repositories.model.Product> repositoryProducts = (List<com.vodafone.saafana.repositories.model.Product>) productRepository.findAll();
        List<Product> serviceProducts = new ArrayList<>();
        ModelMapper modelMapper = ModelMapperSingleton.getInstance();
        for (com.vodafone.saafana.repositories.model.Product product:repositoryProducts) {
            Product serviceProduct = modelMapper.map(product,Product.class);
            serviceProducts.add(serviceProduct);
        }
        return serviceProducts;

    }

    public boolean addProduct(@RequestBody Product product) {
        try {
            ModelMapper modelMapper = ModelMapperSingleton.getInstance();
            com.vodafone.saafana.repositories.model.Product repositoryProduct = modelMapper.map(product, com.vodafone.saafana.repositories.model.Product.class);
            productRepository.save(repositoryProduct);
            return true;

        }catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }


}
