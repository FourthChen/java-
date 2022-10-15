package cn.itcast.service.Impl;

import cn.itcast.dao.Impl.UserDaoImpl;
import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import cn.itcast.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao dao=new UserDaoImpl();

    @Override
    public List<User> findAll() {
        //调用Dao完成查询
        return dao.findAll();
    }
    @Override
    public User login(User user) {
        return dao.findUserByUsernameAndPassword(user.getUsername(),user.getPassword());
    }

    @Override
    public void deleteUser(String id) {

        dao.delete(Integer.parseInt(id));
    }

    @Override
    public void addUser(User user) {
        dao.add(user);
    }

    @Override
    public User findUserByid(String id) {
        return dao.findByid(Integer.parseInt(id));
    }

    @Override
    public void updateUser(User user) {
        dao.update(user);
    }

    @Override
    public void delSelectedUser(String[] ids) {
        //遍历数组
        for (String id : ids) {
            //调用dao删除
            dao.delete(Integer.parseInt(id));
        }
    }
}
