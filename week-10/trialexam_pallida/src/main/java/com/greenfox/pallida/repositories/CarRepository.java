package com.greenfox.pallida.repositories;
import com.greenfox.pallida.models.Car;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long> {
  List<Car> findAllByLicencePlateContaining(String search);
  List<Car> findAllByCarBrand(String brand);
}
