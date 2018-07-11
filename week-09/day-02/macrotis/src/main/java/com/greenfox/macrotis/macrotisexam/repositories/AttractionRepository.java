package com.greenfox.macrotis.macrotisexam.repositories;

import com.greenfox.macrotis.macrotisexam.models.Attractions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttractionRepository extends CrudRepository<Attractions, Integer> {

  List<Attractions> findAll();
  List<Attractions> findByCity(String city);
  List<Attractions> findByCategory(String category);
  List<Attractions> findByCityAndCategory(String city, String category);
}
