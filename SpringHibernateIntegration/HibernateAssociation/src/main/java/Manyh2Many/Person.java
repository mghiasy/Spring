package Manyh2Many;

import java.util.List;

import javax.persistence.*;

//the only option is here just "JOINTABLE"
@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	@Column
	private String name;
	
	
	//every Many 2 Many rel will create a new table for association
	//TableName by default = classname1_Classname2
	//columns by default = className(Person)_Id and link field (cars)_Id
	@ManyToMany
	//can add @Jointable to customise it 
	private List<Car> cars;

	

}
