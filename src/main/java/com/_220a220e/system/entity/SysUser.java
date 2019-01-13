package com._220a220e.system.entity;

import com._220a220e.common.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Garrosh
 * @date 2018/5/25
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ApiModel("用户模型")
@Component
public class SysUser extends BaseEntity  {

    private static final long serialVersionUID = -865143097102404970L;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("用户密码")
    private String password;

    @ApiModelProperty("密码盐值")
    private String salt;

    @ApiModelProperty("用户昵称")
    private String nickname;

    @ApiModelProperty("用户昵称")
    private String phone;

    @ApiModelProperty("用户邮箱")
    private String email;

    private List<SysRole> roles;

    /**
     * 证书凭证
     * @return
     */
    public String getCredentialsSalt() {
        return username + salt;
    }
}
