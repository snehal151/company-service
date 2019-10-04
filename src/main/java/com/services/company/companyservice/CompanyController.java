package com.services.company.companyservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyController {
    private static Logger logger = LoggerFactory.getLogger(CompanyController.class);

    @Autowired
    CompanyService companyService;

     @PostMapping
    public ResponseEntity postCompany(@RequestBody Company company) {
        logger.info("postCompany: start");
        Company savedCompany = companyService.saveCompany(company);
        if (savedCompany == null) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        } else {
            return new ResponseEntity(HttpStatus.CREATED);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Company> somethingToGet(@PathVariable int id) {
        logger.info("getCompany: start");
        Company retrievedCompany = companyService.getCompany(id);
        if (retrievedCompany == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(retrievedCompany, HttpStatus.OK);
        }
    }

    @GetMapping("")
    public ResponseEntity<List<Company>> getAll(){
         List<Company> allCompany =companyService.getAllComapny();
         return new ResponseEntity<>(allCompany,HttpStatus.OK);
    }

}

