package com._220a220e.system.service.impl;

import com._220a220e.system.entity.SysRole;
import com._220a220e.system.mapper.SysRoleMapper;
import com._220a220e.system.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Garrosh
 * @date 2018/5/27
 */
@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public List<SysRole> findByUserId(Integer userId) {
        return sysRoleMapper.selectByUserId(userId);
    }
}
