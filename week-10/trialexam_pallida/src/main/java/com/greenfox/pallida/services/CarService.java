package com.greenfox.pallida.services;
import com.greenfox.pallida.models.Car;
import com.greenfox.pallida.models.CarDTO;

import java.util.List;

public interface CarService {
  boolean inputChecker(String search);
  List<Car> findCarsByLicencePlate(String search);
  List<Car> findCarsByBrand(String brand);
  CarDTO collectData(String brand);
}
