package com.teste.spring_vscode.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.spring_vscode.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
