package edu.miu.cs.cs544.boot.repossitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.miu.cs.cs544.boot.domain.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
