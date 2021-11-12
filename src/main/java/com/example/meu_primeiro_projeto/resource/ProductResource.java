package com.example.meu_primeiro_projeto.resource;

import com.example.meu_primeiro_projeto.entities.Product;
import com.example.meu_primeiro_projeto.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductRepository categoryRepository;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = categoryRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

   @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product cat = categoryRepository.findById(id).get();
        return ResponseEntity.ok().body(cat);
    }
}
