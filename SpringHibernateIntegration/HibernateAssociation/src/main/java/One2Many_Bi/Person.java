package One2Many_Bi;
import java.util.List;

import javax.persistence.*;

public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	@Column
	private String name;
	
	//----2 way relation-----
	@OneToMany(mappedBy = "person")
	
	//without mappedby ======
	//it will be 2 seperate unidirectional => not Bidirectional
	//for One2many => will create a table & for Many2One will add a JoinColumn in Address => one extra Jointable
	
	//with mappedby ======
	//when Hibernate wantes to create Jointable based on this field => 
	//mapped by means I gived up the realtionship => do nothing on my side=> No joinTable
	
	//value of mapped by = field on Many@One side => the value that has giveup to it
	
	
	//!!!!!after mappedby u cann not add JoinColumn/JoinTable => it has gived up => raise Error!!!!
	private List<Address> addresses;

	

}
