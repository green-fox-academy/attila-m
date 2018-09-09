package com.aspecttesting.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.SchemaOutputResolver;

@RestController
public class MainController {

  @GetMapping("/main")
  public void getIndex() {
    System.out.println("GetIndex called.");
  }

  @GetMapping("/return")
  public String returnAspect() {
    System.out.println("ReturnAspect called.");
    return "PARAMETER";
  }
}
