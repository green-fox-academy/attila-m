package com.greenfox.macrotis.macrotisexam.repositories;

import com.greenfox.macrotis.macrotisexam.models.Attraction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttractionRepository extends CrudRepository<Attraction, Long> {

}
