package One2One_Uni_JoinColumn;
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
	
	//----for unidirection => we dont have this field => address knows nothing about customer
	//private Person person;
	
	

}
