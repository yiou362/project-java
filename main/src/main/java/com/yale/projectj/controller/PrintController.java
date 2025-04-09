package com.yale.projectj.controller;

import com.yale.projectj.config.AppConfiguration;
import com.yale.projectj.models.entities.PrintReq;
import com.yale.projectj.models.entities.PrintResp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author Yale
 */
@RestController
@RequestMapping("/print")
@Slf4j
public class PrintController {
    @Autowired
    AppConfiguration appConfiguration;


    @RequestMapping(value = "/config", method = RequestMethod.GET)
    public PrintResp printConfig(PrintReq req) {
        log.info("print config: {}", appConfiguration);
        PrintResp resp = new PrintResp();
        resp.setResult(req.toString());
        resp.setDatetime(new Date());
        return resp;
    }
}
