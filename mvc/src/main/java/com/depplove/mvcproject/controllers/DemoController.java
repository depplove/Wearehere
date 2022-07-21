package com.depplove.mvcproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DemoController {

    @GetMapping("/hello")
    public String get(){
        return "employees";
    }


}
