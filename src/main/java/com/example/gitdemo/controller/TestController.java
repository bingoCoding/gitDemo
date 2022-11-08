package com.example.gitdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TestController
 * @Author: supsky
 * @Date: 2022-11-08
 **/
@RestController
public class TestController {

    @GetMapping("test")
    public String test(){
        return "test";
    }

    @GetMapping("test2")
    public String test2(){
        return "test";
    }


}
