package com.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("select")
    //@ResponseBody
    public String selectAll(){
        System.out.println("/////////////*/*/*/**");
        return "forward:/index.jsp";
    }

}
