package com._220a220e.system.service;

import com._220a220e.system.entity.Role;

import java.util.List;

/**
 * @author Garrosh
 * @date 2018/5/27
 */
public interface RoleService {
    /**
     * 查询用户的角色信息
     * @param userId
     * @return
     */
    List<Role> findByUserId(Integer userId);
}
