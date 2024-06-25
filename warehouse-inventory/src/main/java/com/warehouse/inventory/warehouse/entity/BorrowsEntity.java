package com.warehouse.inventory.warehouse.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "t_borrowings")
public class BorrowsEntity {
    
    @Id
    @GeneratedValue(generator = "BORROWS_ID_GENERATOR", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "BORROWS_ID_GENERATOR", sequenceName = "tb_borrowings_id_seq",allocationSize=1)
    @Column(name = "borrowing_id")
    private Long borrowingId;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
    
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Inventory inventory;
    
    @Column(name = "borrow_date", nullable = false)
    private Date borrowDate;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;
    
    @Column(name = "return_date")
    private Date returnDate;

    @Column(name = "return_quantity")
    private Integer returnQuantity;
}
