package com.vodafone.shoppingCart.repositories;

import com.vodafone.shoppingCart.models.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository  extends JpaRepository<CartItem, Integer> {
}
