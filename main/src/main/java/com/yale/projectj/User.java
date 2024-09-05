package com.yale.projectj;

import jakarta.persistence.Column;
import lombok.Data;

/**
 * @author Yale
 */
@Data
public class User {
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "gender")
    private String gender;


}
