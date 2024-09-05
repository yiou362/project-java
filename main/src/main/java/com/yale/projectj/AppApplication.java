package com.yale.projectj;

import com.alibaba.fastjson2.JSON;
//import com.alibaba.nacos.common.packagescan.resource.ClassPathResource;
import com.yale.projectj.config.AppConfiguration;
import com.yale.projectj.dao.JasperDao;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.util.StringUtils;

import javax.annotation.PostConstruct;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;

/**
 * @author Yale
 */

@SpringBootApplication(scanBasePackages = {"com.yale.projectj.**"})
@EnableTransactionManagement
@EnableBatchProcessing()
@Slf4j
public class AppApplication {
    @Autowired
    TestComponent testComponent;


    public static void main(String[] args) throws Exception {
//        SpringApplication.run(AppApplication.class, args);
        String d = "2024-01-02";
        System.out.println(StringUtils.deleteAny(d, "-"));
    }

    @PostConstruct
    public void test() {
        String d = "2024-01-02";
        System.out.println(StringUtils.deleteAny("-", d));


    }


}
