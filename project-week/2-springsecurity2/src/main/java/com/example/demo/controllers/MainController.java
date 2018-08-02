package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @RequestMapping("testing/public/account/{accNum}")
  public String getPublicAccountData(@PathVariable final int accNum) {
    return "Public Number is: " + accNum;
  }

  @RequestMapping("testing/private/account/{accNum}")
  public String getPrivateAccountData(@PathVariable final int accNum) {
    return "Private Number is: " + accNum;
  }

  @RequestMapping("testing/private/admin/account/{accNum}")
  public String getPrivateAdminAccountData(@PathVariable final int accNum) {
    return "Admin Number is: " + accNum;
  }

}
