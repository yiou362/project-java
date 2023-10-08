package com.yale.projectj.ignite.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.ignite.Ignition;
import org.apache.ignite.client.ClientConnectionException;
import org.apache.ignite.client.IgniteClient;
import org.apache.ignite.configuration.ClientConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

/**
 * @author Yale
 */
@Slf4j
public class IgniteConfiguration {
    @Autowired
    IgniteProperties igniteProperties;

    @Bean
    public IgniteClient createIgniteClient() {
        ClientConfiguration cfg = new ClientConfiguration().setAddresses(igniteProperties.getEndpoint());
        IgniteClient igniteClient = null;
        int time = 0;
        while (time++ < igniteProperties.getMaxRetry()) {
            try {
                igniteClient = Ignition.startClient(cfg);
                break;
            } catch (ClientConnectionException e) {
                log.error("ignite cannot connect, endpoint:{}, try {} time", igniteProperties.getEndpoint(), time);
                try {
                    Thread.sleep(igniteProperties.getRetryDelay());
                } catch (InterruptedException e2) {
                }
            }
        }
        if (igniteClient != null) {
            log.info("succeed to create IgniteClient bean!");
            return igniteClient;
        } else {
            log.error("fail to connect to ignite server!");
            throw new ClientConnectionException("fail to connect to ignite server");
        }
    }
}
