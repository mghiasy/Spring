package com.packt.webstore.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.packt.webstore.domain.Employee;
import com.packt.webstore.repository.EmployeeRepository;

public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public void SaveEmployee(Employee emp) {
		employeeRepository.save(emp);
	}
	public void getEmployeeByNumber(int number) {
		employeeRepository.findOne(number);
	}
	public void getAllEmployees() {
		List<Employee> empList= new ArrayList<>();
		employeeRepository.findAll();
	}

}
