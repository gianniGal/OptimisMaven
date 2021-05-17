package metier;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import metier.FiltresTerrain.Meteo;
import metier.FiltresTerrain.NbDePlaces;
import metier.FiltresTerrain.Surclasser;
import metier.FiltresTerrain.Sol;

@Entity
public class Piece {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	private String libelle;
	private double prix;
	//	@ManyToMany(cascade = {CascadeType.MERGE,CascadeType.REMOVE})
	//	private List<Terrain> terrains;	
	@ManyToOne (cascade = {CascadeType.MERGE,CascadeType.REMOVE})
	private Sol sol;
	@ManyToOne (cascade = {CascadeType.MERGE,CascadeType.REMOVE})
	private Meteo meteo;
	private String lien;
	@ManyToOne (cascade = {CascadeType.MERGE,CascadeType.REMOVE})
	protected NbDePlaces nombrePlaces;
	private boolean course;
	@ManyToOne (cascade = {CascadeType.MERGE,CascadeType.REMOVE})
	private Surclasser surclasser;
	
	

	public Piece() {

	}

	public Piece(int id,String libelle, double prix/*, List<Terrain> terrains*/) {

		this.id = id;
		this.libelle = libelle;
		this.prix = prix;
		//		this.terrains = terrains;
		this.lien=lien;
		


	}

	public Piece(String libelle, double prix, Sol sol, Meteo meteo,NbDePlaces nombrePlaces,  boolean course,Surclasser surclasser ,String lien ) {

		//		this.id = id;
		this.libelle = libelle;
		this.prix = prix;
		//		this.terrains = terrains;
		//		this.typePiece = typePiece;
		this.sol=sol;
		this.meteo=meteo;
		this.nombrePlaces=nombrePlaces;
		this.lien=lien;
		this.course=course;
		this.surclasser=surclasser;
	}

	public Piece(String libelle, double prix) {

		//		this.id = id;
		this.libelle = libelle;
		this.prix = prix;

		//		this.typePiece = typePiece;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	//	public List<Terrain>  getTerrain() {
	//		return terrains;
	//	}
	//
	//	public void setTerrain(List<Terrain> terrains) {
	//		this.terrains = terrains;
	//	}

	
	
	public String getLien() {
		return lien;
	}

	public Sol getSol() {
		return sol;
	}

	public void setSol(Sol sol) {
		this.sol = sol;
	}

	public Meteo getMeteo() {
		return meteo;
	}

	public void setMeteo(Meteo meteo) {
		this.meteo = meteo;
	}

	public void setLien(String lien) {
		this.lien = lien;
	}


	public NbDePlaces getNombrePlaces() {
		return nombrePlaces;
	}

	public void setNombrePlaces(NbDePlaces nombrePlaces) {
		this.nombrePlaces = nombrePlaces;
	}

	public boolean isCourse() {
		return course;
	}

	public void setCourse(boolean course) {
		this.course = course;
	}

	public Surclasser getSurclasser() {
		return surclasser;
	}

	public void setSurclasser(Surclasser surclasser) {
		this.surclasser = surclasser;
	}

	@Override
	public String toString() {
		return "Piece [id=" + id + ", libelle=" + libelle + ", prix=" + prix + ", sol=" + sol + ", meteo=" + meteo
				+ ", lien=" + lien + ", nombrePlaces=" + nombrePlaces + ", course=" + course + ", surclasser=" + surclasser
				+ "]";
	}


}
