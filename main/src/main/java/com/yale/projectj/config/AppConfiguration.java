package com.yale.projectj.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * @author Yale
 */
@Configuration
@Data
@RefreshScope
public class AppConfiguration {

    @Value("${mykey}")
    private String config;

}
