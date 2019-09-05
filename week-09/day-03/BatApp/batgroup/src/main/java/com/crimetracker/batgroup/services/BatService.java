package com.crimetracker.batgroup.services;

import com.crimetracker.batgroup.models.BatFamilyMember;

public interface BatService {

  void saveBatMember(String memberName, String password);
  BatFamilyMember findMemberByName(String memberName);
  BatFamilyMember findMemberById(long id);
}
