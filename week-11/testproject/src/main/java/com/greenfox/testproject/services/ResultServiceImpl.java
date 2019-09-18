package com.greenfox.testproject.services;

import com.greenfox.testproject.models.Result;
import com.greenfox.testproject.repositories.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultServiceImpl implements ResultService {

  ResultRepository resultRepository;

  @Autowired
  public ResultServiceImpl(ResultRepository resultRepository) {
    this.resultRepository = resultRepository;
  }

  @Override
  public void saveResult(Result result) {
    resultRepository.save(result);
  }

  @Override
  public List<Result> findAllResult() {
    return resultRepository.findAll();
  }
}
