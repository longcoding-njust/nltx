package com.lee.nltx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {
    @RequestMapping("/test")
    public String func() {
        return "hello world";
    }
}
