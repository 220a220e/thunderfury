package com._220a220e.framework.shiro.realm;

import com._220a220e.system.entity.SysPermission;
import com._220a220e.system.entity.SysRole;
import com._220a220e.system.entity.SysUser;
import com._220a220e.system.service.SysPermissionService;
import com._220a220e.system.service.SysRoleService;
import com._220a220e.system.service.SysUserService;
import com._220a220e.system.util.constants.SystemConstants;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Garrosh
 * @date 2018/5/26
 */
public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private SysPermissionService permissionService;

    @Autowired
    private SysRoleService sysRoleService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        //获取用户
        String username = (String) principals.getPrimaryPrincipal();
        SysUser user = sysUserService.findByUsername(username);

        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        //赋予角色
        List<SysRole> roles = sysRoleService.findByUserId(user.getId());
        for (SysRole role : roles) {
            authorizationInfo.addRole(role.getName());
        }

        //赋予权限
        List<SysPermission> permissions = permissionService.findByUserId(user.getId());
        for (SysPermission permission : permissions) {
            authorizationInfo.addStringPermission(permission.getName());
        }

        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String username = token.getUsername();

        SysUser user = sysUserService.findByUsername(username);

        if(user == null) {
            // 没找到帐号
            throw new UnknownAccountException();
        }

        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                user.getUsername(),
                user.getPassword(),
                ByteSource.Util.bytes(user.getCredentialsSalt()),
                getName()
        );

        Session session = SecurityUtils.getSubject().getSession();
        session.setAttribute(SystemConstants.CURRENT_USER, user);
        return authenticationInfo;
    }
}
