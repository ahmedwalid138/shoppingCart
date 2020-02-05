package com.vodafone.shoppingCart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages={"com.vodafone.saafana.service", "com.vodafone.shoppingCart"})
//s@ComponentScan({  "com.vodafone.shoppingCart.controllers" })
@EntityScan(basePackages = {"com.vodafone.saafana.repositories.model"})
@EnableJpaRepositories(basePackages = {"com.vodafone.saafana.repositories"})
public class ShoppingCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartApplication.class, args);
	}

}
