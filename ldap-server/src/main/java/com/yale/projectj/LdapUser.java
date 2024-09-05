package com.yale.projectj;

import org.springframework.ldap.odm.annotations.Attribute;
import org.springframework.ldap.odm.annotations.DnAttribute;
import org.springframework.ldap.odm.annotations.Entry;
import org.springframework.ldap.odm.annotations.Id;

import javax.naming.Name;

/**
 * @author Yale
 */
@Entry(base = "uid=ben,ou=people,dc=didispace,dc=com", objectClasses = "inetOrgPerson")
public class LdapUser {
    @Id
    private Name dn;
    @DnAttribute(value = "uid", index = 3)
    private String uid;
    @Attribute(name = "cn")
    private String commonName;
    @Attribute(name = "sn")
    private String suerName;
    private String userPassword;

    public Name getDn() {
        return dn;
    }

    public void setDn(Name dn) {
        this.dn = dn;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getSuerName() {
        return suerName;
    }

    public void setSuerName(String suerName) {
        this.suerName = suerName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}