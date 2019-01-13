package com._220a220e.system.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * @author Garrosh
 * @date 2018/5/27
 */
public interface SysUserRoleMapper {
    /**
     * 插入关联
     * @param userId
     * @param roleId
     */
    void insert(@Param("userId") Integer userId, @Param("roleId") Integer roleId);
    /**
     * 删除关联
     * @param userId
     * @param roleId
     */
    void delete(@Param("userId") Integer userId, @Param("roleId") Integer roleId);
}
