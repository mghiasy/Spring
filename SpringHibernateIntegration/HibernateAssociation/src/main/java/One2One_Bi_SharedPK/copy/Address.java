package One2One_Bi_SharedPK.copy;
import javax.persistence.*;

//One2 Many Bi=> one2Many , Many2One => should be at the same time

public class Address {
	@Id
	//cannnot both of them have @GeneratedValue Id => because id is supposed to be shared between them
	//=> onle the owning side (person) should have @GeneratedValue
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Id;
	@Column
	private String street;
	@Column
	private String zipCode;
	
	
	@OneToOne
	//will create a JoinCol by default
	//the all thing is remind to keep the id by value for Joincol
	@PrimaryKeyJoinColumn
	private Person person;
	
	
	
	

}
