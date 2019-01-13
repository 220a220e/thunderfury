package com._220a220e.system.service;

import com._220a220e.system.entity.SysRole;

import java.util.List;

/**
 * @author Garrosh
 * @date 2018/5/27
 */
public interface SysRoleService {
    /**
     * 查询用户的角色信息
     * @param userId
     * @return
     */
    List<SysRole> findByUserId(Integer userId);
}
