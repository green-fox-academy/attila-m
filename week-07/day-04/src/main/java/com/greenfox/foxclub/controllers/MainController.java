package com.greenfox.foxclub.controllers;

import com.greenfox.foxclub.services.FoxService;
import com.greenfox.foxclub.services.FoxServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private FoxService foxService;

  @Autowired
  public MainController(FoxServiceImpl foxService) {
    this.foxService = foxService;
  }

  @GetMapping("/login")
  public String showLoginPage() {

    return "login";
  }

  @GetMapping("")
  public String submitFox(@RequestParam(value = "name", required = false) String name, Model model) {
    if (name == null) {
      return "redirect:/login";
    }
    model.addAttribute("name", name);
    return "index";
  }
}
