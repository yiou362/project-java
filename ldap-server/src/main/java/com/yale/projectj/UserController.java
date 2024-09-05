package com.yale.projectj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yale
 */
@RestController
public class UserController {
    @Autowired
    LdapUserRepository ldapUserRepository;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveNode() {
        LdapUser person = new LdapUser();
        person.setUid("uid:1");
        person.setSuerName("AAA");
        person.setCommonName("aaa");
        person.setUserPassword("123456");
        return ldapUserRepository.save(person).toString();
    }
}
