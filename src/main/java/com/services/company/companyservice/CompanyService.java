package com.services.company.companyservice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class CompanyService {

    List<Company> database = new ArrayList<>();

    public void saveCompany(Company newCompany) {
        int newId = database.size() + 1;
        newCompany.setId(newId);
        database.add(newCompany);
    }

    public Company getCompany(int id) {
        Iterator<Company> iterator = database.iterator();
        while (iterator.hasNext()) {
            Company tCompany = iterator.next();
            if (id == tCompany.getId()) {
                return tCompany;
            }
        }
        throw new RuntimeException("Company with id " + id + " Not found");
    }
}