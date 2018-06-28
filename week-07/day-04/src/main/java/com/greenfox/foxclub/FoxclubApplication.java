package com.greenfox.foxclub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoxclubApplication {

  public static void main(String[] args) {
    SpringApplication.run(FoxclubApplication.class, args);
    System.out.println("FoxClub App running...");
  }
}
