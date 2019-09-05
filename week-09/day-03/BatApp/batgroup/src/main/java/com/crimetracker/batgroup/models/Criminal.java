package com.crimetracker.batgroup.models;

import javax.persistence.*;

@Entity
@Table(name = "Criminals")
public class Criminal {

  @Id
  @GeneratedValue
  private long id;
  private String name;
  private String crime;
  private boolean prius;

  @ManyToOne
  BatFamilyMember member;

  public Criminal(){
  }

  public Criminal(String name, String crime, boolean prius) {
    this.name = name;
    this.crime = crime;
    this.prius = prius;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCrime() {
    return crime;
  }

  public void setCrime(String crime) {
    this.crime = crime;
  }

  public boolean isPrius() {
    return prius;
  }

  public void setPrius(boolean prius) {
    this.prius = prius;
  }

  public BatFamilyMember getMember() {
    return member;
  }

  public void setMember(BatFamilyMember member) {
    this.member = member;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }
}
