package com.services.company.companyservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CompanyServiceApplication {
	private static Logger logger = LoggerFactory.getLogger(CompanyServiceApplication.class);

	public static void main(String[] args)
	{
		logger.info("welcome to company");
		SpringApplication.run(CompanyServiceApplication.class, args);
		logger.info("welcome to company");

	}

}
