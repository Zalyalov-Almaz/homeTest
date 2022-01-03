package com.hcb.test.hometest.service.impl;

import com.hcb.test.hometest.dto.UserDto;
import com.hcb.test.hometest.etity.User;
import com.hcb.test.hometest.mapper.UserMapper;
import com.hcb.test.hometest.repository.RoleRepository;
import com.hcb.test.hometest.repository.UserRepository;
import com.hcb.test.hometest.service.UserService;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@NoArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private UserMapper userMapper;
    private RoleRepository roleRepository;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
        this.roleRepository = roleRepository;
    }

    @Transactional
    @Override
    public User createUser(UserDto userDto) {
        User user = userMapper.userDtoToUser(userDto);
        return userRepository.save(user);
    }

    @Transactional
    @Override
    public void deleteUserById(long id) {
        userRepository.deleteById(id);
    }

    @Transactional
    @Override
    public User updateUserById(long id, UserDto userDto) {
        User userToUpdate = userRepository.getById(id);
        userToUpdate.setName(userDto.getName());
        userToUpdate.setRoles(roleRepository.getRolesByNames(userDto.getRoles()));
        userRepository.save(userToUpdate);
        return userToUpdate;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
