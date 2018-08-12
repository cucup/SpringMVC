package com.weily.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ��ע������ʶ����һ��controller
 */
@Controller
public class HellowWorld {
    /**
     * 1.ʹ��RequestMapping ע����ӳ�������URL
     * ��index.jsp ���href����һ��
     * 2.����ֵ��ͨ����ͼ����������Ϊʵ�ʵ���ͼ����ʽ��prefix+returnVal+��׺
     * @return
     */
    @RequestMapping("/helloworld")
    public String hello(){
        System.out.println("hello world");
        return "success";
    }
}
