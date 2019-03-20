package com.yodlee.microservices.architecture.employee;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
	public class EmployeeController {
		
		@RequestMapping(value="/employees", method=RequestMethod.GET, produces="application/json")
		public List<Employee> getEmployee(){
			
			List<Employee> books = new LinkedList<>();
			books.add(new Employee(1234, "Manish"));
			books.add(new Employee(2345, "Vishal"));
			return books;
			
		}

	} 
		
		
		
		
		 
	 


