package com.vodafone.shoppingCart.repositories;

import com.vodafone.shoppingCart.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Integer> {

}
