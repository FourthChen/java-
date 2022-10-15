package com.itehima.service;


import com.itehima.domain.Role;

import java.util.List;

public interface RoleService {
    public List<Role> list();

    void save(Role role);
}
