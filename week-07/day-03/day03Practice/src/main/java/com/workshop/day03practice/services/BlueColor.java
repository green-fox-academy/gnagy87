package com.workshop.day03practice.services;

import org.springframework.stereotype.Service;

//@Service
public class BlueColor implements MyColor{

  @Override
  public String printColor() {
    return  "This is blue in color...";
  }
}
