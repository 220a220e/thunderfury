package com._220a220e.common.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Garrosh
 * @date 2019/1/6
 */
@Getter
@Setter
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -7402329403546725167L;

    @ApiModelProperty("ID")
    private Integer id;

    @ApiModelProperty("数据状态")
    private Integer status;

    @ApiModelProperty("创建时间")
    private Date createDate;

    @ApiModelProperty("更新时间")
    private Date updateDate;

}
