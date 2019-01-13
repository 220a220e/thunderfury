package com._220a220e.system.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * @author Garrosh
 * @date 2018/5/26
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ApiModel("角色权限关联模型")
@Component
public class SysRolePermission {

    @ApiModelProperty("角色ID")
    private Integer roleId;

    @ApiModelProperty("权限ID")
    private Integer permissionId;

}
