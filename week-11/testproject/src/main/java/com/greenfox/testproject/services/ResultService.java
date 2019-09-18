package com.greenfox.testproject.services;

import com.greenfox.testproject.models.Result;
import java.util.List;

public interface ResultService {
  void saveResult(Result result);
  List<Result> findAllResult();
}
