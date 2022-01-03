package com.hcb.test.hometest.service;

import com.hcb.test.hometest.etity.Role;

import java.util.Collection;
import java.util.List;

public interface RoleService {

    List<Role> getRolesByName(List<String> roles);

}
