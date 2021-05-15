package metier.FiltresTerrain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Sol{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToMany(mappedBy = "sols")
	private List<Terrain> terrains = new ArrayList();

	private String sol;	
	
	 public Sol() {
		 
	 }
	 
	public Sol(String sol) {
		
		this.sol = sol;
	
	}

	public String getSol() {
		return sol;
	}

	public void setSol(String sol) {
		this.sol = sol;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Terrain> getTerrains() {
		return terrains;
	}

	public void setTerrains(List<Terrain> terrains) {
		this.terrains = terrains;
	}
	
	
}








//public enum Sol {
//	//@ManyToMany
//	Sable,Terre,Boue,Glace,Neige,Route;
//	
//}
