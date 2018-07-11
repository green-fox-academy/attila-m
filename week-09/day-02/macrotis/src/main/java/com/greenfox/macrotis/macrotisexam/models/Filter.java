package com.greenfox.macrotis.macrotisexam.models;

import java.util.List;

public class Filter {

  private String result;
  private int count;
  private List<Attractions> attractions;

  public Filter() {
  }

  public Filter(String result, int count, List<Attractions> attractions) {
    this.result = result;
    this.count = count;
    this.attractions = attractions;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public List<Attractions> getAttractions() {
    return attractions;
  }

  public void setAttractions(List<Attractions> attractions) {
    this.attractions = attractions;
  }
}
