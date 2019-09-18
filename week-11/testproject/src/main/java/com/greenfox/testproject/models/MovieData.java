package com.greenfox.testproject.models;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

public class MovieData {

  private int page;
  private List<Result> results;
  private int total_results;
  private int total_pages;

  public MovieData() {
  }

  public MovieData(int page, List<Result> results, int total_results, int total_pages) {
    this.page = page;
    this.results = results;
    this.total_results = total_results;
    this.total_pages = total_pages;
  }

  public int getPage() {
    return page;
  }

  public void setPage(int page) {
    this.page = page;
  }

  public List<Result> getResults() {
    return results;
  }

  public void setResults(List<Result> results) {
    this.results = results;
  }

  public int getTotal_results() {
    return total_results;
  }

  public void setTotal_results(int total_results) {
    this.total_results = total_results;
  }

  public int getTotal_pages() {
    return total_pages;
  }

  public void setTotal_pages(int total_pages) {
    this.total_pages = total_pages;
  }
}


