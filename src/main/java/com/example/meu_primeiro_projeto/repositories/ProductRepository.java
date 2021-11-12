package com.example.meu_primeiro_projeto.repositories;

import com.example.meu_primeiro_projeto.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
