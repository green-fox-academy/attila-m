package com.greenfox.foxclub.repositories;

import com.greenfox.foxclub.models.Fox;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class FoxRepositoryImpl implements FoxRepository {

  private Map<String, Fox> foxes;

  public FoxRepositoryImpl() {
    foxes = new HashMap<>();
  }

  public void save(Fox fox) {
   foxes.put(fox.getName(), fox);
  }

  public Fox findOne(String foxname) {
    return foxes.get(foxname);
  }
}
