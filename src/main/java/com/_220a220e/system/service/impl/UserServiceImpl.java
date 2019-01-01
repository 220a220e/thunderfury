package com._220a220e.system.service.impl;

import com._220a220e.system.entity.User;
import com._220a220e.system.mapper.UserMapper;
import com._220a220e.system.service.UserService;
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
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insert(User user) {
        user.setStatus("1");
        user.setCreateDate(new Date());
        userMapper.insert(user);
    }

    @Override
    @Cacheable(value = "user", key = "'user'.concat(#username)")
    public User findByUsername(String username) {
        return userMapper.selectByUsername(username, "1");
    }

    @Override
    @CachePut(value = "user", key = "'user'.concat(#username)")
    public void update(User user) {
        user.setUpdateDate(new Date());
        userMapper.updateByPrimaryKey(user);
    }

    @Override
    @CacheEvict(value = "user", key = "'user'.concat(#username)", allEntries = true)
    public void delete(Integer id) {
        User user = new User();
        user.setId(id);
        user.setStatus("2");
        update(user);
    }

    @Override
    public void saveRegisterUser(User user) {
        PasswordHelper.encryptPassword(user);
        this.insert(user);
    }

}
