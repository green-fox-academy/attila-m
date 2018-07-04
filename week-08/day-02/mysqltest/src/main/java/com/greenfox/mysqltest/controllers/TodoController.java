package com.greenfox.mysqltest.controllers;

import com.greenfox.mysqltest.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @RequestMapping(value = {"/","/list"}, method = RequestMethod.GET)
    public String list(Model model) {
    model.addAttribute("todos", todoRepository.findAll());
      return "todolist";
    }
}
