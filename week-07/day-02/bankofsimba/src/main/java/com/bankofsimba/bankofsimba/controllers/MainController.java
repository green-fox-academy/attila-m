package com.bankofsimba.bankofsimba.controllers;

import com.bankofsimba.bankofsimba.models.AccountList;
import com.bankofsimba.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  AccountList accountList = new AccountList();

  @GetMapping("")
  public String showIndexPage() {
    return "index";
  }

  @GetMapping("/show")
  public String showBankAccounts(Model model) {
    BankAccount bankAccount = new BankAccount("Simba", 2000, "Lion", true, true);
    model.addAttribute("bankAccount", bankAccount);
    return "show";
  }

  @GetMapping("/enjoy")
  public String showEnjoyPage(Model model) {
    model.addAttribute("enjoy", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "enjoy";
  }

  @GetMapping("/show_accounts")
  public String showAllAccounts(Model model) {
    model.addAttribute("allAccounts", accountList);
    model.addAttribute("newAccount", new BankAccount());
    return "show_accounts";
  }

  @PostMapping("/show_accounts")
  public String submitNewAccount(@ModelAttribute BankAccount bankAccount) {
    accountList.accountList.add(bankAccount);
    return "redirect:/show_accounts";
  }
}
