package com.halilkrkn.mongodbspring3.service;

import com.halilkrkn.mongodbspring3.data.ProductRepository;
import com.halilkrkn.mongodbspring3.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {


    private final ProductRepository productRepository;

    public String save(Product product) {
        //todo use a DTO
        //todo validate the objects
        return productRepository.save(product).getId();
    }

    public String update(Product product) {
        return productRepository.save(product).getId();
    }

    public Product findById(String id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public void deleteById(String id) {
        productRepository.deleteById(id);
    }


}
