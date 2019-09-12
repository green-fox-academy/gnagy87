package com.greenfox.pallida.controllers;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.greenfox.pallida.models.CarDTO;
import com.greenfox.pallida.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

  CarService carService;

  @Autowired
  public DataController(CarService carService) {
    this.carService = carService;
  }

  @GetMapping("/api/search/{brand}")
  public ResponseEntity listAllCar(@PathVariable("brand") String brand){
    CarDTO carDTO = carService.collectData(brand);

    return ResponseEntity.status(200).body(carDTO);
  }
}
