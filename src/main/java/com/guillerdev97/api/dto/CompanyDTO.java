package com.guillerdev97.api.dto;

import lombok.Data;

@Data
public class CompanyDTO {
    private Long id;
    private String companyName;
    private String country;
    private int employeesNumber;
}
