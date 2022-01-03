package com.hcb.test.hometest.repository;

import com.hcb.test.hometest.etity.UserView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserViewRepository extends JpaRepository<UserView, Long> {
    List<UserView> findAll();
}
