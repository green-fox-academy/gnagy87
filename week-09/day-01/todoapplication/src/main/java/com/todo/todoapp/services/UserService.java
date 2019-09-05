package com.todo.todoapp.services;

import com.todo.todoapp.models.User;

import java.util.List;

public interface UserService {
  void saveUser(User user);
  User findUserByName(String username);
  User findUserById(long id);
  List<User> findAllUser();
  void deleteUser(long id);
}
