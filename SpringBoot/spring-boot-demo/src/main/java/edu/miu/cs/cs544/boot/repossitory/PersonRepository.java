package edu.miu.cs.cs544.boot.repossitory;

import org.springframework.stereotype.Repository;

import edu.miu.cs.cs544.boot.domain.Address;
import edu.miu.cs.cs544.boot.domain.Person;

@Repository
public class PersonRepository {
	
	public Person getPerson() {
		Address address = new Address("1000 N 4th Street", "Fairfield", "Iowa", "52557");
		
		return new Person("John Doe", "jdoe@abc.xyz", address);
	}

}
