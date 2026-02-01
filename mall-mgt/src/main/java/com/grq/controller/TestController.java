package com.grq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @author: Grq
 * @description: 测试
 * @date 2026/1/29 23:32
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "hello world";
    }
}
