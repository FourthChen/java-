package cn.itcast.dao;

import cn.itcast.domain.User;

import java.util.List;

/**
 * 用户操作DAO
 */
public interface UserDao {
    /**
     *
     * @return
     */
    public List<User> findAll();
    User findUserByUsernameAndPassword(String username, String password);
    void add(User user);
    void delete(int id);
    User findByid(int id);

    void update(User user);
}
