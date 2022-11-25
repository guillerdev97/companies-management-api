package com.guillerdev97.api.controller;

import com.guillerdev97.api.model.Company;
import com.guillerdev97.api.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CompanyController {
    private CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/companies")
    public ResponseEntity<List<Company>> getCompanies() {
        return ResponseEntity.ok().body(companyService.getCompanies());
    }

    @GetMapping("/companies/{id}")
    public ResponseEntity<Company> findCompanyById(@PathVariable("id") Long companyId) {
        return ResponseEntity.ok().body(companyService.findCompanyById(companyId));
    }
}
