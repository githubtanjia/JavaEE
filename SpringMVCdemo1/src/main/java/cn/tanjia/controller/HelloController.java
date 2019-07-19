package cn.tanjia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: tanjia
 * @Date: 2019/7/20 1:21
 */
@Controller
@RequestMapping("/c")
public class HelloController {


    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println("hello springMVC...");
        return "success";
    }
                                    // 请求参数必须有username属性(且值为heihei) 请求头必须包含Accept
    @RequestMapping(value = "/hello2",params = {"username=heihei"},headers = {"Accept"})
    public String sayHello2(){
        System.out.println("hello springMVC...");
        return "success";
    }

}
