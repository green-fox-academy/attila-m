package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

  AtomicLong counter = new AtomicLong();

  @RequestMapping
  public Greeting greeting(@RequestParam(value = "content", defaultValue = "World!") String content) {
    return new Greeting(counter.incrementAndGet(),"Hello " + content + "!");
  }
}
