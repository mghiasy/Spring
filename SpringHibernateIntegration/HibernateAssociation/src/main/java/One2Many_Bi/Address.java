package One2Many_Bi;
import javax.persistence.*;

//One2 Many Bi=> one2Many , Many2One => should be at the same time

public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Id;
	@Column
	private String street;
	@Column
	private String zipCode;
	
	//----2 way relation-----
	@OneToMany
	//for customize the name we can add JoinColumn ==> by default mode
	//or if we want to 
	private Person person;
	
	

}
