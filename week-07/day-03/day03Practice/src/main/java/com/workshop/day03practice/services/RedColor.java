package com.workshop.day03practice.services;
import org.springframework.stereotype.Service;

@Service
public class RedColor implements MyColor {

  @Override
  public String printColor() {
    return "This is red in color...";
  }
}
