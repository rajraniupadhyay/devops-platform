package com.example.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.List;

@SpringBootApplication
@RestController
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

    @GetMapping("/")
    public Map<String, String> home() {
        return Map.of("service", "user-service", "status", "running");
    }

    @GetMapping("/users")
    public Map<String, Object> getUsers() {
        return Map.of(
            "users", List.of(
                Map.of("id", 1, "name", "Rahul Sharma", "email", "rahul@example.com"),
                Map.of("id", 2, "name", "Priya Singh", "email", "priya@example.com")
            )
        );
    }
}