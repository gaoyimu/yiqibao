package com.ctsi.yiqibao.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @类名称: JumpController
 * @作者: 段聪祺
 * @创建时间: 2018/10/8 10:02
 * @说明: 跳转相关控制器
 */
@Controller
public class JumpController {
    /**
     * @作者: 段聪祺
     * @功能描述: 访问pc端首页
     * @时间: 2018/10/8 10:07
     * @参数:  * @param
     * @返回值: java.lang.String
     **/
    @RequestMapping("/")
    public String toIndex(){
        return "index";
    }
}
