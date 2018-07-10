package com.greenfox.macrotis.macrotisexam.services;

import com.greenfox.macrotis.macrotisexam.models.Attractions;
import com.greenfox.macrotis.macrotisexam.repositories.AttractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AttractionServiceImpl implements AttractionService {

  @Autowired
  AttractionRepository attractionRepository;

  @Override
  public List<Attractions> getAllAttractions() {
    return attractionRepository.findAll();
  }

  @Override
  public void addAttraction(Attractions attraction) {
    attractionRepository.save(attraction);
  }
}
