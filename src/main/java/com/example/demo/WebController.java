package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WebController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/about")
    public String about(){
        return "about";
    }
}
