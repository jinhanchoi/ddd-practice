package com.jpa.test.example.testexample;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class HelloTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void homeHi_test() throws Exception{

        final ResultActions actions = mvc.perform(get("/home/hello")
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andDo(print());
        //then
        actions
                .andExpect(status().isOk())
                .andExpect(content().string("hello"));
//                .andExpect(jsonPath("resultCode").value(200))
//                .andExpect(jsonPath("message").value("success!"))
//                .andExpect(jsonPath("data").value("my name is jinhan"));
    }

}
