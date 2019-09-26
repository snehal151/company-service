package com.services.company.companyservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
    private static Logger logger = LoggerFactory.getLogger(CompanyController.class);

    @PostMapping
    public void postCompnay()
    {
        logger.info("In Post ");
    }

    @GetMapping
    public String somethingToGet(){
        logger.info("In get ");
        return "Welcome";
    }

}
