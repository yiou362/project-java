package com.yale.projectj;

import com.alibaba.fastjson2.JSON;
import com.yale.projectj.config.AppConfiguration;
import lombok.Data;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author Yale
 */

@SpringBootApplication(scanBasePackages = {"com.yale.projectj.**"})
@EnableTransactionManagement
@EnableBatchProcessing
@Data
public class AppApplication {


    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context = SpringApplication.run(AppApplication.class);
//        JobLauncher jobLauncher = context.getBean(JobLauncher.class);
//        Job job = context.getBean(Job.class);
//        jobLauncher.run(job, new JobParameters());
//        String[] strings = context.getBeanDefinitionNames();
//        for (String str : strings) {
//            if (str.equalsIgnoreCase("BatchAutoConfiguration")) {
//                System.out.println(str);
//            }
//        }
//        System.exit(SpringApplication.exit(SpringApplication.run(AppApplication.class)));
//        ConfigurableApplicationContext context = SpringApplication.run(AppApplication.class, args);
//        JobLauncher jobLauncher = context.getBean(JobLauncher.class);
//        Job job = context.getBean(Job.class);
//        jobLauncher.run(job, new JobParameters());
    }

//    public void test() {
//        try {
//            URL url = this.getClass().getClassLoader().getResource("sample-data.csv");
//            URLConnection connection = url.openConnection();
//            InputStream is = connection.getInputStream();
//            byte[] bytes = is.readAllBytes();
//            System.out.println(new String(bytes));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


//    }
}
