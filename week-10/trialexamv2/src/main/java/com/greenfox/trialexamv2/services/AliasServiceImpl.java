package com.greenfox.trialexamv2.services;

import com.greenfox.trialexamv2.models.Alias;
import com.greenfox.trialexamv2.repositories.AliasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.Optional;

@Service
public class AliasServiceImpl implements AliasService {

  AliasRepository aliasRepository;

  @Autowired
  public AliasServiceImpl(AliasRepository aliasRepository) {
    this.aliasRepository = aliasRepository;
  }

  @Override
  public Alias findAliasByAlias(String alias) {
    if(aliasRepository.findByAlias(alias).isPresent()){
      Alias existingAlias = aliasRepository.findByAlias(alias).get();
      return existingAlias;
    }
    else {
      return null;
    }
  }

  @Override
  public void saveAlias(String url, String alias) {
    Alias newAlias = new Alias(alias, url);
    aliasRepository.save(newAlias);
  }
}
