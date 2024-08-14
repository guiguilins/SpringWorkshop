package com.teste.spring_vscode.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.spring_vscode.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
