package com.example.EmployeeApp.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeApp.entity.Employee;
import com.example.EmployeeApp.repository.EmployeeRepository;
import com.example.EmployeeApp.responce.EmployeeResponce;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;
	
	@Autowired
	private ModelMapper modelmapper;
	
	public Employee save(Employee employee) {
		return repo.save(employee);	
	}
	
//	public Employee getEmployeeById(int id) {
//		
//		 												// employee --> employeeresponce
//		 Employee employee= repo.findById(id).get();
//		 return employee;
//	}
	
	public EmployeeResponce getEmployeeById(int id) {
		
		 Employee employee= repo.findById(id).get();
		 EmployeeResponce employeeResponce = modelmapper.map(employee, EmployeeResponce.class);			
		 
		// it is done by manully so make it eassy we impliment modelmapper
		 
//		 EmployeeResponce employeeResponce = new EmployeeResponce();
//		 employeeResponce.setId(employee.getId());
//		 employeeResponce.setName(employee.getName());
//		 employeeResponce.setEmail(employee.getEmail());
//		 employeeResponce.setBloodGroup(employee.getBloodGroup());
		 
		 return employeeResponce; 
		 
	}
	
	

}
