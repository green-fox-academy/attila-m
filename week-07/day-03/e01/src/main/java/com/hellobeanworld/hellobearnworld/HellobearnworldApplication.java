package com.hellobeanworld.hellobearnworld;

import com.hellobeanworld.hellobearnworld.service.MyColor;
import com.hellobeanworld.hellobearnworld.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellobearnworldApplication implements CommandLineRunner {
  @Autowired
  Printer printer;

  @Autowired
  MyColor myColor;

  public static void main(String[] args) {
    SpringApplication.run(HellobearnworldApplication.class, args);
  }

  @Override
  public void run(String...args) throws Exception {
    printer.log("Hello!");
    myColor.printColor();
  }
}
