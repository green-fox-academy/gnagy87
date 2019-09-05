package com.crimetracker.batgroup.services;

import com.crimetracker.batgroup.repositories.CriminalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CriminalServiceImpl implements CriminalService {

  CriminalRepository criminalRepository;

  @Autowired
  public CriminalServiceImpl(CriminalRepository criminalRepository) {
    this.criminalRepository = criminalRepository;
  }
}
