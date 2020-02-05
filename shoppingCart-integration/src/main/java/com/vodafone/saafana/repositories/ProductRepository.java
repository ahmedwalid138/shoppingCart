package com.vodafone.saafana.repositories;

import org.springframework.data.repository.CrudRepository;
import com.vodafone.saafana.repositories.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer> {

}
