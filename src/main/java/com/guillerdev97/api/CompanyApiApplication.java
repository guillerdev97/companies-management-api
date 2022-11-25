package com.guillerdev97.api;

import com.guillerdev97.api.model.Company;
import com.guillerdev97.api.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CompanyApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CompanyApiApplication.class, args);
	}

	private final CompanyRepository companyRepository;

	@Autowired
	public CompanyApiApplication(CompanyRepository companyRepository) {
		this.companyRepository = companyRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		Company KFC = new Company(
				null,
				"KFC",
				"EEUU",
				34560
		);

		companyRepository.save(KFC);

		Company Popeyes = new Company();
		Popeyes.setCompanyName("Popeyes");
		Popeyes.setCountry("EEUU");
		Popeyes.setEmployeesNumber(33980);

		companyRepository.save(Popeyes);
	}
}
