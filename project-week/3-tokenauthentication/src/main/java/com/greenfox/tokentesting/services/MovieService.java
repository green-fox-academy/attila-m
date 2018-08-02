package com.greenfox.tokentesting.services;

import com.greenfox.tokentesting.models.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MovieService {

  List<Movie> getAllMovies();
  void saveMovie(Movie movie);
}
