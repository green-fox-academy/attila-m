package com.greenfox.postmanning.models;

public class Error implements Returnable {
  private String error;

  public Error() {
  }

  public Error(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}

