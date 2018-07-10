package com.greenfox.postmanning.controllers;

import static org.junit.Assert.*;

import com.greenfox.postmanning.models.Greeting;
import com.greenfox.postmanning.models.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;


@RunWith(SpringRunner.class)
@WebMvcTest(JSController.class)
public class JSControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void should_returnDouble_when_gettingNumber() throws Exception {
    mockMvc.perform(get("/doubling?input=15")
            .contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.received", is(15)))
            .andExpect(jsonPath("$.result", is(30)));
  }

  @Test
  public void should_returnWelcome_when_gettingNameAndTitle() throws Exception {
    Greeting greeting = new Greeting(new Person("yourname", "yourtitle"));
    mockMvc.perform(get("/greeter?name=yourname&title=yourtitle")
            .contentType(MediaType.APPLICATION_JSON_UTF8))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.welcome_message", is(greeting.getWelcome_message())));
  }
}