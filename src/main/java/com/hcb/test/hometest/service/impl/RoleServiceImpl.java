package com.hcb.test.hometest.service.impl;

import com.hcb.test.hometest.etity.Role;
import com.hcb.test.hometest.repository.RoleRepository;
import com.hcb.test.hometest.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> getRolesByName(List<String> roles) {
        return roleRepository.getRolesByNames(roles);
    }
}
