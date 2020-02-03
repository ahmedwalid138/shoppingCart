package com.vodafone.shoppingCart.repositories;

import com.vodafone.shoppingCart.models.EmailSubscriber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailSubscriberRepository extends JpaRepository<EmailSubscriber, Integer> {
}
