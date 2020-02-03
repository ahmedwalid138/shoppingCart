package com.vodafone.shoppingCart.repositories;

import com.vodafone.shoppingCart.models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Integer> {
}
