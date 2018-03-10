package com.lmx.dedao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author liumingxin
 * @create 2018 10 13:42
 * @desc
 **/
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/helloWorld")
    @ResponseBody
    public String hello(){
        return "hello world";
    }

}
