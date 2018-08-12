package com.weily.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用注解来标识这是一个controller
 */
@Controller
public class HellowWorld {
    /**
     * 1.使用RequestMapping 注解来映射请求的URL
     * 和index.jsp 里的href连接一致
     * 2.返回值会通过视图解析器解析为实际的视图，格式：prefix+returnVal+后缀
     * @return
     */
    @RequestMapping("/helloworld")
    public String hello(){
        System.out.println("hello world");
        return "success";
    }
}
