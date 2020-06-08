package edu.miu.cs.cs544.boot.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.cs.cs544.boot.domain.Country;
import edu.miu.cs.cs544.boot.repossitory.CountryRepository;

@Service
@Transactional
public class CountryService {
	
	@Autowired
	CountryRepository repository;
	
	public List<Country> getAllCountries() {
		return repository.findAll();
	}

}
