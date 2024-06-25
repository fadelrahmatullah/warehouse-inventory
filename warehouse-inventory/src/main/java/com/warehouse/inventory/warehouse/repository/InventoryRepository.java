package com.warehouse.inventory.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.warehouse.inventory.warehouse.entity.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long>{
    
}
