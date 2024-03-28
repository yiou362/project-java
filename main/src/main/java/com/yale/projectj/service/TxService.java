package com.yale.projectj.service;

import com.yale.projectj.dao.AccountRepository;
import com.yale.projectj.dao.GoodsStockRepository;
import com.yale.projectj.models.entities.Account;
import com.yale.projectj.models.entities.GoodsStock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author Yale
 */


@Service
public class TxService {

    @Autowired
    AccountRepository accountRepository;
    @Autowired
    GoodsStockRepository goodsStockRepository;

    public void addAccount(Integer userId, Integer balance) {
        Account account = new Account();
        account.setBalance(balance);
        account.setUserId(userId);
        accountRepository.save(account);
    }
    public void addStock(String name, Integer amount) {
        GoodsStock goodsStock = new GoodsStock();
        goodsStock.setName(name);
        goodsStock.setAmount(amount);
        goodsStockRepository.save(goodsStock);
    }
    public void updateGoodsStock(Integer goodsId, Integer amount) {
        Optional<GoodsStock> op = goodsStockRepository.findById(goodsId);
        if (op.isPresent()) {
            GoodsStock res = op.get();
            res.setAmount(amount);
            goodsStockRepository.save(res);
        }
    }
    public void updateAccount(Integer userId, Integer balance, boolean tag) {
        Integer i = null;
        if (tag) {
            int aa = 1/0;
        } else {
            Optional<Account> op = accountRepository.findByUserId(userId);
            if (op.isPresent()) {
                Account account = op.get();
                account.setBalance(i);
                accountRepository.save(account);
            }
        }
    }

    public int countAccount() {

    }
}
