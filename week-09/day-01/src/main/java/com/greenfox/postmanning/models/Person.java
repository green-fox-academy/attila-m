package com.greenfox.postmanning.models;

import org.springframework.stereotype.Component;

public class Person {

  private String name;
  private String title;

  public Person() {
  }

  public Person(String name, String title) {
    this.name = name;
    this.title = title;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
