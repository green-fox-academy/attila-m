package com.greenfox.foxclub.services;

import com.greenfox.foxclub.models.Trick;
import com.greenfox.foxclub.repositories.TrickRepository;
import com.greenfox.foxclub.repositories.TrickRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrickServiceImpl implements TrickService {

  TrickRepository trickRepository;

  @Autowired
  public TrickServiceImpl(TrickRepositoryImpl trickRepository) {
    this.trickRepository = trickRepository;
    addDefaultTricks();
  }

  public List<Trick> getTrickList() {
    return trickRepository.getTrickList();
  }

  public void trickAdder(String name, int value) {
    trickRepository.addTrick(new Trick(name, value));
  }

  public void addDefaultTricks() {
    trickAdder("code in Java", 150);
    trickAdder("code in Html", 100);
    trickAdder("code in Php", 0);
    trickAdder("make coffee", 20);
    trickAdder("networking", 500);
    trickAdder("make jokes", 80);
  }
}


