package metier;

import java.util.List;

import javax.persistence.*;
import metier.FiltresTerrain.Terrain;

//@Entity
public class Piece {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	private String libelle;
	private double prix;
//	private List<Terrain> listeTerrain;
	private Terrain terrain;
	private String typePiece;
	
	public Piece() {

	}
	
	public Piece(int id,String libelle, double prix, Terrain terrain) {

		this.id = id;
		this.libelle = libelle;
		this.prix = prix;
		this.terrain = terrain;
//		this.typePiece = typePiece;
	}
	
	public Piece(String libelle, double prix, Terrain terrain) {

//		this.id = id;
		this.libelle = libelle;
		this.prix = prix;
		this.terrain = terrain;
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

	public Terrain getTerrain() {
		return terrain;
	}

	public void setTerrain(Terrain terrain) {
		this.terrain = terrain;
	}

	public String getTypePiece() {
		return typePiece;
	}

	public void setTypePiece(String typePiece) {
		this.typePiece = typePiece;
	}

	@Override
	public String toString() {
		return "Piece [id=" + id + ", libelle=" + libelle + ", prix=" + prix + ", terrain=" + terrain + ", typePiece="
				+ typePiece + "]";
	}


	

}
