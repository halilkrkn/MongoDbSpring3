package com.halilkrkn.mongodbspring3.data;

import com.halilkrkn.mongodbspring3.model.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<Category, String> {


}
