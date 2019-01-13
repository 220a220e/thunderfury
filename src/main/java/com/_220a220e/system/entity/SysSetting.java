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
 * @date 2019/1/13
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ApiModel("系统设置")
@Component
public class SysSetting extends BaseEntity {

    private static final long serialVersionUID = -6827458555614100222L;

    private String name;

}
