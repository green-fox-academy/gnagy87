package com.greenfox.testproject.models;

public class ResultDTO {

  private String title;
  private String original_language;

  public ResultDTO() {
  }

  public ResultDTO(String title, String original_language) {
    this.title = title;
    this.original_language = original_language;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getOriginal_language() {
    return original_language;
  }

  public void setOriginal_language(String original_language) {
    this.original_language = original_language;
  }
}
