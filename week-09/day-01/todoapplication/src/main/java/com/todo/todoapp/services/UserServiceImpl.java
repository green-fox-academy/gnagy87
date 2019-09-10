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
  public User findUserById(long id) throws Exception {
    User result = userRepository.findById(id);
    if(result == null){
      throw(new Exception("No such user was found!"));
    }
    return result;
  }

  @Override
  public List<User> findAllUser() {
    return userRepository.findAll();
  }

  @Override
  public void deleteUser(long id) {
    userRepository.deleteById(id);
  }

  @Override
  public long getLoginId(String username, String password) {
    if (username.length() != 0 && password.length() != 0){
      User user = findUserByName(username);
      if (user.getPassword().equals(password)){

        return user.getId();
      }
      else {
        return -1;
      }
    }
    else{
      return -1;
    }
  }
}
