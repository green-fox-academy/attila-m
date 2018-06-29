package com.greenfox.foxclub.services;

import com.greenfox.foxclub.models.Trick;

import java.util.List;

public interface TrickService {

  void trickAdder(String name, int value);
List<Trick> getTrickList();
}


