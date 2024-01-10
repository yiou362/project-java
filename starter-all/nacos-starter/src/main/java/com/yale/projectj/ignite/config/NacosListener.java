package com.yale.projectj.ignite.config;

import com.alibaba.cloud.nacos.NacosConfigManager;
import com.alibaba.nacos.api.config.listener.Listener;
import com.alibaba.nacos.api.exception.NacosException;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.Executor;

/**
 * @author Yale
 */
@Configuration
@Slf4j
public class NacosListener {
    @Autowired
    NacosConfigManager configManager;

    private static final String DATA_ID = "pj-main.yaml";

    private static final String GROUP = "DEFAULT_GROUP";

    @PostConstruct
    private void addListener() throws NacosException {
        Listener listener = new Listener() {
            @Override
            public Executor getExecutor() {
                return null;
            }

            @Override
            public void receiveConfigInfo(String configInfo) {
                log.info(configInfo);
            }
        };
        configManager.getConfigService().addListener(DATA_ID, GROUP, listener);
    }
}
