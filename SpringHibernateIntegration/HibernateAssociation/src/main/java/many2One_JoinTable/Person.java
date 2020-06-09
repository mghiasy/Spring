package many2One_JoinTable;
import javax.persistence.*;

public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	@Column
	private String name;
	
	

}
