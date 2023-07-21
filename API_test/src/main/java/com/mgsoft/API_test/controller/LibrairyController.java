package com.mgsoft.API_test.controller;

import com.mgsoft.API_test.model.Librairy;
import com.mgsoft.API_test.service.LibrairyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
@RequiredArgsConstructor
public class LibrairyController {

   private LibrairyService librairyService;

    @GetMapping("/getlibrairie")
    public Iterable<Librairy> getLibrairy(){
        return librairyService.getLibrairie();
    }

    @PostMapping("/createLibrairie")
    public Librairy createLibrairy(Librairy l){
        return librairyService.createLibrairie(l);
    }

}
