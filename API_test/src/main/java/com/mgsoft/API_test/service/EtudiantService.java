package com.mgsoft.API_test.service;

import com.mgsoft.API_test.model.Etudiant;
import com.mgsoft.API_test.repository.EtudiantRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data
public class EtudiantService {

    EtudiantRepository etudiantRepository;

    public Iterable<Etudiant> getEtudiants(){
        return  etudiantRepository.findAll();
    }

    public Etudiant saveEtudiant(Etudiant etudiant){
        Etudiant saveEtudiants;
        saveEtudiants = etudiantRepository.save(etudiant);
        return saveEtudiants;
    }
}
