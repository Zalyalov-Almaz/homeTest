package com.hcb.test.hometest.mapper;

import com.hcb.test.hometest.etity.User;
import com.hcb.test.hometest.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserMapper {

    @Mapping(target = "roles.role", source = "roles")
    User userDtoToUser(UserDto userDto);
}
