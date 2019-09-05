package com.todo.todoapp.repositories;
import com.todo.todoapp.models.Todo;
import com.todo.todoapp.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
  User findByUsername(String username);
  User findById(long id);
  List<User> findAll();
  void deleteById(long id);
}
