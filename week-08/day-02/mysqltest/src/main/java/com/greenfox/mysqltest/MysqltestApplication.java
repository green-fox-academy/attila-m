package com.greenfox.mysqltest;

import com.greenfox.mysqltest.models.Todo;
import com.greenfox.mysqltest.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqltestApplication implements CommandLineRunner {

  @Autowired
  TodoRepository todoRepository;

  public static void main(String[] args) {
    SpringApplication.run(MysqltestApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
  }
}
