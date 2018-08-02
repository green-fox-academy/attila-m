package com.greenfox.tokentesting.controllers;

import com.greenfox.tokentesting.models.Movie;
import com.greenfox.tokentesting.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("movies")
public class MovieController {

  MovieService movieService;

  @Autowired
  public MovieController(MovieService movieService) {
    this.movieService = movieService;
  }

  @GetMapping("/list")
  public List<Movie> getAllMovies() {
    return movieService.getAllMovies();
  }

  @PostMapping("/add")
  public String saveMovie(Movie movie) {
    movieService.saveMovie(movie);
    return "Movie Saved";
  }
}
