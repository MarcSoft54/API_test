package com.mgsoft.API_test;

import com.mgsoft.API_test.model.Address;
import com.mgsoft.API_test.model.Etudiant;
import com.mgsoft.API_test.model.Librairy;
import com.mgsoft.API_test.service.AddressService;
import com.mgsoft.API_test.service.EtudiantService;
import com.mgsoft.API_test.service.LibrairyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.sql.Types.NULL;

@SpringBootApplication
public class ApiTestApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApiTestApplication.class, args);
	}

	@Autowired
	EtudiantService etudiantService;

	@Autowired
	LibrairyService librairyService;

	@Autowired
	AddressService addressService;

	@Override
	public void run(String... args) throws Exception {
		Etudiant e = new Etudiant();
		Librairy l = new Librairy();
		Address a = new Address();

		a.setId(NULL);
		a.setLocation("Ranger numero 1");


		l.setId_livre(NULL);
		l.setName("le petit dauphin bleu");

		e.setId(1);
		e.setNom("william");

		etudiantService.saveEtudiant(e);
		librairyService.createLibrairie(l);
		addressService.createAddress(a);
	}
}
