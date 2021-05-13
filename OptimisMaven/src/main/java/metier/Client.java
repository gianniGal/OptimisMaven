package metier;

import javax.persistence.*;

@Entity
public class Client {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idClient;
	
	@Column(nullable = false)
	private  String login;
	private  String password;
	private int telephone;
	private String mail;
	
	@Embedded
	private Adresse adresse;
	

	

	
	public Client() {
		
	}

	public Client(String login, String password, Adresse adresse, int telephone, String mail) {
		this.login = login ;
		this.password = password;
		this.adresse = adresse;
		this.telephone = telephone;
		this.mail = mail;
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
	
	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", adresse=" + adresse + ", telephone=" + telephone + ", mail=" + mail
				+ "]";
	}
	
	
	

	
}
