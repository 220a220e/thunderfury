package com._220a220e.system.service;

import com._220a220e.system.entity.Permission;

import java.util.List;

/**
 * @author Garrosh
 * @date 2018/5/26
 */
public interface PermissionService {

    List<Permission> findByUserId(Integer userId);
}
