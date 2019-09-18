package com.greenfox.testproject.models;

import java.util.ArrayList;
import java.util.List;

public class MovieDTO {

  private int page;
  private int total_results;
  List<ResultDTO> result;

  public MovieDTO() {
  }

  public MovieDTO(MovieData movieData) {
    this.page = movieData.getPage();
    this.total_results = movieData.getTotal_results();
    this.result = resultDTOS(movieData);
  }

  public List<ResultDTO> resultDTOS(MovieData movieData){
    List<ResultDTO> result = new ArrayList<>();
    for (int i = 0; i < movieData.getResults().size(); i++) {
      String title = movieData.getResults().get(i).getTitle();
      String original_language = movieData.getResults().get(i).getOriginal_language();
      ResultDTO resultDTO = new ResultDTO(title, original_language);
      result.add(resultDTO);
    }
    return result;
  }

  public int getPage() {
    return page;
  }

  public void setPage(int page) {
    this.page = page;
  }

  public int getTotal_results() {
    return total_results;
  }

  public void setTotal_results(int total_results) {
    this.total_results = total_results;
  }

  public List<ResultDTO> getResult() {
    return result;
  }

  public void setResult(List<ResultDTO> result) {
    this.result = result;
  }
}
