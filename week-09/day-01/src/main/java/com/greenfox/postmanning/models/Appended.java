package com.greenfox.postmanning.models;

public class Appended implements Returnable{

  private String appended;

  public Appended() {
  }

  public Appended(String word) {
    this.appended = word + "a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
