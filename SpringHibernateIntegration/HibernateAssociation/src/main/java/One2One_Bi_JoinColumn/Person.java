package One2One_Bi_JoinColumn;

import javax.persistence.*;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	@Column
	private String name;
	
	//----exactly same as Many2One uni ==> can be customized with @JoinCol
	@OneToOne
	private Address address;

	

}
