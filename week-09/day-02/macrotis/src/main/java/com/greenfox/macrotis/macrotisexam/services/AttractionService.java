package com.greenfox.macrotis.macrotisexam.services;

import com.greenfox.macrotis.macrotisexam.models.Attraction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AttractionService {

  List<Attraction> getAllAttractions();

}
