package com.greenfox.trialexamv2.services;

import com.greenfox.trialexamv2.models.Alias;
import com.greenfox.trialexamv2.models.SecretCode;
import com.greenfox.trialexamv2.repositories.AliasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;
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

  @Override
  public void incrementHitCount(String alias) {
    Alias foundAlias = aliasRepository.findByAlias(alias).get();
    foundAlias.setHitCount(foundAlias.getHitCount() + 1);
    aliasRepository.save(foundAlias);
  }

  @Override
  public List<Alias> findAllAlias() {
    return aliasRepository.findAll();
  }

  @Override
  public Alias finAliasById(Long id) {
    if (aliasRepository.findById(id).isPresent()){
      Alias foundAlias = aliasRepository.findById(id).get();
      return foundAlias;
    }
    else {
      return null;
    }
  }

  @Override
  public void deleteAliasById(Long id) {
    aliasRepository.deleteById(id);
  }

  @Override
  public int secretCodeMatcher(Long id, SecretCode secretCode) {
    int result = 0;

    Alias foundAlias = finAliasById(id);

    if (foundAlias == null) {
      result = 404;
      return result;
    } else {
      if (foundAlias.getSecretCode().equals(secretCode.getSecretCode())) {
        result = 204;
        aliasRepository.deleteById(id);
        return result;
      } else {
        result = 403;
        return result;
      }
    }
  }
}
