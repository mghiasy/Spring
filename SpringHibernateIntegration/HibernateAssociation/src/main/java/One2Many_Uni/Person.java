package One2Many_Uni;
import java.util.List;

import javax.persistence.*;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	@Column
	private String name;
	
	@OneToMany
	private List<Address> addresses;
	//will automatically generate JoinTable
	//if we want to customize name and column names => we can write the code here:
	//@JoinTable(name="person_address",joinColumns= {@JoinColumn(name="Person_Id")},inverseJoinColumns = {@JoinColumn(name="address_Id")})
	//one to many is unique in mane side => addressId can not be repeated => will turn to Many2many
	
	
	
//	if we want to make it by JoinColumn => we just add @JoinCloumn here => we force Hibernate to create arelationship with JoinColum
	//=> will add this column to many side=>in Address table 
	//@JoinColumn(name ="address_Id")
	//if we dont select the name for JoinColumn => fieldName(addresses)+"_"+id of Table(id of Person)
	
	

}
