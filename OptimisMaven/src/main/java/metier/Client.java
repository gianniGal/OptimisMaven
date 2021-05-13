package metier;

import javax.persistence.*;

@Entity
public class Client extends Compte{


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idClient;
	
	@Embedded
	private Adresse adresse;
	
	@Column(nullable = false)
	private int telephone;
	private String mail;
	

	
	public Client() {
		
	}

	public Client(String login, String password, Adresse adresse, int telephone, String mail) {
		super(login, password);
		this.adresse = adresse;
		this.telephone = telephone;
		this.mail = mail;
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
