package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sjh
 * @version 1.0
 * @date 2023/6/16 11:02
 * @description: TODO
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/1")
    public String first(){
        return "第一个版本";
    }

    @GetMapping("/test")
    public String test(){
        return "分支";
    }
}
