package com.packt.webstore.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Employee;

	@Repository
	public interface EmployeeRepository extends  CrudRepository<Employee, Integer> {
		
		@Query("SELECT e FROM Employee e where EMP_ID = :number")
		public Employee locateOneEmployeeByHisNumber(@Param("number") int number);
  	}

