package com.yale.projectj.config.job;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import java.util.List;

/**
 * @author Yale
 */
@Slf4j
public class LineReader<T> implements ItemReader<T> {
    List<T> list ;
    LineReader(List<T> list) {
        this.list = list;
    }

    @Override
    public T read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        if (list != null && !list.isEmpty()) {
            var item = list.remove(0);
            log.info("read item {}", item);
            return item;
        }
        return null;
    }
}
