package com.ph.springbootconfig;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-profiles
 * @description:
 * @author: panhao
 * @date: 2021-06-26 15:43
 **/
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello config";
    }
}
