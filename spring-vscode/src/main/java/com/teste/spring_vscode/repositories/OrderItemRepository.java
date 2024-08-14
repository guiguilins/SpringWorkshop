package com.teste.spring_vscode.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.spring_vscode.entities.OrderItem;
import com.teste.spring_vscode.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
    
}
