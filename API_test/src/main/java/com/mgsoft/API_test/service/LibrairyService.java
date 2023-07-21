package com.mgsoft.API_test.service;

import com.mgsoft.API_test.model.Librairy;
import com.mgsoft.API_test.repository.LibrairyRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data
public class LibrairyService {

    LibrairyRepository librairyRepository;


    public Iterable<Librairy> getLibrairie(){
        return librairyRepository.findAll();
    }

    public Librairy createLibrairie(Librairy l){
        return librairyRepository.save(l);
    }
}
