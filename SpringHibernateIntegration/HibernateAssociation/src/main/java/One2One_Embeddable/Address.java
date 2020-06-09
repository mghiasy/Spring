package One2One_Embeddable;
import javax.persistence.*;

//here we cannot use Entity => because when we define Entity it is gonna be new Table
//but we dont want to be new table=> all the fields should be inside PersonTable
//@Entity



//instead we use @Embeddable which shows this class is supposed to be embed in another table
@Embeddable
public class Address {
	//since is Embedded => Should not have primary Key
//	@Id
//	private long Id;
	@Column
	private String street;
	@Column
	private String zipCode;
	
	
	
	

}
