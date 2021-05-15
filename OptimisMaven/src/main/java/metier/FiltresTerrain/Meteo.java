package metier.FiltresTerrain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Meteo{
private String meteo;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

@ManyToMany(mappedBy = "meteos")
private List<Terrain> terrains = new ArrayList();

	public Meteo () {
		
	}
	
	
	public Meteo(String meteo) {
		
		this.meteo = meteo;
		
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


	public String getMeteo() {
		return meteo;
	}

	public void setMeteo(String meteo) {
		this.meteo = meteo;
	}





}



//public enum Meteo {
//
//	Sec,Pluie,Brouillard;
//	
//}
