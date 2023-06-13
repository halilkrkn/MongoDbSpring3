package com.halilkrkn.mongodbspring3.controller;

import com.halilkrkn.mongodbspring3.model.Product;
import com.halilkrkn.mongodbspring3.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    // Örnek olarak:
    // http://localhost:8080/api/v1/product/save
    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody Product product) {
        //todo use a DTO
        //todo validate the objects
        return ResponseEntity.ok(productService.save(product));
    }

    // Örnek olarak: http://localhost:8081/api/v1/product/findAll
    @GetMapping("/findAll")
    public ResponseEntity<List<Product>> findAll() {
        return ResponseEntity.ok(productService.findAll());
    }

    // Örnek olarak: http://localhost:8080/api/v1/product/1
    @GetMapping("/{productId}")
    public ResponseEntity<Product> findById(
            @PathVariable("productId") String id) {
        return ResponseEntity.ok(productService.findById(id));
    }

    // Örnek olarak: http://localhost:8080/api/v1/product/1
    @DeleteMapping("/{productId}")
    public ResponseEntity<String> deleteById(
            @PathVariable("productId") String id) {
        productService.deleteById(id);
        return ResponseEntity.ok("Product deleted");
    }

    // Örnek olarak: http://localhost:8080/api/v1/product/update
    @PutMapping("/update")
    public ResponseEntity<String> update(@RequestBody Product product) {
        return ResponseEntity.ok(productService.update(product));
    }
}
