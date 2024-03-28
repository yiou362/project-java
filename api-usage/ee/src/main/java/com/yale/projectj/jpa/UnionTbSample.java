package com.yale.projectj.jpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

/**
 * @author Yale
 */
@SpringBootTest
@TestPropertySource(locations = "classpath:application.yml")
public class UnionTbSample {
    @Autowired
    UserInfoRepository userInfoRepository;

    @Test
    public void testUnionTable() {

    }
}
