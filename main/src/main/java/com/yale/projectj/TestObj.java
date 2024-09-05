package com.yale.projectj;

import jakarta.persistence.Column;
import lombok.Data;

/**
 * @author Yale
 */
@Data
public class TestObj {

    @Column(name = "bwr_name_1")
    private String bwr_name_1;

}
