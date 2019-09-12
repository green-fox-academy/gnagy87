package com.greenfox.pallida.controllers;
import com.greenfox.pallida.models.Car;
import com.greenfox.pallida.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

  CarService carService;

  @Autowired
  public UserController(CarService carService) {
    this.carService = carService;
  }

  @GetMapping("/")
  public String renderIndexPage(){
    return "index";
  }

  @GetMapping("/search")
  public String searchForLicencePlate(Model model, @RequestParam (value = "search", required = false)String search){
    boolean isFailure = carService.inputChecker(search);
    List<Car> foundedCars = carService.findCarsByLicencePlate(search);

    model.addAttribute("failure",isFailure);
    model.addAttribute("foundedCars", foundedCars);

    return "index";
  }

  @GetMapping("/police-cars")
  public String onlyPoliceCars(){
    return "redirect:/search?search=rb";
  }

  @GetMapping("/diplomat-cars")
  public String onlyDiplomatCars(){
    return "redirect:/search?search=dt";
  }

  @GetMapping("/search/{brand}")
  public String filterBrands(Model model, @PathVariable("brand") String brand){
    List<Car> filterByBrands = carService.findCarsByBrand(brand);
    model.addAttribute("foundedCars", filterByBrands);
    model.addAttribute("failure",true);
    return "index";
  }
}
