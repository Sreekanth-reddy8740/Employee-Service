package com.example.EmployeeApp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeApp.entity.Employee;
import com.example.EmployeeApp.responce.EmployeeResponce;
import com.example.EmployeeApp.service.EmployeeService;

@RestController
public class EmployeeController {
 
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/save")
	public Employee save(@RequestBody Employee employee) {
		return service.save(employee);
	}
	
//	@GetMapping("/employee/{id}")
//	Employee getEmployeeDetails(@PathVariable("id") int id) {
//		return service.getEmployeeById(id);
//	}
	
	@GetMapping("/employee/{id}")
	ResponseEntity<EmployeeResponce> getEmployeeDetails(@PathVariable("id") int id) {
		EmployeeResponce employeeResponce = service.getEmployeeById(id);
		return ResponseEntity.status(HttpStatus.OK).body(employeeResponce);
	}
}
