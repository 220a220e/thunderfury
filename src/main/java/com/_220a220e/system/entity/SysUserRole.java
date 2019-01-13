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
@ApiModel("用户角色关联模型")
@Component
public class SysUserRole {

    @ApiModelProperty("用户ID")
    private Integer userId;

    @ApiModelProperty("角色ID")
    private Integer roleId;

}
