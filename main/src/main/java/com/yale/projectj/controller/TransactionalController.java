package com.yale.projectj.controller;

import com.yale.projectj.service.TxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

/**
 * @author Yale
 */

@RestController
@RequestMapping("/tx")
public class TransactionalController {

    @Autowired
    TxService txService;

    @Transactional
    @RequestMapping("/order")
    public void doOrder(Integer goodsId, Integer reduce, Integer userId, Integer price, Boolean tag) {
        txService.updateGoodsStock(goodsId, reduce);
        txService.updateAccount(userId, price, tag);
    }

    @RequestMapping("/account/add")
    public void addAccount(Integer userId, Integer balance) {
        txService.addAccount(userId, balance);
    }

    @RequestMapping("/goods/add")
    public void addStock(String name, Integer amount) {
        txService.addStock(name, amount);

    }
}
