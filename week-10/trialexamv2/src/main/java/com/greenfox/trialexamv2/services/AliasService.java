package com.greenfox.trialexamv2.services;
import com.greenfox.trialexamv2.models.Alias;
import com.greenfox.trialexamv2.models.SecretCode;
import java.util.List;

public interface AliasService {
  Alias findAliasByAlias(String alias);
  void saveAlias(String url, String alias);
  void incrementHitCount(String alias);
  List<Alias> findAllAlias();
  Alias finAliasById(Long id);
  void deleteAliasById(Long id);
  int secretCodeMatcher(Long id, SecretCode secretCode);
}
