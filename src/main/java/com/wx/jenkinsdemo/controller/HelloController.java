package com.wx.jenkinsdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 孙宪伟
 * @date 2018/2/8
 * @time 下午4:06
 * @description $des$
 */

@Controller
public class HelloController {

    @RequestMapping(value="/")
    public String hello() {
        return "index";
    }
}
