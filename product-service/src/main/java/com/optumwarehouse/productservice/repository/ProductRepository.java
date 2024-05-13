package com.optumwarehouse.productservice.repository;

import com.optumwarehouse.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
