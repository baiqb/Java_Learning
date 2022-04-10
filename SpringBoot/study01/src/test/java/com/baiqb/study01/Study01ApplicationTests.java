package com.baiqb.study01;

import com.baiqb.study01.student.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class Study01ApplicationTests {
    @Resource
    Student student;
    @Test
    void contextLoads() {
        System.out.println(student);
    }

}
