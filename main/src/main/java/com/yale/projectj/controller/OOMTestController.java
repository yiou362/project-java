package com.yale.projectj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Yale
 */

@RestController
public class OOMTestController {

    @RequestMapping(value = "/apply/array")
    public void applyBigArray() {
        List<Long[]> list = new LinkedList<>();

        while (true) {
            list.add(new Long[10000000]);
        }
    }

    @RequestMapping(value = "/sleep")
    public void sleepFunction(@RequestParam Long ms) {
        System.out.println(ms);
        try {
            Thread.sleep(ms);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
