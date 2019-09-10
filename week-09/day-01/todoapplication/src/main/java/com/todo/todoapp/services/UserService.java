package com.todo.todoapp.services;

import com.todo.todoapp.models.User;

import java.util.List;

public interface UserService {
  void saveUser(User user);
  User findUserByName(String username);
  User findUserById(long id) throws Exception;
  List<User> findAllUser();
  void deleteUser(long id);
  long getLoginId(String username, String password);
}
