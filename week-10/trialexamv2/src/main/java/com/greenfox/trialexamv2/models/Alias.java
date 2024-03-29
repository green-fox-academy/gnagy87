package com.greenfox.trialexamv2.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ALIAS")
public class Alias {

  @Id
  @GeneratedValue
  private Long id;
  private String alias;
  private String url;
  @JsonIgnore
  private String secretCode;
  private int hitCount;

  public Alias(){
  }

  public Alias(String alias, String url) {
    this.alias = alias;
    this.url = url;
    this.secretCode = secretCodeGenerator();
    this.hitCount = 0;
  }

  private String secretCodeGenerator() {
    String secretCode = "";

    for (int i = 0; i < 4; i++) {
      int number = (int)(Math.random()*9);
      secretCode += Integer.toString(number);
    }

    return secretCode;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getSecretCode() {
    return secretCode;
  }

  public void setSecretCode(String secretCode) {
    this.secretCode = secretCode;
  }

  public int getHitCount() {
    return hitCount;
  }

  public void setHitCount(int hitCount) {
    this.hitCount = hitCount;
  }
}
