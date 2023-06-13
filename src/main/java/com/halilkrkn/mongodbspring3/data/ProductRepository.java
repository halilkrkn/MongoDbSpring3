package com.halilkrkn.mongodbspring3.data;

import com.halilkrkn.mongodbspring3.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
