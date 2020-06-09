package One2One_Uni_SharedPK;

import javax.persistence.*;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	@Column
	private String name;
	
	
	@OneToOne
	//---- will consider the same id for Address
	@PrimaryKeyJoinColumn
	private Address address;

	

}
