package com._220a220e.system.service.impl;

import com._220a220e.system.entity.Role;
import com._220a220e.system.mapper.RoleMapper;
import com._220a220e.system.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Garrosh
 * @date 2018/5/27
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> findByUserId(Integer userId) {
        return roleMapper.selectByUserId(userId);
    }
}
