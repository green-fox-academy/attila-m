package com.greenfox.foxclub.services;

import com.greenfox.foxclub.models.Fox;
import com.greenfox.foxclub.repositories.FoxRepository;
import com.greenfox.foxclub.repositories.FoxRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoxServiceImpl implements FoxService {

  FoxRepository foxRepository;

  @Autowired
  public FoxServiceImpl(FoxRepositoryImpl foxRepository) {
    this.foxRepository = foxRepository;
  }

  public void login(String foxname) {
    if (foxRepository.findOne(foxname) == null) {
      foxRepository.save(new Fox(foxname));
    }
  }

  public Fox getFox(String foxname) {
   return foxRepository.findOne(foxname);
  }
}
