package com.greenfox.foxclub.controllers;

import com.greenfox.foxclub.models.Trick;
import com.greenfox.foxclub.services.FoxService;
import com.greenfox.foxclub.services.FoxServiceImpl;
import com.greenfox.foxclub.services.TrickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private FoxService foxService;
  private TrickService trickService;

  @Autowired
  public MainController(FoxServiceImpl foxService, TrickService trickService) {
    this.foxService = foxService;
    this.trickService = trickService;
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
    foxService.login(name);
    model.addAttribute("fox", foxService.getFox(name));
    model.addAttribute("trickValue", foxService.getTrickValueSum(name));
    return "index";
  }

  @GetMapping("/trick_center")
  public String showTrickCenterPage(Model model) {
    model.addAttribute("tricks", trickService.getTrickList());
    return "trickCenter";
  }

}
