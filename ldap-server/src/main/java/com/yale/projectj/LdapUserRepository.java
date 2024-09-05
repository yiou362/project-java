package com.yale.projectj;

import org.springframework.data.ldap.repository.LdapRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Yale
 */
@Repository
public interface LdapUserRepository extends LdapRepository<LdapUser> {

}
