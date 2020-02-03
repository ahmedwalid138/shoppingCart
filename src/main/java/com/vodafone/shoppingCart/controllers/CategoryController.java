package com.vodafone.shoppingCart.controllers;

import com.vodafone.shoppingCart.models.Category;
import com.vodafone.shoppingCart.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("getCategories")
    public List<Category> getCategories() {
        return categoryService.getAllCategories();
    }

}
