package One2Many_Uni;
import javax.persistence.*;

//One2 Many uni => by default is JoinTable
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
