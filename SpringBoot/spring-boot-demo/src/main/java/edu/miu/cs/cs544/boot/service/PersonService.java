package edu.miu.cs.cs544.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.cs.cs544.boot.domain.Person;
import edu.miu.cs.cs544.boot.repossitory.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	PersonRepository repository;
	
	public Person getPerson() {
		return repository.getPerson();
	}

}
