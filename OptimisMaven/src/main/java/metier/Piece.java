package metier;

import java.util.List;

import javax.persistence.*;
import metier.FiltresTerrain.Terrain;

@Entity
public class Piece {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	private String libelle;
	private double prix;
	@ManyToMany(cascade = {CascadeType.MERGE,CascadeType.REMOVE})
	private List<Terrain> terrains;	
	private String lien;

	

	public Piece() {

	}
	
	public Piece(int id,String libelle, double prix, List<Terrain> terrains) {

		this.id = id;
		this.libelle = libelle;
		this.prix = prix;
		this.terrains = terrains;
		this.lien=lien;
		

	}
	
	public Piece(String libelle, double prix, List<Terrain> terrains, String lien ) {

//		this.id = id;
		this.libelle = libelle;
		this.prix = prix;
		this.terrains = terrains;
//		this.typePiece = typePiece;
		this.lien=lien;
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

	public List<Terrain>  getTerrain() {
		return terrains;
	}

	public void setTerrain(List<Terrain> terrains) {
		this.terrains = terrains;
	}

	public String getLien() {
		return lien;
	}

	public void setLien(String lien) {
		this.lien = lien;
	}


	
	

}
