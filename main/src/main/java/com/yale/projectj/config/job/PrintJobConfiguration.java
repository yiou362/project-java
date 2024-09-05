package com.yale.projectj.config.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.support.JdbcTransactionManager;

import java.util.Arrays;

/**
 * @author Yale
 */
//@Configuration
public class PrintJobConfiguration {
    @Autowired
    JobRepository jobRepository;
    @Autowired
    JdbcTransactionManager jdbcTransactionManager;

    @Bean("printJob")
    public Job getPrintJob(JobRepository jobRepository, @Qualifier("printStep") Step step) {
        return new JobBuilder("printJob", jobRepository).start(step).build();
    }

//    @Bean
//    public Step getStep(JobRepository jobRepository, JdbcTransactionManager jdbcTransactionManager) {
//        return new StepBuilder("printStep", jobRepository).tasklet(((contribution, chunkContext) -> {
//            System.out.println("Hello Spring batch");
//            return RepeatStatus.FINISHED;
//        }), jdbcTransactionManager).build();
//    }
    @Bean
    public Step printStep() {
        return new StepBuilder("printStep", jobRepository)
                .chunk(3, jdbcTransactionManager)
                .reader(gerPrintReader())
                .writer(getPrintWriter())
                .processor(getPrintProcessor())
                .build();
    }

    public ItemReader<Integer> gerPrintReader() {
        return new LineReader<>(Arrays.asList(1,2,3,4,5,6));
    }

    public ItemWriter<Object> getPrintWriter() {
        return new PrintWriter<>();
    }

    public ItemProcessor<Object, Object> getPrintProcessor() {
        return new PrintProcessor<>();
    }
}
