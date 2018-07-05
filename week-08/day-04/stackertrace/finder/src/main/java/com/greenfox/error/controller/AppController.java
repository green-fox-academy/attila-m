package com.greenfox.error.controller;

import com.greenfox.error.model.User;
import com.greenfox.error.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {

    @Autowired
    UserService service;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("userObject", new User());
        model.addAttribute("showAll", service.getAll());
        return "main";
    }

    @PostMapping("/app")
    public String create(@ModelAttribute User userObject) {
        service.save(userObject);
        return "redirect:/";
    }
}