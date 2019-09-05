package com.crimetracker.batgroup.services;

import com.crimetracker.batgroup.models.BatFamilyMember;
import com.crimetracker.batgroup.repositories.BatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BatServiceImpl implements BatService {
  BatRepository batRepository;

  @Autowired
  public BatServiceImpl(BatRepository batRepository) {
    this.batRepository = batRepository;
  }

  @Override
  public void saveBatMember(String memberName, String password) {
      BatFamilyMember batFamilyMember = new BatFamilyMember(memberName, password);
      batRepository.save(batFamilyMember);
  }

  @Override
  public BatFamilyMember findMemberByName(String memberName) {
    return batRepository.findByHeroName(memberName);
  }

  @Override
  public BatFamilyMember findMemberById(long id) {
    return batRepository.findById(id);
  }


}
