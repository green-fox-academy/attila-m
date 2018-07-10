package com.greenfox.macrotis.macrotisexam.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @GetMapping("")
  public String showIndex() {
    return "index";
  }
}
