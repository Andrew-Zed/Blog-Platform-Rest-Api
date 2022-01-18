package com.andrew.springdata.product;

import com.andrew.springdata.product.entities.Product;
import com.andrew.springdata.product.repos.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductdataApplicationTests {

    @Autowired
    ProductRepository repository;

    @Test
    public void contextLoads() {
    }

    public void testCreate(){
    Product product = new Product();
    product.setId(1);
    product.setName("Iphone");
    product.setDesc("Awesome");
    product.setPrice(1000d);

    repository.save(product);

    }
}
