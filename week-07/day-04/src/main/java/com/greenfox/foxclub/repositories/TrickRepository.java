package com.greenfox.foxclub.repositories;

import com.greenfox.foxclub.models.Trick;

import java.util.List;

public interface TrickRepository {
  void addTrick(Trick trick);
  List<Trick> getTrickList();
}
