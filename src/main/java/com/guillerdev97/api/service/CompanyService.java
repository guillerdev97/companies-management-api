package com.guillerdev97.api.service;

import com.guillerdev97.api.model.Company;

import java.util.List;

public interface CompanyService {
    List<Company> getCompanies();

    Company findCompanyById(Long id);
}
