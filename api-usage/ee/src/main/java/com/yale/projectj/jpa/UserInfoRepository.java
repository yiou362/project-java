package com.yale.projectj.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Yale
 */
@Repository
public class UserInfoRepository extends JpaRepository<User, Long> {
}
