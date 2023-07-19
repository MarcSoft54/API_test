package com.mgsoft.API_test;

import com.mgsoft.API_test.model.Etudiant;
import com.mgsoft.API_test.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiTestApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApiTestApplication.class, args);
	}

	@Autowired
	EtudiantService etudiantService;

	@Override
	public void run(String... args) throws Exception {
		Etudiant e = new Etudiant();

		e.setId(1);
		e.setNom("william");

		etudiantService.saveEtudiant(e);
	}
}
