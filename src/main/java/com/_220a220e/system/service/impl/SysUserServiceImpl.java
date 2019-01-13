package com._220a220e.system.service.impl;

import com._220a220e.system.entity.SysUser;
import com._220a220e.system.mapper.SysUserMapper;
import com._220a220e.system.service.SysUserService;
import com._220a220e.system.util.PasswordHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author Garrosh
 * @date 2018/5/26
 */
@Service
@CacheConfig(cacheNames = "user")
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public void insert(SysUser user) {
        user.setStatus(1);
        user.setCreateDate(new Date());
        sysUserMapper.insert(user);
    }

    @Override
    @Cacheable(value = "user", key = "'user'.concat(#username)")
    public SysUser findByUsername(String username) {
        return sysUserMapper.selectByUsername(username, "1");
    }

    @Override
    @CachePut(value = "user", key = "'user'.concat(#username)")
    public void update(SysUser user) {
        user.setUpdateDate(new Date());
        sysUserMapper.updateByPrimaryKey(user);
    }

    @Override
    @CacheEvict(value = "user", key = "'user'.concat(#username)", allEntries = true)
    public void delete(Integer id) {
        SysUser user = new SysUser();
        user.setId(id);
        user.setStatus(2);
        update(user);
    }

    @Override
    public void saveRegisterUser(SysUser user) {
        PasswordHelper.encryptPassword(user);
        this.insert(user);
    }

    @Override
    public SysUser findOne(Integer userId) {
        return sysUserMapper.selectByPrimaryKey(userId);
    }

}
