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
	@ManyToMany
	private List<Terrain> terrains;	

	

	public Piece() {

	}
	
	public Piece(int id,String libelle, double prix, List<Terrain> terrains ) {

		this.id = id;
		this.libelle = libelle;
		this.prix = prix;
		this.terrains = terrains;

	}
	
	public Piece(String libelle, double prix, List<Terrain> terrains) {

//		this.id = id;
		this.libelle = libelle;
		this.prix = prix;
		this.terrains = terrains;
//		this.typePiece = typePiece;
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


	
	

}
