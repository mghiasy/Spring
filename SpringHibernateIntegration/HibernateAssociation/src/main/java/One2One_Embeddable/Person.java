package One2One_Embeddable;
import javax.persistence.*;

@Entity
//Here there is 2 different class which are imbeded in one table
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	@Column
	private String name;
	

	//means this address is gonna be Embedd here
@Embedded
	private Address address;

	

}
