package com.greenfox.springsecurity.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @RequestMapping(value = "svc/v1/public/accounts/{accountNumber}")
  public String getPublicAccountDataLinkedTo(@PathVariable int accountNumber) {
    return "Public account linked to: " + accountNumber;
  }
  
  @RequestMapping(value = "svc/v1/private/accounts/{accountNumber}")
  public String getPrivateAccountDataLinkedTo(@PathVariable int accountNumber) {
    return "Private account linked to: " + accountNumber;
  }
}
