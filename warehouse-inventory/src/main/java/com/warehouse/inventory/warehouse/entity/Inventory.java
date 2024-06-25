package com.warehouse.inventory.warehouse.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "t_inventory")
public class Inventory {
    
    @Id
    @GeneratedValue(generator = "INVENTORY_ID_GENERATOR", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "INVENTORY_ID_GENERATOR", sequenceName = "tb_inventory_id_seq",allocationSize=1)
    @Column(name = "product_id")
    private Long productId;
    
    @Column(name = "name", nullable = false)
    private String name;
    
    @Column(name = "quantity", nullable = false)
    private Integer quantity;
    
    @Column(name = "product_type", nullable = false)
    private String productType;
}
