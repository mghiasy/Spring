package Manyh2Many;
import java.util.List;

import javax.persistence.*;


@Entity
public class Car {
	@Id
	private long Id;
	@Column
	private String model;
	@Column
	private String color;
	
	
	//if we just use this it is gonna have 2 JoinTable =>Person_car and Car_person
	//every many2Many will create 1 Jpointable
	//@ManyToMany
	
	
	// to solve it one side should give up by Mappedby =>just create table in Person side
	@ManyToMany(mappedBy = "cars")
	private List<Person> persons;
	
	//if we want to add more info to joinTable it is better to turn association to 2 One2Many
	//for example rel between student & Course => we need to store grade too 

}
