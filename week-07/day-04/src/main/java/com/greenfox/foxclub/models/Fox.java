package com.greenfox.foxclub.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fox {

  private String name;
  private List<Trick> tricks;
  private String food;
  private String drink;

  public Fox() {
  }

  public Fox(String name) {
    this.name = name;
    this.drink = "water";
    this.food = "bread";
    this.tricks = new ArrayList<>(Arrays.asList(new Trick("breathing", 0)));
  }

  public Fox(String name, List<Trick> tricks, String food, String drink) {
    this.name = name;
    this.tricks = tricks;
    this.food = food;
    this.drink = drink;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Trick> getTricks() {
    return tricks;
  }

  public void setTricks(List<Trick> tricks) {
    this.tricks = tricks;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }
}
