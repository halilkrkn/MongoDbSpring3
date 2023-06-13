package com.halilkrkn.mongodbspring3;

import com.halilkrkn.mongodbspring3.data.CategoryRepository;
import com.halilkrkn.mongodbspring3.data.ProductRepository;
import com.halilkrkn.mongodbspring3.model.Category;
import com.halilkrkn.mongodbspring3.model.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MongoDbSpring3Application {

    public static void main(String[] args) {
        SpringApplication.run(MongoDbSpring3Application.class, args);
    }

//    @Bean
    CommandLineRunner runner(
            ProductRepository productRepository,
            CategoryRepository categoryRepository
    ) {
        return args -> {
            Product product = Product.builder()
                    .name("Product 1")
                    .description("Description 1")
                    .price(10.0)
                    .build();
            productRepository.save(product);

            var category1 = Category.builder()
                    .name("Category 1")
                    .description("Description 1")
                    .build();

            var category2 = Category.builder()
                    .name("Category 2")
                    .description("Description 2")
                    .build();

            categoryRepository.insert(category1);
            categoryRepository.insert(category2);
        };
    }
}
