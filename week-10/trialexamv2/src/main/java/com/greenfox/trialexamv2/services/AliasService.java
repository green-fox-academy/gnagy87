package com.greenfox.trialexamv2.services;

import com.greenfox.trialexamv2.models.Alias;

import java.util.Optional;

public interface AliasService {
  Alias findAliasByAlias(String alias);
  void saveAlias(String url, String alias);
}
