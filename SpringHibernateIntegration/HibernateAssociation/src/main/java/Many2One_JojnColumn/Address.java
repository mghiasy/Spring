package Many2One_JojnColumn;
import javax.persistence.*;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Id;
	@Column
	private String street;
	@Column
	private String zipCode;
	
	@ManyToOne
	@JoinColumn(name = "person_id")
	//join column
	private Person person;
	
	

}
