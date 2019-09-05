package com.todo.todoapp.services;
import com.todo.todoapp.models.Todo;
import com.todo.todoapp.models.User;
import com.todo.todoapp.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService{

  TodoRepository todoRepository;

  @Autowired
  public TodoServiceImpl(TodoRepository todoRepository){
    this.todoRepository = todoRepository;
  }

  @Override
  public void saveTodo(Todo todo) {
    todoRepository.save(todo);
  }

  @Override
  public void deleteTodoById(long id) {
    todoRepository.deleteById(id);
  }

  @Override
  public Todo findTodoById(long id) {
    return todoRepository.findById(id);
  }

  @Override
  public List<Todo> listTodos(String description, User user) {
    return todoRepository.findAllByDescriptionContainsAndUser(description, user);
  }
}
