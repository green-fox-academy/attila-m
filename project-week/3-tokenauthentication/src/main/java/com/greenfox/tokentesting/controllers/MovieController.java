package com.greenfox.tokentesting.controllers;

import com.greenfox.tokentesting.models.Movie;
import com.greenfox.tokentesting.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

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

  @GetMapping("/admin")
  @PreAuthorize("hasanyrole('ADMIN')")
  public ResponseEntity<?> isAdmin() {
    return new ResponseEntity<>("You have admin rights", HttpStatus.OK);
  }

  @PostMapping("/add")
  public String saveMovie(@RequestBody Movie movie) {
    movieService.saveMovie(movie);
    return "Movie Saved";
  }
}
