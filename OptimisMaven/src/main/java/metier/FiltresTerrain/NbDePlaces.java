package metier.FiltresTerrain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class NbDePlaces {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;

		@ManyToMany(mappedBy = "nombrePlaces")
		private List<Terrain> terrains = new ArrayList();

		private String nombrePlaces;

		public NbDePlaces() {
		
		}
		
		public NbDePlaces(String nombrePlaces) {
			this.nombrePlaces = nombrePlaces;
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

		public String getNombrePlaces() {
			return nombrePlaces;
		}

		public void setNombrePlaces(String nombrePlaces) {
			this.nombrePlaces = nombrePlaces;
		}	
		
		
		
}
