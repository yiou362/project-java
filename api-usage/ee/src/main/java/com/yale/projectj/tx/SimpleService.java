package com.yale.projectj.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * @author Yale
 */
//@SpringBootTest
//@TestPropertySource("classpath:application.yml")
public class SimpleService {

    private final TransactionTemplate transactionTemplate;

    public SimpleService(PlatformTransactionManager transactionManager) {
        this.transactionTemplate = new TransactionTemplate(transactionManager);
    }

    public void method1() {
        transactionTemplate.executeWithoutResult((status) -> {
            updateOperation1();
            updateOperation2();
        });
    }


    private void updateOperation1() {

    }

    private void updateOperation2() {

    }

}
