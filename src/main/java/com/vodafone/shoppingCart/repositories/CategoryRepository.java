package com.vodafone.shoppingCart.repositories;

import com.vodafone.shoppingCart.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
