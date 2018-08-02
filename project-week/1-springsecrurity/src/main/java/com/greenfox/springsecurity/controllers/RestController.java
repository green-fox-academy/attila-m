package com.greenfox.springsecurity.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController{

  @RequestMapping(value = "/public/account/{number}")
  public String getPublicData(@PathVariable int number) {
    return "Public number in URL is: " + number;
  }

  @RequestMapping(value = "/private/account/{number}")
  public String getPrivateData(@PathVariable int number) {
    return "Private number in URL is: " + number;
  }

  @RequestMapping(value = "/private/admin/account/{number}")
  public String getPrivateAdminData(@PathVariable int number) {
    return "Private admin number in URL is: " + number;
  }
}
