package com.services.company.companyservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CompanyController {
    private static Logger logger = LoggerFactory.getLogger(CompanyController.class);

    @Autowired
    CompanyService companyService;

    @PostMapping
    public void postCompany(@RequestBody Company company) {
        logger.info("postCompany: start");
        companyService.saveCompany(company);
        logger.info("postCompany: finish");
    }

    @GetMapping("/{id}")
    public Company somethingToGet(@PathVariable int id) {
        logger.info("getCompany: start");
        return companyService.getCompany(id);
    }

}
