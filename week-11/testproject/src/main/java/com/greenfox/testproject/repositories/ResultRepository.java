package com.greenfox.testproject.repositories;
import com.greenfox.testproject.models.Result;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface ResultRepository extends CrudRepository<Result, Long> {
  List<Result> findAll();
}
