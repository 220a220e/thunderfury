package com._220a220e.system.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * @author Garrosh
 * @date 2018/5/27
 */
public interface RolePermissionMapper {
    /**
     * 插入关联
     * @param roleId
     * @param permissionId
     */
    void insert(@Param("roleId") Integer roleId, @Param("permissionId") Integer permissionId);
    /**
     * 删除关联
     * @param roleId
     * @param permissionId
     */
    void delete(@Param("roleId") Integer roleId, @Param("permissionId") Integer permissionId);
}
