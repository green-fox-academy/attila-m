package com.greenfox.macrotis.macrotisexam.services;

import com.greenfox.macrotis.macrotisexam.models.Attractions;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AttractionService {
  List<Attractions> getAllAttractions();
  void addAttraction(Attractions attraction);
}
