package com.example.testurl.controller;

import com.example.testurl.entity.Product;
import com.example.testurl.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductRepository repo;

    public ProductController(ProductRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Product> getAll() {
        return repo.findAll();
    }
}