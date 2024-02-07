package com.yale.projectj.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Yale
 */
@Entity
@Table(name = "people")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    long personId;
    @Column(name = "FIRST_NAME")
    String firstName;
    @Column(name = "LAST_NAME")
    String lastName;
}
