package com.greenfox.macrotis.macrotisexam.controllers;

import com.greenfox.macrotis.macrotisexam.models.Filter;
import com.greenfox.macrotis.macrotisexam.services.AttractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  AttractionService attractionService;

  @Autowired
  public RestController(AttractionService attractionService) {
    this.attractionService = attractionService;
  }

  @GetMapping("/attractions")
  public Filter filterAttractions(@RequestParam(value = "city", required = false) String city,
                                  @RequestParam(value = "category", required = false) String category) {
    return attractionService.filterAttractions(city, category);
  }
}
