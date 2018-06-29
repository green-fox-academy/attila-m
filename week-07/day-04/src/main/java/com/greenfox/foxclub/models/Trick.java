package com.greenfox.foxclub.models;

public class Trick {
  private String trickName;
  public int value;

  public Trick() {
  }

  public Trick(String trickName, int value) {
    this.trickName = trickName;
    this.value = value;
  }

  public String getTrickName() {
    return trickName;
  }

  public void setTrickName(String trickName) {
    this.trickName = trickName;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }
}
