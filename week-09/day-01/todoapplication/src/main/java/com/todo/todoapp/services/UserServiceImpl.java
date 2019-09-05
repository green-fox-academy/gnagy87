package com.todo.todoapp.services;

import com.todo.todoapp.models.User;
import com.todo.todoapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

  UserRepository userRepository;

  @Autowired
  public UserServiceImpl(UserRepository userRepository){
    this.userRepository = userRepository;
  }


  @Override
  public void saveUser(User user) {
    userRepository.save(user);
  }

  @Override
  public User findUserByName(String username) {
    return userRepository.findByUsername(username);
  }

  @Override
  public User findUserById(long id) {
    return userRepository.findById(id);
  }

  @Override
  public List<User> findAllUser() {
    return userRepository.findAll();
  }

  @Override
  public void deleteUser(long id) {
    userRepository.deleteById(id);
  }
}
