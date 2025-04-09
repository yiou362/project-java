package com.yale.projectj.controller.test;

import com.yale.projectj.models.entities.PrintReq;
import com.yale.projectj.models.entities.PrintResp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author Yale
 */
@Slf4j
@RestController
public class TestController {

    @RequestMapping(value = "/config", method = RequestMethod.GET)
    public PrintResp printConfig(PrintReq req) {
        PrintResp resp = new PrintResp();
        resp.setResult(req.toString());
        resp.setDatetime(new Date());
        return resp;
    }
}
