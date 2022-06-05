package com.jack.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author jackwang
 * @Date 6/5/22 1:32 PM
 */

@RestController
public class HelloController {

    @RequestMapping(value = "/hello/{name}")
    public String sayHi(@PathVariable("name") String userName){
        return "hello " + userName;
    }
}
