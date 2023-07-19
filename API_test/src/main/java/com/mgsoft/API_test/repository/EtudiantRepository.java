package com.mgsoft.API_test.repository;

import com.mgsoft.API_test.model.Etudiant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository  extends CrudRepository<Etudiant, Long> {
}
