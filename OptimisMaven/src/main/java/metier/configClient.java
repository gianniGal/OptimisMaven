package metier;

import java.util.List;

import javax.persistence.*;

@Entity
public class configClient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idConfig;
	
	@OneToOne
	private Piece moteur;
	@OneToOne
	private Piece phare;
	@OneToOne
	private Piece roue;
	@OneToOne
	private Piece frein;
	@OneToOne
	private Piece suspension;
	@OneToOne
	private Piece chassis;
	
	
	public int getIdConfig() {
		return idConfig;
	}
	public void setIdConfig(int idConfig) {
		this.idConfig = idConfig;
	}
	public Piece getMoteur() {
		return moteur;
	}
	public void setMoteur(Piece moteur) {
		this.moteur = moteur;
	}
	public Piece getPhare() {
		return phare;
	}
	public void setPhare(Piece phare) {
		this.phare = phare;
	}
	public Piece getRoue() {
		return roue;
	}
	public void setRoue(Piece roue) {
		this.roue = roue;
	}
	public Piece getFrein() {
		return frein;
	}
	public void setFrein(Piece frein) {
		this.frein = frein;
	}
	public Piece getSuspension() {
		return suspension;
	}
	public void setSuspension(Piece suspension) {
		this.suspension = suspension;
	}
	public Piece getChassis() {
		return chassis;
	}
	public void setChassis(Piece chassis) {
		this.chassis = chassis;
	}
	@Override
	public String toString() {
		return "configClient [idConfig=" + idConfig + ", moteur=" + moteur + ", phare=" + phare + ", roue=" + roue
				+ ", frein=" + frein + ", suspension=" + suspension + ", chassis=" + chassis + "]";
	}
	public configClient() {
	}
	public configClient(int idConfig, Piece moteur, Piece phare, Piece roue, Piece frein, Piece suspension,
			Piece chassis) {
		this.idConfig = idConfig;
		this.moteur = moteur;
		this.phare = phare;
		this.roue = roue;
		this.frein = frein;
		this.suspension = suspension;
		this.chassis = chassis;
	}
	
	
	
}
