package com.greenfox.foxclub.services;

import com.greenfox.foxclub.models.Trick;
import com.greenfox.foxclub.repositories.TrickRepository;
import com.greenfox.foxclub.repositories.TrickRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrickServiceImpl implements TrickService {

  TrickRepository trickRepository;

  @Autowired
  public TrickServiceImpl(TrickRepositoryImpl trickRepository) {
    this.trickRepository = trickRepository;

  }

  public void trickAdder(String name, int value) {

    trickRepository.addTrick(new Trick(name, value));
  }
}


