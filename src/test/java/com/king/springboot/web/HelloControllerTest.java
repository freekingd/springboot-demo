package com.king.springboot.web;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

/**
 * Created by zhuru on 2018/12/30.
 */
@SpringBootTest
public class HelloControllerTest {

    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
    }

    @Test
    public void getHello() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/hello?name=小明")
                .accept(MediaType.APPLICATION_JSON_UTF8)).andDo(print());
    }

    @Test
    public void getHello_1() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/hello?name=freeking")
                .accept(MediaType.APPLICATION_JSON_UTF8))/*.andDo(print())*/
                .andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("小明")));
    }
}
