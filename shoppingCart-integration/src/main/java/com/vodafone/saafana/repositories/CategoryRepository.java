package com.vodafone.saafana.repositories;

import org.springframework.data.repository.CrudRepository;
import com.vodafone.saafana.repositories.model.Category;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {
}
