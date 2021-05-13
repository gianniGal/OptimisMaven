package metier;

import metier.FiltresTerrain.Terrain;

public class Commande {
	
	private int idCommande;
	private Client client;
	private Vehicule vehicule;
	private Terrain terrain;
	
	public Commande(int idCommande, Vehicule vehicule, Terrain terrain) {
		super();
		this.idCommande = idCommande;
		this.vehicule = vehicule;
		this.terrain = terrain;
	}
	
	public int getIdCommande() {
		return idCommande;
	}
	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}
	public Vehicule getVehicule() {
		return vehicule;
	}
	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}
	public Terrain getTerrain() {
		return terrain;
	}
	public void setTerrain(Terrain terrain) {
		this.terrain = terrain;
	}
	
	
	

}
