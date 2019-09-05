package com.todo.todoapp.controllers;
import com.todo.todoapp.models.Todo;
import com.todo.todoapp.models.User;
import com.todo.todoapp.services.TodoService;
import com.todo.todoapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Null;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  UserService userService;
  TodoService todoService;

  @Autowired
  public TodoController(UserService userService, TodoService todoService) {
    this.userService = userService;
    this.todoService = todoService;
  }

  @GetMapping("/login")
  public String getLoginPage(){
    return "login";
  }

  @PostMapping("/login")
  public String postLoginPage(@RequestParam(name = "username", required = false) String username,
                              @RequestParam(name = "password", required = false) String password){
    if (username.length() != 0 && password.length() != 0){
      User user = userService.findUserByName(username);
      if (user.getPassword().equals(password)){

        return "redirect:/todo/main?id=" + user.getId();
      }
      else {
        return "redirect:/todo/login";
      }
    }
    else{
      return "redirect:/todo/login";
    }
  }

  @GetMapping("/signup")
  public String getSignupPage(){
    return "signup";
  }

  @PostMapping("/signup")
  public String postSignupPage(@RequestParam(name = "username", required = false) String username,
                               @RequestParam(name = "password", required = false) String password){
    if (username.length() == 0 || password.length() == 0){
      return "signup";
    }
    else {
      User user = new User(username, password);
      userService.saveUser(user);
      return "redirect:/todo/login";
    }
  }

  @RequestMapping("/main")
  public String getMainPage(Model model, @RequestParam(value = "id") String id,
                            @RequestParam(value = "search", required = false) String search){
    long idOfUser = Long.parseLong(id);
    if (search != null){
      model.addAttribute("user", userService.findUserById(idOfUser));
      model.addAttribute("ListOfTodos", todoService.listTodos(search, userService.findUserById(idOfUser)));
    }
    else {
      model.addAttribute("user", userService.findUserById(idOfUser));
      model.addAttribute("ListOfTodos",userService.findUserById(idOfUser).getTodoList());
    }
    return "main";
  }

  @GetMapping("/add/{id}")
  public String getAddPage(Model model, @PathVariable("id") long id){

    model.addAttribute("id",id);
    return "add";
  }

  @PostMapping("/add/{id}")
  public String postAddPage(@PathVariable ("id") long id, @RequestParam(value = "description") String description){
    Todo todo = new Todo(description);
    todo.setUser(userService.findUserById(id));
    todoService.saveTodo(todo);
//    User user = userService.findUserById(id);
//    user.addTodo(todo);
//    userService.saveUser(user);

    return "redirect:/todo/main?id=" + id;
  }

  @GetMapping("/delete/{todoId}/{userId}")
  public String deletePost(@PathVariable("todoId") long todoId, @PathVariable("userId") String userId){
    todoService.deleteTodoById(todoId);
    return "redirect:/todo/main?id=" + userId;
  }

  @GetMapping("/edit/{todoId}/{userId}")
  public String getEditPage(Model model, @PathVariable("todoId") long todoId, @PathVariable("userId") long userId){
    model.addAttribute("todo", todoService.findTodoById(todoId));
    model.addAttribute("user", userService.findUserById(userId));
    return "edit";
  }

  @PostMapping("/edit/{todoId}/{userId}")
  public String editPost(@RequestParam (value = "editTodo", required = false) String editTodo,
                         @RequestParam(value = "isDone", required = false) boolean isDone,
                         @RequestParam(value = "isUrgent", required = false) boolean isUrgent,
                         @PathVariable("todoId") long todoId, @PathVariable("userId") long userId){
    if (editTodo.equals("")){
      Todo todo = todoService.findTodoById(todoId);
      todo.setDone(isDone);
      todo.setUrgent(isUrgent);
      todoService.saveTodo(todo);
    }
    else {
      Todo todo = todoService.findTodoById(todoId);
      todo.setDescription(editTodo);
      todo.setDone(isDone);
      todo.setUrgent(isUrgent);
      todoService.saveTodo(todo);
    }
    return "redirect:/todo/main?id=" + userId;
  }

  @GetMapping("/main/{userId}")
  public String backToMain(@PathVariable("userId") long userId){
    return "redirect:/todo/main?id=" + userId;
  }

  @PostMapping("/search/{userId}")
  public String searchByDescription(@PathVariable("userId") long userId, @RequestParam(value = "search", required = false) String search){
    return "redirect:/todo/main?id=" + userId + "&search=" + search;
  }

  @GetMapping("/users")
    public String getUsersPage(Model model) {
    model.addAttribute("ListOfUsers", userService.findAllUser());
    return "users";
  }

  @GetMapping("/users/delete/{userId}")
  public String deleteUser(@PathVariable ("userId") long userId) {
    userService.deleteUser(userId);
    return "redirect:/todo/users";
  }

  @GetMapping("/users/edit/{userId}")
  public String getEditUserPage(Model model, @PathVariable("userId") long userId) {
    model.addAttribute("user",userService.findUserById(userId));
    return "editUser";
  }

  @PostMapping("/users/edit/{userId}")
  public String editUser(@PathVariable("userId") long userId, @RequestParam(value = "name") String name) {
    User user = userService.findUserById(userId);
    user.setUsername(name);
    userService.saveUser(user);
    return "redirect:/todo/users";
  }

  @PostMapping("/name")
  public String searchUser(@RequestParam(value = "searchForName", required = false)String searchForName) {
    User user = userService.findUserByName(searchForName);
    return "redirect:/todo/main?id=" + user.getId();
  }
}
