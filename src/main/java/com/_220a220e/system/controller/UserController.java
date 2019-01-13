package com._220a220e.system.controller;

import com._220a220e.common.controller.BaseController;
import com._220a220e.system.entity.SysUser;
import com._220a220e.system.service.SysUserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Garrosh
 * @date 2019/1/6
 */
@Api("User相关API")
@Controller("systemUserController")
@RequestMapping("/system/user")
public class UserController extends BaseController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping(value = {"/", "/index", "/index.html"})
    public String index() {
        return null;
    }

    @ApiOperation("根据ID获取用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "id", dataType = "Integer",
                    required = true, value = "用户的ID", defaultValue = "0")
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })
    @GetMapping(value = "/getUserInfo")
    @ResponseBody
    public SysUser getUserInfo(@RequestParam("id") Integer id) {
        return sysUserService.findOne(id);
    }

}
