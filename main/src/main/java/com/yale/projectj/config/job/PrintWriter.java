package com.yale.projectj.config.job;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;

/**
 * @author Yale
 */
@Slf4j
public class PrintWriter<T> implements ItemWriter<T> {
    @Override
    public void write(Chunk<? extends T> chunk) throws Exception {
        for (T item : chunk) {
            log.info("writer print {}", item);
        }
    }
}
