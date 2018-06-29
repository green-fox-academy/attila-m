package com.greenfox.foxclub.repositories;

import com.greenfox.foxclub.models.Fox;

public interface FoxRepository {

  void save(Fox fox);
  Fox findOne(String foxname);
}
