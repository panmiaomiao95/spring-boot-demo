package com.example.demo;

import com.example.demo.controller.HelloWordController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


/**
 * Created by Admin on 2018/2/24.
 */
public class HelloControlerTests {
    private MockMvc mvc;

    @Before
    public void  setUp() throws Exception{
        mvc= MockMvcBuilders.standaloneSetup(new HelloWordController()).build();
    }

    @Test
    public void getHello()throws Exception{
        mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }
}
