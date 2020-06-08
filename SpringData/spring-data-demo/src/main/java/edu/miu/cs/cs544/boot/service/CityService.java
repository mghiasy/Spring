package edu.miu.cs.cs544.boot.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.cs.cs544.boot.domain.City;
import edu.miu.cs.cs544.boot.domain.Country;
import edu.miu.cs.cs544.boot.repossitory.CityRepository;
import edu.miu.cs.cs544.boot.repossitory.CountryRepository;

@Service
@Transactional
public class CityService {
	
	@Autowired
	CityRepository cityRepository;
	
	@Autowired
	CountryRepository countryRepository;
	
	public List<City> findByCountryId(Integer countryId) {
		return solution3(countryId);
	}
	
	private List<City> solution1(Integer countryId) {
		Optional<Country> country = countryRepository.findById(countryId);
		
		return cityRepository.findByCountry(country.orElse(null));
	}
	
	private List<City> solution2(Integer countryId) {
		return cityRepository.findByCountryId(countryId);
	}
	
	private List<City> solution3(Integer countryId) {
		return cityRepository.findCityListByCountryId(countryId);
	}

}
