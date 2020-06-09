package many2One_JoinTable;
import javax.persistence.*;

//Join table is used for cases that one side (person) can be null able

public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Id;
	@Column
	private String street;
	@Column
	private String zipCode;
	
	@ManyToOne
	//name = JoinTable name
	//@JoinTable(name = "person_address")
	//we can customize column names
	@JoinTable(name="person_address",joinColumns= {@JoinColumn(name="Person_Id")},inverseJoinColumns = {@JoinColumn(name="address_Id")})
	private Person person;
	
	

}
