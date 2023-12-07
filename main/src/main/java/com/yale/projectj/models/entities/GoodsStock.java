package com.yale.projectj.models.entities;

import jakarta.persistence.*;
import lombok.Data;

/**
 * @author Yale
 */
@Entity
@Table(name = "goods_stock")
@Data
public class GoodsStock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "amount", nullable = false)
    private int amount;

    // Constructors, getters, and setters
}