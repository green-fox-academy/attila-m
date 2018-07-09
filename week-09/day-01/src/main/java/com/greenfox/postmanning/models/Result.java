package com.greenfox.postmanning.models;

public class Result implements Returnable{

  private Integer result;

  public Result() {
  }

  public Result(Integer result) {
    this.result = result;
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }
}
