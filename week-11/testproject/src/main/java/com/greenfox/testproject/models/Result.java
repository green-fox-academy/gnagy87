package com.greenfox.testproject.models;
import javax.persistence.*;

@Entity
@Table(name = "results")
public class Result {

  @Id
  @GeneratedValue
  private Long movieId;
  private boolean isAdult;
  @Lob
  private String overview;
  private String release_date;
  private int[] genre_ids;
  private int id;
  private String original_title;
  private String original_language;
  private String title;
  private int vote_count;
  private boolean isVideo;

  public Result() {
  }

  public Result(boolean isAdult, String overview, String release_date, int[] genre_ids, int id, String original_title, String original_language, String title, int vote_count, boolean isVideo) {
    this.isAdult = isAdult;
    this.overview = overview;
    this.release_date = release_date;
    this.genre_ids = genre_ids;
    this.id = id;
    this.original_title = original_title;
    this.original_language = original_language;
    this.title = title;
    this.vote_count = vote_count;
    this.isVideo = isVideo;
  }

  public boolean isAdult() {
    return isAdult;
  }

  public void setAdult(boolean adult) {
    isAdult = adult;
  }

  public String getOverview() {
    return overview;
  }

  public void setOverview(String overview) {
    this.overview = overview;
  }

  public String getRelease_date() {
    return release_date;
  }

  public void setRelease_date(String release_date) {
    this.release_date = release_date;
  }

  public int[] getGenre_ids() {
    return genre_ids;
  }

  public void setGenre_ids(int[] genre_ids) {
    this.genre_ids = genre_ids;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getOriginal_title() {
    return original_title;
  }

  public void setOriginal_title(String original_title) {
    this.original_title = original_title;
  }

  public String getOriginal_language() {
    return original_language;
  }

  public void setOriginal_language(String original_language) {
    this.original_language = original_language;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getVote_count() {
    return vote_count;
  }

  public void setVote_count(int vote_count) {
    this.vote_count = vote_count;
  }

  public boolean isVideo() {
    return isVideo;
  }

  public void setVideo(boolean video) {
    isVideo = video;
  }
}
