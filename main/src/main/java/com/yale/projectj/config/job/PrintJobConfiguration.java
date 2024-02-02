//package com.yale.projectj.config.job;
//
//import org.springframework.batch.core.Job;
//import org.springframework.batch.core.Step;
//import org.springframework.batch.core.job.builder.JobBuilder;
//import org.springframework.batch.core.repository.JobRepository;
//import org.springframework.batch.core.step.builder.StepBuilder;
//import org.springframework.batch.repeat.RepeatStatus;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.support.JdbcTransactionManager;
//
///**
// * @author Yale
// */
//@Configuration
//public class PrintJobConfiguration {
//
//    @Bean
//    public Job getPrintJob(JobRepository jobRepository, Step step) {
//        return new JobBuilder("printJob", jobRepository).start(step).build();
//    }
//
//    @Bean
//    public Step getStep(JobRepository jobRepository, JdbcTransactionManager jdbcTransactionManager) {
//        return new StepBuilder("printStep", jobRepository).tasklet(((contribution, chunkContext) -> {
//            System.out.println("Hello Spring batch");
//            return RepeatStatus.FINISHED;
//        }), jdbcTransactionManager).build();
//    }
//}
