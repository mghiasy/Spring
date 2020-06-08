package edu.miu.cs.cs544.boot.repossitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.miu.cs.cs544.boot.domain.City;
import edu.miu.cs.cs544.boot.domain.Country;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
	
	// Solution 1
	public List<City> findByCountry(Country country);
	
	// Solution 2
	public List<City> findByCountryId(Integer countryId);

	// Solution 3
	@Query("SELECT c FROM City c WHERE c.country.id = :countryId")
	public List<City> findCityListByCountryId(Integer countryId);
}
