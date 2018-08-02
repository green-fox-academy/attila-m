package com.greenfox.tokentesting.services;

import com.greenfox.tokentesting.models.Movie;
import com.greenfox.tokentesting.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

  @Autowired
  MovieRepository movieRepository;

  @Override
  public List<Movie> getAllMovies() {
    return movieRepository.findAll();
  }

  @Override
  public void saveMovie(Movie movie) {
    movieRepository.save(movie);
  }
}
