package com.greenfox.postmanning.models;

public class Greeting implements Returnable {

  private String welcome_message;

  public Greeting(Person person) {
    welcome_message = "Oh, hi there " + person.getName() + ", my dear " + person.getTitle() + "!";
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }
}
