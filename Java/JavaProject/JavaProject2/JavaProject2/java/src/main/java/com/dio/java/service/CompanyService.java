package com.dio.java.service;

import com.dio.java.model.Company;
import com.dio.java.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    public Company saveCompany(Company company){
        return companyRepository.save(company);
    }

    public List<Company> findAll(){
        return companyRepository.findAll();
    }

    public Optional<Company> getById(Long idCompany){
        return companyRepository.findById(idCompany);
    }

    public Company updateCompany(Company company){
        return companyRepository.save(company);
    }

    public void deleteCompany(Long idCompany){
        companyRepository.deleteById(idCompany);
    }
}
