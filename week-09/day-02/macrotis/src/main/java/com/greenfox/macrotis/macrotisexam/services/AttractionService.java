package com.greenfox.macrotis.macrotisexam.services;

import com.greenfox.macrotis.macrotisexam.models.Attractions;
import com.greenfox.macrotis.macrotisexam.models.Filter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AttractionService {
  List<Attractions> getAllAttractions();
  void addAttraction(Attractions attraction);
  Attractions getAttraction(int id);
  Filter filterAttractions(String city, String category);
}
