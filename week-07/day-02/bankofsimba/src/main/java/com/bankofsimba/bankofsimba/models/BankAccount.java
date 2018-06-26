package com.bankofsimba.bankofsimba.models;

public class BankAccount {
  private String name;
  private int balance;
  private String animalType;
  private boolean king;
  private boolean goodguy;

  public BankAccount() {
    this("szimba", 500, "oroszlan", true, true);
  }

  public BankAccount(String name, int balance, String animalType, boolean king, boolean good) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.king = king;
    this.goodguy = good;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public boolean isKing() {
    return king;
  }

  public void setKing(boolean king) {
    king = king;
  }

  public boolean isGoodguy() {
    return goodguy;
  }

  public void setGoodguy(boolean goodguy) {
    this.goodguy = goodguy;
  }
}

