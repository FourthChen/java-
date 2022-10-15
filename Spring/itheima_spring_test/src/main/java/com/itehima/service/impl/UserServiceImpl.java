package com.itehima.service.impl;

import com.itehima.dao.RoleDao;
import com.itehima.dao.UserDao;
import com.itehima.domain.Role;
import com.itehima.domain.User;
import com.itehima.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    private RoleDao roleDao;

    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    public List<User> list() {
        List<User> userList = userDao.findAll();
        //封装userlist中的每一个User的roles数据
        for (User user : userList) {
            //获得user的id
            Long id = user.getId();
            //将id作为参数查询当前userId对应的Role集合数据
            List<Role> roles=roleDao.findRoleByUserId(id);
            user.setRoles(roles);
        }
        return userList;
    }

    public void save(User user, Long[] roleIds) {
        //1.向sys_user 表中存储数据
        Long userId= userDao.save(user);
        //2.向sys_user_role 关系表存储多条数据
        userDao.saveUserRoleRel(userId,roleIds);

    }

    public void del(Long userId) {
        //1.删除关系表sys_user_role关系表
        userDao.delUserRoleRel(userId);
        //2.删除sys_user表
        userDao.del(userId);
    }
}
