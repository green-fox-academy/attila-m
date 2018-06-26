package com.bankofsimba.bankofsimba.models;

import java.util.ArrayList;
import java.util.List;

public class AccountList {

  private List<BankAccount> accountList;

  public AccountList() {
    accountList = new ArrayList<>();
    generateAccounts();
  }

  public List<BankAccount> getAccountList() {
    return accountList;
  }

  public void setAccountList(List<BankAccount> accountList) {
    this.accountList = accountList;
  }

  public void generateAccounts() {
    accountList.add(new BankAccount("Simba", 20000, "lion", true, true));
    accountList.add(new BankAccount("Timon Berkowitz", 1000, "meerkat", false, true));
    accountList.add(new BankAccount("Pumbaa", 1, "warthog", false, true));
    accountList.add(new BankAccount("Scar", 40000, "lion",false, true ));
    accountList.add(new BankAccount("Rafiki", 5000, "mandrill", false,true));
  }
}
