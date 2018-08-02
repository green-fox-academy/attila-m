package com.greenfox.tokentesting.repositories;

import com.greenfox.tokentesting.models.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {

  List<Movie> findAll();
}
