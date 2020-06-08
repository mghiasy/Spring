package edu.miu.cs.cs544.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import edu.miu.cs.cs544.boot.domain.City;
import edu.miu.cs.cs544.boot.domain.Country;
import edu.miu.cs.cs544.boot.service.CityService;
import edu.miu.cs.cs544.boot.service.CountryService;

@RestController
public class CountryController {
	
	@Autowired
	private CityService cityService;
	
	@Autowired
	private CountryService countryService;
	
	@GetMapping("/countries")
	public List<Country> getAllCountries() {
		return countryService.getAllCountries();
	}
	
	@GetMapping("/countries/{countryId}/cities")
	public List<City> getCitiesForCountry(@PathVariable Integer countryId) {
		return cityService.findByCountryId(countryId);
	}


}
