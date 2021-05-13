package metier;

import javax.persistence.*;

@Entity
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAdmin;
	@Column(nullable = false)
	private  String login;
	private  String password;
	
	public Admin() {
	}

	public Admin(int idAdmin, String login, String password) {
		
		this.idAdmin = idAdmin;
		this.login = login;
		this.password = password;
	}

	public int getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [idAdmin=" + idAdmin + ", login=" + login + ", password=" + password + "]";
	}
	
	

}
