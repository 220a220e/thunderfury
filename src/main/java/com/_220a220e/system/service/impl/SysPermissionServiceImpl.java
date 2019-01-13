package com._220a220e.system.service.impl;

import com._220a220e.system.entity.SysPermission;
import com._220a220e.system.mapper.SysPermissionMapper;
import com._220a220e.system.service.SysPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Garrosh
 * @date 2018/5/27
 */
@Service
public class SysPermissionServiceImpl implements SysPermissionService {

    @Autowired
    private SysPermissionMapper sysPermissionMapper;

    @Override
    public List<SysPermission> findByUserId(Integer userId) {
        return sysPermissionMapper.selectAll();
    }
}
