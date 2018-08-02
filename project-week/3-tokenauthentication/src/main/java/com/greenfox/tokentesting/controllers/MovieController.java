package com.greenfox.tokentesting.controllers;

import com.greenfox.tokentesting.models.Movie;
import com.greenfox.tokentesting.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
  public ResponseEntity<?> getAllMovies() {
    return ResponseEntity.status(HttpStatus.OK).body(movieService.getAllMovies());
  }

  @GetMapping("/list")
  public List<Movie> getAllMovies() {
    return movieService.getAllMovies();
  }

  @PostMapping("/add")
  public String saveMovie(@RequestBody Movie movie) {
    movieService.saveMovie(movie);
    return "Movie Saved";
  }
}
