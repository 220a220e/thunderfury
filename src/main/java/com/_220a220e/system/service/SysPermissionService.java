package com._220a220e.system.service;

import com._220a220e.system.entity.SysPermission;

import java.util.List;

/**
 * @author Garrosh
 * @date 2018/5/26
 */
public interface SysPermissionService {

    List<SysPermission> findByUserId(Integer userId);
}
