package com.warehouse.inventory.warehouse.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "t_users", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"username"})})
public class UserEntity {
    
    @Id
    @GeneratedValue(generator = "USER_ID_GENERATOR", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "USER_ID_GENERATOR", sequenceName = "tb_user_id_seq",allocationSize=1)
    @Column(name = "user_id")
    private Long userId;
    
    @Column(name = "username", nullable = false, unique = true)
    private String username;
    
    @Column(name = "password", nullable = false)
    private String password;
    
    @Column(name = "role", nullable = false)
    private String role;
}
