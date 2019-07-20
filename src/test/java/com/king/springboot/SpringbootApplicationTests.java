package com.king.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void test() {
        String s1 = new String("hello");
        System.out.println("-----------" + (s1 == "hello") + "-----------");

        String s2 = "hello";
        System.out.println("-----------" + (s1 == s2) + "-----------");
        
    }

}

