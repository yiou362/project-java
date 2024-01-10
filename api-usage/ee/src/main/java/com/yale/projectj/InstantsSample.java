package com.yale.projectj;

import java.time.Instant;
import java.util.Date;

/**
 * @author Yale
 */
public class InstantsSample {
    public static void main(String[] args) {
        System.out.println(Instant.now().toString());

        String t = Instant.now().toString();
        Date d = Date.from(Instant.parse(t));
        d.setTime(0);
//        Instant.parse(t);
    }
}
