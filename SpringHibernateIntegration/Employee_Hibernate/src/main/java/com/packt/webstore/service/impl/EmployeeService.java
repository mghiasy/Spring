package com.packt.webstore.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packt.webstore.domain.Employee;
import com.packt.webstore.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public void SaveEmployee(Employee emp) {
		employeeRepository.save(emp);
	}
	public Employee getEmployeeByNumber(int number) {
		Employee emp = employeeRepository.locateOneEmployeeByHisNumber(number);
		return emp;
	}
	public List<Employee> getAllEmployees() {
		List<Employee> empList= new ArrayList<>();
		employeeRepository.findAll().forEach(empList::add);
		return empList;
	}

}
