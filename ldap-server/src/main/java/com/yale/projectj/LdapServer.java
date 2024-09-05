package com.yale.projectj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.ldap.repository.config.EnableLdapRepositories;


/**
 * @author Yale
 */
@SpringBootApplication
@EnableLdapRepositories
public class LdapServer {
    public static void main(String[] args) throws Throwable {
        SpringApplication.run(LdapServer.class, args);
    }


}
