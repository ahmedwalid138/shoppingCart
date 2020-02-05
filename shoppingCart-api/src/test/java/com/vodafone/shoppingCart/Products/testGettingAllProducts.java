package com.vodafone.shoppingCart.Products;

import com.vodafone.shoppingCart.controllers.ProductController;
import org.junit.jupiter.api.Test;
import org.mockito.Spy;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class testGettingAllProducts {
    @Spy
    ProductController productController;

    @Test
    void getAllProducts() {
        //Assertions.assertThat(productController.getProducts().size()).isNotNull();


    }
}
