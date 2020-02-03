package com.vodafone.shoppingCart.repositories;

import com.vodafone.shoppingCart.models.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Integer> {
}
