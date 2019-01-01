package com._220a220e.framework.shiro.realm;

import com._220a220e.system.entity.Permission;
import com._220a220e.system.entity.Role;
import com._220a220e.system.entity.User;
import com._220a220e.system.service.PermissionService;
import com._220a220e.system.service.RoleService;
import com._220a220e.system.service.UserService;
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
    private UserService userService;

    @Autowired
    private PermissionService permissionService;

    @Autowired
    private RoleService roleService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        //获取用户
        String username = (String) principals.getPrimaryPrincipal();
        User user = userService.findByUsername(username);

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        //赋予角色
        List<Role> roles = roleService.findByUserId(user.getId());
        for (Role role : roles) {
            info.addRole(role.getName());
        }

        //赋予权限
        List<Permission> permissions = permissionService.findByUserId(user.getId());
        for (Permission permission : permissions) {
            info.addStringPermission(permission.getName());
        }

        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String username = token.getUsername();

        User user = userService.findByUsername(username);

        if(user == null) {
            // 没找到帐号
            throw new UnknownAccountException();
        }

        Session session = SecurityUtils.getSubject().getSession();
        session.setAttribute("user", user);
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                user.getUsername(),
                user.getPassword(),
                ByteSource.Util.bytes(user.getCredentialsSalt()),
                getName()
        );
        return authenticationInfo;
    }
}
