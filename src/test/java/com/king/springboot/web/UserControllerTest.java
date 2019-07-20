package com.king.springboot.web;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

/**
 * Created by zhuru on 2018/12/30.
 */
@SpringBootTest
public class UserControllerTest {

    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
    }

    @Test
    public void getUser() throws Exception {
        String responseString = mockMvc.perform(post("/getUser"))
                .andReturn().getResponse().getContentAsString();
        System.out.println("result : "+responseString);
    }

    @Test
    public void getUsers() throws Exception {
        String responseString = mockMvc.perform(post("/getUsers"))
                .andReturn().getResponse().getContentAsString();
        System.out.println("result : "+responseString);
    }

}