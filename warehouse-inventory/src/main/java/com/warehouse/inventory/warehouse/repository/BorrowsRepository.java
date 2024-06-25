package com.warehouse.inventory.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.warehouse.inventory.warehouse.entity.BorrowsEntity;

public interface BorrowsRepository extends JpaRepository<BorrowsEntity, Long>{
    
}
