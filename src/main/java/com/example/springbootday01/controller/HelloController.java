package com.example.springbootday01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类说明:
 *
 * @Author: 黄刚
 * @Date: 2020/4/15 21:46
 */
/*@ResponseBody
@Controller*/
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
