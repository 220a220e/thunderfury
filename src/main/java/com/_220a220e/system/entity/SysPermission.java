package com._220a220e.system.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author Garrosh
 * @date 2018/5/26
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ApiModel("权限模型")
@Component
public class SysPermission implements Serializable {

    private static final long serialVersionUID = 7217990822178704173L;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("类型")
    private String type;

    @ApiModelProperty("URL")
    private String url;

    @ApiModelProperty("权限")
    private String permission;

    @ApiModelProperty("描述")
    private String description;

    @ApiModelProperty("父级权限")
    private Integer parentId;

    @ApiModelProperty("父级权限集合")
    private String parentIds;

}
