package com.mgsoft.API_test.controller;

import com.mgsoft.API_test.model.Etudiant;
import com.mgsoft.API_test.service.EtudiantService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
@Data
public class EtudiantController {

    @Autowired
    EtudiantService etudiantService;

    @GetMapping("/etudiant")
    public Iterable<Etudiant> getEtudiant(){
        return etudiantService.getEtudiants();
    }

    @PostMapping("/createEtudiant")
    public Etudiant createEtudiant(Etudiant e){
        return etudiantService.saveEtudiant(e);
    }

}
