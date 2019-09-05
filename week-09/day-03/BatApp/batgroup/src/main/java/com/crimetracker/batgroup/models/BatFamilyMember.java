package com.crimetracker.batgroup.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Family")
public class BatFamilyMember {

  @Id
  @GeneratedValue
  private long id;
  private String heroName;
  private String name;
  private String password;

  @OneToMany(mappedBy = "member")
  List<Criminal> criminalList;

  public BatFamilyMember(){
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public BatFamilyMember(String name, String password) {
    this.name = name;
    this.password = password;
  }

  public BatFamilyMember(String heroName, String name, String password) {
    this.heroName = heroName;
    this.name = name;
    this.password = password;
  }

  public String getHeroName() {
    return heroName;
  }

  public void setHeroName(String heroName) {
    this.heroName = heroName;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public List<Criminal> getCriminalList() {
    return criminalList;
  }

  public void setCriminalList(List<Criminal> criminalList) {
    this.criminalList = criminalList;
  }
}
