package com.yale.projectj.models.entities;

import jakarta.persistence.*;
import lombok.Data;

/**
 * @author Yale
 */
@Entity
@Table(name = "account")
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_id", nullable = false)
    private int userId;

    @Column(name = "balance", nullable = false)
    private int balance;

    // Constructors, getters, and setters
}