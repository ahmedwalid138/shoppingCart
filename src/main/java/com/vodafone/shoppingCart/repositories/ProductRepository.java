package com.vodafone.shoppingCart.repositories;

import com.vodafone.shoppingCart.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
