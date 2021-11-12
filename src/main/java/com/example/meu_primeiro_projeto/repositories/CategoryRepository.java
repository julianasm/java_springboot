package com.example.meu_primeiro_projeto.repositories;

import com.example.meu_primeiro_projeto.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
