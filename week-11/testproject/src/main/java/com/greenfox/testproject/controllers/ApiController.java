package com.greenfox.testproject.controllers;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.google.gson.Gson;
import com.greenfox.testproject.models.MovieDTO;
import com.greenfox.testproject.models.MovieData;
import com.greenfox.testproject.services.ResultService;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

  ResultService resultService;

  @Autowired
  public ApiController(ResultService resultService) {
    this.resultService = resultService;
  }

  @GetMapping("/get")
  public ResponseEntity<MovieData> saveMovies() throws Exception {
    HttpResponse<JsonNode> response = Unirest.get("https://api.themoviedb.org/3/movie/popular?api_key=a25142144b710e88d0a5d2d95e61048d")
            .asJson();

    JSONObject myObj = response.getBody().getObject();

    MovieData movieData = new Gson().fromJson(myObj.toString(),MovieData.class);

    for (int i = 0; i < movieData.getResults().size(); i++) {
      resultService.saveResult(movieData.getResults().get(i));
    }

    return ResponseEntity.status(200).body(movieData);
  }

  @GetMapping("/filter")
  public ResponseEntity filterDatas() throws Exception{
    HttpResponse<JsonNode> response = Unirest.get("https://api.themoviedb.org/3/movie/popular?api_key=a25142144b710e88d0a5d2d95e61048d")
            .asJson();

    JSONObject myObj = response.getBody().getObject();

    MovieData movieData = new Gson().fromJson(myObj.toString(),MovieData.class);

    MovieDTO movieDTO = new MovieDTO(movieData);

    return ResponseEntity.status(200).body(movieDTO);
  }
}