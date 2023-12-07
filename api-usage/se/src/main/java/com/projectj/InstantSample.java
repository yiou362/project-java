package com.projectj;

import java.sql.Date;
import java.time.Instant;

/**
 * @author Yale
 */
public class InstantSample {
    public static void main(String[] args) {
        System.out.println(Instant.now());
        System.out.println(Instant.now().toString());
        System.out.println(Date.from(Instant.now()));
    }
}
