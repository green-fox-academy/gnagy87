package com.greenfox.trialexamv2.repositories;
import com.greenfox.trialexamv2.models.Alias;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AliasRepository extends CrudRepository<Alias, Long> {
  Optional<Alias> findByAlias(String alias);
  List<Alias> findAll();

  @Override
  Optional<Alias> findById(Long id);

  void deleteById(Long id);
}
