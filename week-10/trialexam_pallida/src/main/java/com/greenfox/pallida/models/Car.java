package com.greenfox.pallida.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CARS")
public class Car {

  @Id
  @GeneratedValue
  @JsonIgnore
  private Long id;
  private String licencePlate;
  private String carBrand;
  private String carModel;
  private int year;
  private String color;

  public Car() {
  }

  public Car(String licencePlate, String carBrand, String carModel, int year, String color) {
    this.licencePlate = licencePlate;
    this.carBrand = carBrand;
    this.carModel = carModel;
    this.year = year;
    this.color = color;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCarBrand() {
    return carBrand;
  }

  public void setCarBrand(String carBrand) {
    this.carBrand = carBrand;
  }

  public String getCarModel() {
    return carModel;
  }

  public void setCarModel(String carModel) {
    this.carModel = carModel;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getLicencePlate() {
    return licencePlate;
  }

  public void setLicencePlate(String licencePlate) {
    this.licencePlate = licencePlate;
  }
}
