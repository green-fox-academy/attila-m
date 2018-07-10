package com.greenfox.macrotis.macrotisexam.controllers;

import com.greenfox.macrotis.macrotisexam.services.AttractionService;
import com.greenfox.macrotis.macrotisexam.services.AttractionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  AttractionService attractionService;

  @Autowired
  public MainController(AttractionService attractionService) {
    this.attractionService = attractionService;
  }

  @GetMapping("")
  public String showIndex(Model model) {
    model.addAttribute("attractionlist", attractionService.getAllAttractions());
    return "index";
  }
}
