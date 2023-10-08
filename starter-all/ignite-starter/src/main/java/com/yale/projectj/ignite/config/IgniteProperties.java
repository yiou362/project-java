package com.yale.projectj.ignite.config;

import jakarta.annotation.PostConstruct;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author Yale
 */

@Data
@ConfigurationProperties(prefix = "ignite")
@Slf4j
public class IgniteProperties {
    private String endpoint;
    private Integer maxRetry;
    private Integer retryDelay;


    @PostConstruct
    public void init() {
        log.info("ignite properties start to init.");
    }
}
