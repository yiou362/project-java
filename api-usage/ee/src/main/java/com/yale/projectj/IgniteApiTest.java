package com.yale.projectj;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import lombok.*;
import org.apache.ignite.Ignition;
import org.apache.ignite.binary.BinaryObjectException;
import org.apache.ignite.binary.BinaryReader;
import org.apache.ignite.binary.BinaryWriter;
import org.apache.ignite.binary.Binarylizable;
import org.apache.ignite.cache.query.*;
import org.apache.ignite.client.ClientCache;
import org.apache.ignite.client.IgniteClient;
import org.apache.ignite.configuration.ClientConfiguration;
import org.apache.ignite.lang.IgniteBiPredicate;
import org.apache.ignite.lang.IgniteClosure;
import org.json.JSONException;
import org.json.JSONString;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.cache.Cache;
import java.io.Serializable;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * @author Yale
 */

public class IgniteApiTest {
    private static IgniteClient client;

    @BeforeAll
    public static void init() {
        ClientConfiguration cfg = new ClientConfiguration().setAddresses("127.0.0.1:10800");
        client = Ignition.startClient(cfg);
    }

    @AfterAll
    public static void destroy (){
        client.close();
    }


    @Test
    public void kvApi() throws JSONException {
//        ClientCache<Integer, Person> cache = client.getOrCreateCache("cache");
//        cache.put(0, new Person().builder().id(1).name("小名").build());
//        cache.put(0, new Person().builder().id(99).name("小红").build());
//        cache.put(0, new Person().builder().id(99).name("小东").build());
//
//        Person p1 = cache.get(0);
//
//
//
//        Assertions.assertEquals("小东", p1.getName());

         final Set<ServiceConfig> set = new ConcurrentSkipListSet<>((a, b) -> {
            String ahp = a.getService() + a.getEndPoint();
            String bhp = b.getService() + b.getEndPoint();
            return ahp.compareTo(bhp);
        });
        set.add(new ServiceConfig("testName", "testEndpoint"));

        ClientCache<String, String> cache = client.getOrCreateCache("service-config-set-grpc-swagger");
//        JSONArray value = cache.get("service-config-set");
//        System.out.println(value);

        cache.put("service-config-set", JSON.toJSONString(set));
        String str = cache.get("service-config-set");

        List<ServiceConfig> list = JSON.parseArray(str, ServiceConfig.class);

//        for (int i = 0; i < jsonArray.length(); ++i) {
//            set.add((ServiceConfig) jsonArray.get(i));
//        }
        set.addAll(list);
        System.out.println(set);
    }

    @Test
    public void sqlApi() {
        SqlFieldsQuery createTable = new SqlFieldsQuery(String.format(
                "CREATE TABLE IF NOT EXISTS Person (id INT PRIMARY KEY, name VARCHAR) WITH \"VALUE_TYPE=%s\"",
                Person.class.getName())).setSchema("PUBLIC");
        client.query(createTable).getAll();

        client.query(new SqlFieldsQuery("INSERT INTO PERSON (ID, NAME) VALUES (?, ?)").setArgs(97, "小红")
                .setSchema("PUBLIC")).getAll();

        SqlFieldsQuery sfq = new SqlFieldsQuery("SELECT name, id from Person WHERE id > ?").setArgs(0).setSchema("PUBLIC");
        FieldsQueryCursor<List<?>> cursor = client.query(sfq);
        //第一维是row，第二维度是列
        List<List<?>> results = cursor.getAll();
        results.forEach(e -> {
            System.out.println(e.get(0));
        });

    }

    @Builder
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    private static class Person {
        Integer id;
        String name;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class ServiceConfig {
        private String service;
        private String endPoint;
    }

}
