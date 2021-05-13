package metier;

import javax.persistence.*;

@Embeddable
public class Adresse {
	@Column(nullable=false)
	private String rue;
	private int numero;
	private String ville;
	private int codePostal;
	
	
	public Adresse() {
	}
	
	public Adresse(String rue, int numero, String ville, int codePostal) {
	
		this.rue = rue;
		this.numero = numero;
		this.ville = ville;
		this.codePostal = codePostal;
	}
	
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	@Override
	public String toString() {
		return "Adresse [rue=" + rue + ", numero=" + numero + ", ville=" + ville + ", codePostal=" + codePostal + "]";
	}
	
	

}
