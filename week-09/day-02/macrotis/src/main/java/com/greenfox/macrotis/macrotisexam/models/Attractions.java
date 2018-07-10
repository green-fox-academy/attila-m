package com.greenfox.macrotis.macrotisexam.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Attractions {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String attrName;
  private String city;
  private int price;
  private float longitude;
  private float lattitude;
  private String category;
  private int duration;
  private float reccomendedAge;

  public Attractions() {
  }

  public Attractions(String attrName, String city, int price, float longitude, float lattitude, String category, int duration, float reccomendedAge) {
    this.attrName = attrName;
    this.city = city;
    this.price = price;
    this.longitude = longitude;
    this.lattitude = lattitude;
    this.category = category;
    this.duration = duration;
    this.reccomendedAge = reccomendedAge;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getAttrName() {
    return attrName;
  }

  public void setAttrName(String attrName) {
    this.attrName = attrName;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public float getLongitude() {
    return longitude;
  }

  public void setLongitude(float longitude) {
    this.longitude = longitude;
  }

  public float getLattitude() {
    return lattitude;
  }

  public void setLattitude(float lattitude) {
    this.lattitude = lattitude;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  public float getReccomendedAge() {
    return reccomendedAge;
  }

  public void setReccomendedAge(float reccomendedAge) {
    this.reccomendedAge = reccomendedAge;
  }
}