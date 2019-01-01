package com._220a220e.system.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author Garrosh
 * @date 2018/5/26
 */
@AllArgsConstructor
@NoArgsConstructor
public class RolePermission {
    private Integer roleId;
    private Integer permissionId;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }
}
