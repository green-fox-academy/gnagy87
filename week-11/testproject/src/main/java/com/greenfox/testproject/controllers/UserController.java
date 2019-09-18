package com.greenfox.testproject.controllers;
import com.greenfox.testproject.services.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

  ResultService resultService;

  @Autowired
  public UserController(ResultService resultService) {
    this.resultService = resultService;
  }


}
