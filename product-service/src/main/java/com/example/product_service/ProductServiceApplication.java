package com.example.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.List;

@SpringBootApplication
@RestController
public class ProductServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }

    @GetMapping("/")
    public Map<String, String> home() {
        return Map.of("service", "product-service", "status", "running");
    }

    @GetMapping("/products")
    public Map<String, Object> getProducts() {
        return Map.of(
            "products", List.of(
                Map.of("id", 1, "name", "Laptop", "price", 50000),
                Map.of("id", 2, "name", "Phone", "price", 20000),
                Map.of("id", 3, "name", "Tablet", "price", 30000)
            )
        );
    }
}