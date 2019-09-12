package com.greenfox.pallida.services;
import com.greenfox.pallida.models.Car;
import com.greenfox.pallida.models.CarDTO;
import com.greenfox.pallida.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

  CarRepository carRepository;

  @Autowired
  public CarServiceImpl(CarRepository carRepository) {
    this.carRepository = carRepository;
  }

  @Override
  public boolean inputChecker(String search) {

    if (search.matches("[a-zA-Z0-9+-]*") && search.length() <= 7){
      return true;
    }
    else {
      return false;
    }
  }

  @Override
  public List<Car> findCarsByLicencePlate(String search) {
    return carRepository.findAllByLicencePlateContaining(search);
  }

  @Override
  public List<Car> findCarsByBrand(String brand) {
    return carRepository.findAllByCarBrand(brand);
  }

  @Override
  public CarDTO collectData(String brand) {
    String result = "ok";
    List<Car> data = carRepository.findAllByCarBrand(brand);
    if (data.size() == 0){
      result = "there is no such car";
    }
    CarDTO carDTO = new CarDTO(result,data);
    return carDTO;
  }
}
