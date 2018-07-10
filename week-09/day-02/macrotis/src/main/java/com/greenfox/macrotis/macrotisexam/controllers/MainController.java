package com.greenfox.macrotis.macrotisexam.controllers;

import com.greenfox.macrotis.macrotisexam.models.Attractions;
import com.greenfox.macrotis.macrotisexam.services.AttractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  AttractionService attractionService;

  @Autowired
  public MainController(AttractionService attractionService) {
    this.attractionService = attractionService;
  }

  @GetMapping("")
  public String showIndex(Model model) {
    model.addAttribute("newAttraction", new Attractions());
    model.addAttribute("attractionlist", attractionService.getAllAttractions());
    return "index";
  }

  @PostMapping("/add")
  public String addAttraction(@ModelAttribute Attractions attraction) {
    attractionService.addAttraction(attraction);
    return "redirect:/";
  }
}