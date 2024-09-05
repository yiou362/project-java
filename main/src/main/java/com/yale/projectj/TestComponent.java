package com.yale.projectj;

import org.springframework.stereotype.Component;

/**
 * @author Yale
 */
@Component
public class TestComponent {

    public void init(User user) {
        user = new User();
        user.setId(1);
        user.setName("Yale");
        user.setGender("M");
    }
}
