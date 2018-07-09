package com.greenfox.postmanning.models;

public class Number implements Returnable {
  private int received;
  private int result;

  public Number() {
  }

  public Number(int received) {
    this.received = received;
    this.result = received * 2;
  }

  public Number(int received, int result, String errorMessage) {
    this.received = received;
    this.result = result;
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
