package com.greenfox.foxclub.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fox {

  private String name;
  private List<Trick> tricks;
  private List<Food> foodList;
  private List<Drink> drinkList;

  public Fox() {
  }

  public Fox(String name) {
    this.name = name;
    this.drinkList = new ArrayList<>(Arrays.asList(new Drink("water")));
    this.foodList = new ArrayList<>(Arrays.asList(new Food("bread")));
    this.tricks = new ArrayList<>(Arrays.asList(new Trick("breathing", 0)));
  }

  public Fox(String name, List<Trick> tricks, List<Food> foodList, List<Drink> drinkList) {
    this.name = name;
    this.tricks = tricks;
    this.foodList = foodList;
    this.drinkList = drinkList;
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

  public List<Food> getFoodList() {
    return foodList;
  }

  public void setFoodList(List<Food> foodList) {
    this.foodList = foodList;
  }

  public List<Drink> getDrinkList() {
    return drinkList;
  }

  public void setDrinkList(List<Drink> drinkList) {
    this.drinkList = drinkList;
  }
}
