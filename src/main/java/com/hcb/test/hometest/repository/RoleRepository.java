package com.hcb.test.hometest.repository;

import com.hcb.test.hometest.etity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Long> {

    @Query("from Role r where r.role in (:roles)")
    List<Role> getRolesByNames(@Param(value = "roles") List<String> roles);
}
