package com._220a220e.system.service;

import com._220a220e.system.entity.SysUser;

/**
 * @author Garrosh
 * @date 2018/5/25
 */
public interface SysUserService {
    /**
     * 插入用户信息
     * @param user
     */
    void insert(SysUser user);
    /**
     * 更新用户信息
     * @param user
     */
    void update(SysUser user);
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
    SysUser findByUsername(String username);
    /**
     * 注册用户
     * @param user
     */
    void saveRegisterUser(SysUser user);
    /**
     *
     * @param userId
     * @return
     */
    SysUser findOne(Integer userId);
}
