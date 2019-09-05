package com.todo.todoapp.services;
import com.todo.todoapp.models.Todo;
import com.todo.todoapp.models.User;

import java.util.List;

public interface TodoService {
  void saveTodo(Todo todo);
  void deleteTodoById(long id);
  Todo findTodoById(long id);
  List<Todo> listTodos(String description, User user);
}
