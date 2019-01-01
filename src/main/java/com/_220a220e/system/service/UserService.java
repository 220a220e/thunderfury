package com._220a220e.system.service;

import com._220a220e.system.entity.User;

/**
 * @author Garrosh
 * @date 2018/5/25
 */
public interface UserService {
    /**
     * 插入用户信息
     * @param user
     */
    void insert(User user);
    /**
     * 更新用户信息
     * @param user
     */
    void update(User user);
    /**
     * 删除用户信息
     * @param id
     */
    void delete(Integer id);
    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    User findByUsername(String username);
    /**
     * 注册用户
     * @param user
     */
    void saveRegisterUser(User user);
}
