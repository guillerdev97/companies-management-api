package com.guillerdev97.api.service.impl;

import com.guillerdev97.api.model.Company;
import com.guillerdev97.api.repository.CompanyRepository;
import com.guillerdev97.api.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {
    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> getCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public Company findCompanyById(Long companyId) {
        return companyRepository.findCompanyById(companyId);
    }
}
