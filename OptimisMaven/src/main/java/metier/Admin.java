package metier;

import javax.persistence.*;

@Entity
public class Admin extends Compte{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAdmin;
	
	
	public Admin() {
	}
	
	public Admin(String login, String password) {
		super(login, password);
		
	}
	
	

}
