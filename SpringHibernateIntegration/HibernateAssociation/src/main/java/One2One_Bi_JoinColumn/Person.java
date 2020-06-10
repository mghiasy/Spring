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
	//@@@@@@@@@@@@@@@@@
	//One2One is bydefault is Eager => for change it fetchType=Lazy
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	
	//by default hibernate donot cascade=> if create a new person with address => will not save addresss
	//if we dont do that will raise Error in save

}
