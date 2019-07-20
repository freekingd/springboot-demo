package com.king.springboot.comm;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created by zhuru on 2018/12/30.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesTest {
    @Value("${king.value}")
    private String value;

    @Resource
    private KingProperties properties;
    
    @Resource
    private OtherProperties otherProperties;

    @Test
    public void testSingle() {
        Assert.assertEquals(value,"truth,goodness,beauty");
    }

    @Test
    public void testMore() {
        System.out.println("-----------" + "value:" + properties.getValue() + ",road:" + properties.getRoad() + "-----------");
    }
    
    @Test
    public void testOther() {
        System.out.println("-----------" + otherProperties.getDescription() + "-----------");
        
    }
}
