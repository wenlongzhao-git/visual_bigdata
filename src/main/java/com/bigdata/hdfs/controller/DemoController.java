package com.bigdata.hdfs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DemoController {

    @RequestMapping(value = "/demo")
    public String demo(){
        return "hello";
    }
}
