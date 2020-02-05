package com.vodafone.saafana.service;

import com.vodafone.saafana.repositories.CategoryRepository;
import com.vodafone.saafana.service.modelMapper.ModelMapperSingleton;
import com.vodafone.saafana.service.models.Category;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;


    public List<Category> getAllCategories() {

        //TODO map list of repo categories to service categories

        List<com.vodafone.saafana.repositories.model.Category> repositoryCategories = (List<com.vodafone.saafana.repositories.model.Category>) categoryRepository.findAll();
        List<Category> serviceCategories = new ArrayList<>();
        ModelMapper modelMapper = ModelMapperSingleton.getInstance();
        for (com.vodafone.saafana.repositories.model.Category category:repositoryCategories) {
            Category serviceCategory = modelMapper.map(category,Category.class);
            serviceCategories.add(serviceCategory);
        }
        return serviceCategories;
    }
}
