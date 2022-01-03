package com.hcb.test.hometest.controller;

import com.hcb.test.hometest.dto.UserDto;
import com.hcb.test.hometest.etity.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user",
                produces = MediaType.APPLICATION_JSON_VALUE,
                consumes = MediaType.ALL_VALUE)
public interface UserController {

    @PostMapping("/create")
    @ApiOperation(value = "Создание нового пользователя")
    User createUser(UserDto userDto);

}
