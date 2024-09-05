package com.yale.projectj.ignite.config;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.config.listener.Listener;
import com.alibaba.nacos.api.exception.NacosException;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;
import java.util.concurrent.Executor;

/**
 * @author Yale
 */

@Configuration
@Slf4j
@Data
@ConfigurationProperties(prefix = "operation-mode")
public class CustomNacosConfiguration {
    /**
     * storage operation mode
     */
    private String operationMode;

    private String serverAddr;
    private String nameSpace;
    private String username;
    private String password;
    private String dataId;
    private String group;

    private String OPERATION_MODE_KEY = "operation-mode";


    @Bean(name = "sysPropConfigService")
    public ConfigService sysPropConfigService() throws NacosException {
        Properties properties = new Properties();
        properties.setProperty("serverAddr", serverAddr);
        properties.setProperty("namespace", nameSpace);
        properties.setProperty("username", username);
        properties.setProperty("password", password);
        try {
            ConfigService configService = NacosFactory.createConfigService(properties);

            String context = configService.getConfig(dataId, group, 3000);
            JSONObject jsonObject = JSON.parseObject(context);
            String mode = (String) jsonObject.get("operation-mode");
            operationMode = mode;
            log.info("operation mode finish init, value: {}", mode);

            configService.addListener(dataId, group, new Listener() {
                @Override
                public void receiveConfigInfo(String configInfo) {

                    JSONObject jsonObject = JSON.parseObject(configInfo);
                    operationMode = (String) jsonObject.get("operation-mode");
                    System.out.println("Config updated: " + OPERATION_MODE_KEY);
                }

                @Override
                public Executor getExecutor() {
                    // 如果需要自定义线程池，可以在这里返回一个自定义的Executor
                    return null;
                }
            });

            return configService;
        } catch (NacosException e) {
            log.error("operation mode init ConfigService error!");
            throw e;
        }
    }

}
