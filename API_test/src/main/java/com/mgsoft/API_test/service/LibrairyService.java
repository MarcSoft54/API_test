package com.mgsoft.API_test.service;

import com.mgsoft.API_test.model.Librairy;
import com.mgsoft.API_test.repository.LibrairyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibrairyService {

    @Autowired
    LibrairyRepository librairyRepository;


    public Iterable<Librairy> getLibrairie(){
        return librairyRepository.findAll();
    }

    public Librairy createLibrairie(Librairy l){
        return librairyRepository.save(l);
    }
}
