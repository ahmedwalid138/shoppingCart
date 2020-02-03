package com.vodafone.shoppingCart.repositories;

import com.vodafone.shoppingCart.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
