package com.greenfox.tododatabase;

import com.greenfox.tododatabase.models.Todo;
import com.greenfox.tododatabase.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TododatabaseApplication implements CommandLineRunner {

  @Autowired
  TodoRepository todoRepository;

  public static void main(String[] args) {
    SpringApplication.run(TododatabaseApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
    todoRepository.save(new Todo("I have to learn about MySQL"));
    todoRepository.save(new Todo("I have to learn Python"));
    todoRepository.save(new Todo("I have to drink 9999 beers"));
  }
}
