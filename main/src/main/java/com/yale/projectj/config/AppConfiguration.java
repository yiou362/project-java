package com.yale.projectj.config;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
//import com.alibaba.nacos.api.config.ConfigService;
//import com.alibaba.nacos.api.exception.NacosException;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @author Yale
 */
@Configuration
@RefreshScope
@Slf4j
@Data
public class AppConfiguration {

//    @Value("${mykey}")
//    private String config;

    //    @Resource(name = "sysPropConfigService")
//    ConfigService configService;
//
//     implements ApplicationListener<ApplicationReadyEvent>
//    @Override
//    public void onApplicationEvent(ApplicationReadyEvent event) {
//        try {
//            ConfigService configService = (ConfigService) event.getApplicationContext().getBean("sysPropConfigService");
//            String context = configService.getConfig("multiple-ns.json", "DEFAULT_GROUP", 3000);
//            JSONObject jsonObject = JSON.parseObject(context);
//            String operationMode = (String) jsonObject.get("operation-mode");
//            System.out.println(operationMode);
//            System.out.println(config);
//        } catch (NacosException e) {
//            log.error("custom init nacos configService error");
//            System.exit(0);
//        }
//    }

//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        String context = configService.getConfig("multiple-ns.yaml", "DEFAULT_GROUP", 3000);
//        System.out.println(context);
//        System.out.println(config);
//    }

//    @PostConstruct
//    public void ps() throws NacosException {
////        String context = configService.getConfig("multiple-ns.yaml", "DEFAULT_GROUP", 3000);
////        System.out.println(config);
////        System.out.println(ns);
//    }
}
