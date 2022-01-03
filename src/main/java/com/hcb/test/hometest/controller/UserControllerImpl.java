package com.hcb.test.hometest.controller;

import com.hcb.test.hometest.dto.UserDto;
import com.hcb.test.hometest.etity.User;
import com.hcb.test.hometest.service.UserService;

public class UserControllerImpl implements UserController {

    private UserService userService;

    public UserControllerImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public User createUser(UserDto userDto) {
        return userService.createUser(userDto);
    }

}
