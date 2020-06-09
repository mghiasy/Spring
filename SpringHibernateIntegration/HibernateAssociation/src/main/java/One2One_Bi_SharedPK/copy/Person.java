package One2One_Bi_SharedPK.copy;
import java.util.List;

import javax.persistence.*;

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
