package com.greenfox.foxclub.services;

import com.greenfox.foxclub.models.Fox;

public interface FoxService {

  void login(String foxname);
  Fox getFox(String foxname);

}
