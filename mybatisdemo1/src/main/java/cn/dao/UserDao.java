package cn.dao;

import cn.domain.User;

import java.util.List;

/**
 * @Author: tanjia
 * @Date: 2019/7/18 2:43
 */
public interface UserDao {

    /**
     * 保存，新增用户
     * @param user
     */
    void saveUser(User user);

    /**
     * 根据id删除用户
     * @param id
     */
    void deleteUser(Integer id);

    /**
     * 更新用户
     * @param user
     */
    void updateUser(User user);


    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll();
    List<User> findAll2();
    /**
     * 模糊查询
     * @return
     */
    List<User> findByUsername(String username);
    /**
     * 根据id查找用户
     * @param id
     * @return
     */
    User findById(Integer id);
    /**
     * 统计sex=男的用户数
     * @param sex
     * @return
     */
    int count(String sex);
    List<User> findUserByCondition(User user);


}
