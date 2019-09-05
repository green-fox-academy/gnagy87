package com.crimetracker.batgroup.repositories;

import com.crimetracker.batgroup.models.Criminal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CriminalRepository extends CrudRepository<Criminal, Long> {
}
