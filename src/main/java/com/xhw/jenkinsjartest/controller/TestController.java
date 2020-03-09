package com.xhw.jenkinsjartest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * ${INTRO}
 *
 * @author Shinelon
 * @since 2020-03-09 17:22:25
 */

@Controller
public class TestController {
    @GetMapping("/test")
    @ResponseBody
    public String test1(){
        return "你好测试成功";
    }
}
