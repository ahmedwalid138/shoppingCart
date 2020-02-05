package com.vodafone.shoppingCart;

import com.vodafone.shoppingCart.controllers.CategoryController;
import com.vodafone.shoppingCart.controllers.ProductController;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Spy;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShoppingCartApplicationTests {

	@Spy
	private CategoryController categoryController;
	@Spy
	private ProductController productController;

	@Test
	void contextLoads() {
		Assertions.assertThat(categoryController).isNotNull();
		Assertions.assertThat(productController).isNotNull();
	}

}
