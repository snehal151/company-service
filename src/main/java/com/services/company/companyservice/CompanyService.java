package com.services.company.companyservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;


@Service
public class CompanyService {

    @Autowired
    CrudRepository companyRepository;

    public Company saveCompany(Company newCompany) {
        int newId = (int) companyRepository.count() + 1;
        newCompany.setId(newId);
        companyRepository.save(newCompany);
        return newCompany;
    }

    public Company getCompany(int id) {
        Optional<Company> byId = companyRepository.findById(id);
        if (byId.isPresent()) {
            return byId.get();
        } else {
            return null;
        }
    }


    public List<Company> getAllComapny() {
        List<Company> tempList = new ArrayList<>();
        Iterable<Company> iterable = companyRepository.findAll();
        Iterator<Company> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            Company next = iterator.next();
            tempList.add(next);
        }
        return tempList;
    }
}