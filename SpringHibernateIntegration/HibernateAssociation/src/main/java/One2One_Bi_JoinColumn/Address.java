package One2One_Bi_JoinColumn;
import javax.persistence.*;

//One2 Many Bi=> one2Many , Many2One => should be at the same time
@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Id;
	@Column
	private String street;
	@Column
	private String zipCode;
	
	//one side should give up the rel =>otherwise we have 2 joincol
	@OneToOne(mappedBy = "adress")
	private Person person;
	
	

}
