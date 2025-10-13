package com.example.demo1.controller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class IndexController {

    @GetMapping("/")
    public @ResponseBody String index(){
        return "hello, world!";
    }
    
}

