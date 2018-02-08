package com.wx.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 孙宪伟
 * @date 2018/2/8
 * @time 下午4:15
 * @description $des$
 */
@RestController
public class IndexController {


    @RequestMapping("/index")
    public String hello() {
        return "hell";
    }
}
