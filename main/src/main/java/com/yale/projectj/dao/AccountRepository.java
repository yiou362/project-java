package com.yale.projectj.dao;

import com.yale.projectj.models.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Yale
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    Optional<Account> findByUserId(Integer userId);
}
