package com.bridgelabz.employeepayrollapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class})

public class EmployeePayrollAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeePayrollAppApplication.class, args);
	}

}
