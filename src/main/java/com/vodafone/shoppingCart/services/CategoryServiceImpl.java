package com.vodafone.shoppingCart.services;

import com.vodafone.shoppingCart.models.Category;
import com.vodafone.shoppingCart.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;


    public List<Category> getAllCategories() {
        return (List<Category>)  categoryRepository.findAll();
    }
}
