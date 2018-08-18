package com.chensanwa.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA
 * Created By Mr.Chen
 * Date: 2018/8/12
 * Time: 16:40
 */
@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello(){
        return "Hello SpringBoot.";
    }


}
