package com._220a220e.system.entity;

import com._220a220e.common.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
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
@ApiModel("角色模型")
@Component
public class SysRole extends BaseEntity {

    private static final long serialVersionUID = 4433591398139471875L;

    private String role;
    private String name;
    private Integer level;
    private String description;

}
