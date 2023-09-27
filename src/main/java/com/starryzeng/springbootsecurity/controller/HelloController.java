package com.starryzeng.springbootsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author StarryZeng
 * @version 1.0.0
 * @date 2023/9/27 17:14
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    
    @GetMapping("/test01")
    public String test01() {
        return "test01";
    }
    
}
