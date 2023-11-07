package com.yale.projectj.controller;

import com.yale.projectj.config.AppConfiguration;
import jdk.jfr.Registered;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yale
 */
@RestController
@RequestMapping("/print")
@Slf4j
public class PrintController {
    @Autowired
    AppConfiguration appConfiguration;

    @RequestMapping(value = "/my-key", method = RequestMethod.GET)
    public void printMyKey() {
        log.info(appConfiguration.getConfig());
    }
}
