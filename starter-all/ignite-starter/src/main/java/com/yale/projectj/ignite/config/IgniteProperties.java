package com.yale.projectj.ignite.config;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfiguration;

/**
 * @author Yale
 */

@AutoConfiguration(before = {IgniteConfiguration.class})
@Data
@Slf4j
public class IgniteProperties {
    @Value("${ignite.endpoint}")
    private String endpoint;
    @Value("${ignite.max-retry:3}")
    private Integer maxRetry;
    @Value("${ignite.retry-delay:1000}")
    private Integer retryDelay;
}
