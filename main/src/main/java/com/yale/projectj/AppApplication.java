package com.yale.projectj;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Yale
 */

@SpringBootApplication(scanBasePackages = {"com.yale.projectj.**"})
@EnableTransactionManagement
@EnableBatchProcessing
public class AppApplication {

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context = SpringApplication.run(AppApplication.class);
        String[] strings = context.getBeanDefinitionNames();
        for (String str : strings) {
            if (str.equalsIgnoreCase("BatchAutoConfiguration")) {
                System.out.println(str);
            }
        }
//        System.exit(SpringApplication.exit(SpringApplication.run(AppApplication.class)));
//        ConfigurableApplicationContext context = SpringApplication.run(AppApplication.class, args);
//        JobLauncher jobLauncher = context.getBean(JobLauncher.class);
//        Job job = context.getBean(Job.class);
//        jobLauncher.run(job, new JobParameters());
    }

}
