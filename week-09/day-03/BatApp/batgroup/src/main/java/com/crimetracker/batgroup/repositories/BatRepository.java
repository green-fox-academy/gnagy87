package com.crimetracker.batgroup.repositories;
import com.crimetracker.batgroup.models.BatFamilyMember;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatRepository extends CrudRepository<BatFamilyMember, Long> {
  BatFamilyMember findByHeroName(String memberName);
  BatFamilyMember findById(long id);
}
