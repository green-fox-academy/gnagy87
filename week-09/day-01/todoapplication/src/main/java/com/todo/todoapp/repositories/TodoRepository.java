package com.todo.todoapp.repositories;
import com.todo.todoapp.models.Todo;
import com.todo.todoapp.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
  Todo findById(long id);
  List<Todo> findAllByDescriptionContainsAndUser(String description, User user);
}
