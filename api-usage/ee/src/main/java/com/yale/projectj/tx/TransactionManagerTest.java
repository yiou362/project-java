package com.yale.projectj.tx;


import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 * @author Yale
 */

@Slf4j
public class TransactionManagerTest {
    public static void main(String[] args) {
        useTransactionManager();
    }

    private static void useTransactionManager() {
        HikariDataSource ds = new HikariDataSource();
        // 必选配置
        ds.setDriverClassName("org.postgresql.Driver");
        ds.setJdbcUrl("jdbc:postgresql://127.0.0.1:5432/kong?characterEncoding=utf8&connectTimeout=1000&socketTimeout=3000&autoReconnect=true&SSL=false");
        ds.setUsername("kong");
        ds.setPassword("kongpass");
        // 可选配置
//        ds.setMaximumPoolSize(10);
//        ds.setMinimumIdle(2);
//        ds.setConnectionTimeout(30000);

        DataSourceTransactionManager txManager = new DataSourceTransactionManager(ds);
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setName("tx1");
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);

        TransactionStatus ts = txManager.getTransaction(def);
        // operate database\

        try {
            Connection connection = txManager.getDataSource().getConnection();
            Statement statement =  connection.createStatement();
            statement.execute("insert into tx_test(id, name) values('4' ,'小米')");
            statement.execute("insert into tx_test(id, name) values('3', '小红')");
            txManager.commit(ts);

//            Connection connection = ds.getConnection();
//            Statement statement = connection.createStatement();
//            statement.execute("insert into tx_test(id, name) values(4,'小米')");
//            statement.execute("insert into tx_test(id, name) values(2,'小红')");
//            statement.close();
        } catch (Exception e) {
            txManager.rollback(ts);
            log.error("database error", e);
        }
    }

    public void useTransactionTemplate() {

    }

}
