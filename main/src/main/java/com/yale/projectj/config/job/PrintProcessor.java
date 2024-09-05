package com.yale.projectj.config.job;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;

/**
 * @author Yale
 */
@Slf4j
public class PrintProcessor<S,T> implements ItemProcessor<S,T> {
    @Override
    public T process(S item) throws Exception {
        log.info("print processor {}", item);
        return (T) item;
    }
}
