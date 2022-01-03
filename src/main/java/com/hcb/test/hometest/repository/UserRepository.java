package com.hcb.test.hometest.repository;

import com.hcb.test.hometest.etity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
