package com.itehima.service.impl;

import com.itehima.dao.RoleDao;
import com.itehima.domain.Role;
import com.itehima.service.RoleService;

import java.util.List;

public class RoleServiceImpl implements RoleService {

    private RoleDao roleDao;

    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    public List<Role> list() {
        List<Role> roleList=roleDao.findAll();
        return roleList;
    }

    public void save(Role role) {
        roleDao.save(role);
    }
}
