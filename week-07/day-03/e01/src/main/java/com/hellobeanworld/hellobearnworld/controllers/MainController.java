package com.hellobeanworld.hellobearnworld.controllers;

import com.hellobeanworld.hellobearnworld.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @Autowired
  UtilityService utilityService;

  @GetMapping("/useful")
  public String showMainPage() {
    return "useful";
  }

  @GetMapping("/useful/colored")
  public String showColoredPage(Model model) {
    model.addAttribute("color",utilityService.randomColor());
    return "colored";
  }

  @GetMapping("/useful/email")
  public String showEmail(@RequestParam(value = "email")String email, Model model) {
    model.addAttribute("email", email);
    model.addAttribute("isValid", utilityService.validateEmail(email));
    return "email";
  }

  @GetMapping("/useful/caesar")
  public String showCaesarCoding(@RequestParam(value = "text")String text, @RequestParam(value = "number")int number, Model model) {
    model.addAttribute("text", utilityService.caesar(text, number));
    return "caesar";
  }

}
