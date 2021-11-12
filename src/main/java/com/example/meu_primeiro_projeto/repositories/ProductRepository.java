package com.example.meu_primeiro_projeto.repositories;

import com.example.meu_primeiro_projeto.entities.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ProductRepository {

    private Map<Long, Product> map = new HashMap<>();

    public void save(Product obj) {
        map.put(obj.getId(), obj);
    }

    public Product findbyId(Long id) {
        return map.get(id);
    }

    public List<Product> findAll() {
        return new ArrayList<Product>(map.values());
    }
}