package com.greenfox.macrotis.macrotisexam.services;

import com.greenfox.macrotis.macrotisexam.models.Attractions;
import com.greenfox.macrotis.macrotisexam.models.Filter;
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

  @Override
  public Attractions getAttraction(int id) {
    return attractionRepository.findById(id).get();
  }

  @Override
  public Filter filterAttractions(String city, String category) {
    List<Attractions> attractionsList;
    if(category != null && city != null) {
      attractionsList = attractionRepository.findByCityAndCategory(city, category);
      return new Filter("ok", attractionsList.size(), attractionsList);
    } else if (category != null) {
      attractionsList = attractionRepository.findByCategory(category);
      return new Filter("ok", attractionsList.size(), attractionsList);
    } else if (city != null) {
      attractionsList = attractionRepository.findByCity(city);
      return new Filter("ok", attractionsList.size(), attractionsList);
    } else {
      attractionsList = attractionRepository.findAll();
      return new Filter("full list", attractionsList.size(), attractionsList);
    }
  }
}
