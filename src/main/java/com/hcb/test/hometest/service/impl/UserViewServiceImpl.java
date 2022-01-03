package com.hcb.test.hometest.service.impl;

import com.hcb.test.hometest.etity.UserView;
import com.hcb.test.hometest.repository.UserViewRepository;
import com.hcb.test.hometest.service.UserViewService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserViewServiceImpl implements UserViewService {

    private UserViewRepository userViewRepository;

    public UserViewServiceImpl(UserViewRepository userViewRepository) {
        this.userViewRepository = userViewRepository;
    }

    @Override
    public List<UserView> findAll() {
        return userViewRepository.findAll();
    }
}
