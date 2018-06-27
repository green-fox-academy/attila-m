package com.hellobeanworld.hellobearnworld.colors;

import com.hellobeanworld.hellobearnworld.service.MyColor;
import org.springframework.stereotype.Service;

public class RedColor implements MyColor {
    @Override
  public void printColor() {
      System.out.println("It is red in color...");
  }
}
