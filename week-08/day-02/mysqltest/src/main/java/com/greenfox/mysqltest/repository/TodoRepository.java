package com.greenfox.mysqltest.repository;

import com.greenfox.mysqltest.models.Todo;
import com.greenfox.mysqltest.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
