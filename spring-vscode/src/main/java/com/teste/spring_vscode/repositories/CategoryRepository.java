package com.teste.spring_vscode.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.spring_vscode.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
