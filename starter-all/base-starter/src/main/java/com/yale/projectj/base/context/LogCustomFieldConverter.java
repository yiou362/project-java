package com.yale.projectj.base.context;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import org.slf4j.MDC;
import org.springframework.util.StringUtils;

import java.util.Map;

/**
 * @Author: Carlos
 * @Description: Put the output key,value of the customized field into the log
 */
public class LogCustomFieldConverter extends ClassicConverter {

    @Override
    public String convert(ILoggingEvent event) {
        StringBuilder sb = new StringBuilder();
        Map<String, String> contextMap = MDC.getCopyOfContextMap();
        if (null != contextMap && !contextMap.isEmpty()) {
            contextMap.forEach((key, value) -> {
                if (StringUtils.hasLength(value)) {
                    sb.append(key).append(":").append(value).append(" ");
                }
            });
        }
        return sb.toString();
    }
}
