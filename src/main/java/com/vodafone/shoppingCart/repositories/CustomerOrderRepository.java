package com.vodafone.shoppingCart.repositories;

import com.vodafone.shoppingCart.models.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, Integer> {
}
