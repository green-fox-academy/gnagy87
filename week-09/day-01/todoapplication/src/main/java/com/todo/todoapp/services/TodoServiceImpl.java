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
  UserService userService;

  @Autowired
  public TodoServiceImpl(TodoRepository todoRepository, UserService userService){
    this.todoRepository = todoRepository;
    this.userService = userService;
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

  @Override
  public List<Todo> getTodosBySearch(String searchString, long idOfUser) {
    if (searchString != null){
      return listTodos(searchString, userService.findUserById(idOfUser));
    }
    else {
      return userService.findUserById(idOfUser).getTodoList();
    }
  }
}
