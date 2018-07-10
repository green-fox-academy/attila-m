package com.greenfox.macrotis.macrotisexam.services;

import com.greenfox.macrotis.macrotisexam.models.Attraction;
import com.greenfox.macrotis.macrotisexam.repositories.AttractionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AttractionServiceImpl implements AttractionService {

  @Autowired
  AttractionRepository attractionRepository;

  @Override
  public List<Attraction> getAllAttractions() {
    attractionRepository.findAll();
    return null;
  }
}
