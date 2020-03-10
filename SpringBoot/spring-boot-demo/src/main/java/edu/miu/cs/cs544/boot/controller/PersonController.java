package edu.miu.cs.cs544.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.miu.cs.cs544.boot.domain.Person;
import edu.miu.cs.cs544.boot.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService service;
	
	@GetMapping("/person")
	public Person getPerson() {
		return service.getPerson();
	}

	@PostMapping("/person")
	public Person getPerson(Person person) {
		return service.getPerson();
	}

}
