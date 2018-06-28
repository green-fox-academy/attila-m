package com.hellobeanworld.hellobearnworld.controllers;

import com.hellobeanworld.hellobearnworld.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GreenFoxController {

  @Autowired
  StudentService studentService;


  @GetMapping("/gfa/list")
  public String showStudentList(Model model) {
    model.addAttribute("students", studentService);
    return "list";
  }

  @GetMapping("/gfa/add")
  public String showAddStudent() {
    return "add";
  }

  @PostMapping("/gfa/save")
  public String login(@ModelAttribute(value = "studentname") String studentName) {
    studentService.save(studentName);
    return "redirect:/gfa/list";
  }
}
