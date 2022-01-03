package com.hcb.test.hometest.service;

import com.hcb.test.hometest.dto.UserDto;
import com.hcb.test.hometest.etity.Role;
import com.hcb.test.hometest.etity.User;

import java.util.List;

public interface UserService {

    User createUser(UserDto userDto);
    void deleteUserById(long id);
    User updateUserById(long id, UserDto userDto);
    List<User> findAll();
}
