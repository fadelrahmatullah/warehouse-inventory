package com.warehouse.inventory.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.warehouse.inventory.warehouse.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    
}
