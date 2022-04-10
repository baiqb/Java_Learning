package com.baiqb.webtest.controller;

import com.baiqb.webtest.entity.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @Value("${test.name}")
    String name;

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "欢迎访问你的第一个SpringBoot 项目！" + name;
    }

    @RequestMapping("/student")
    @ResponseBody
    public Student student() {
        Student student = new Student();
        student.setName("白清滨");
        student.setSex("男");
        student.setSid(10);
        return student;
    }
}
