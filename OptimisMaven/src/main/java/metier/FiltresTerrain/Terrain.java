package metier.FiltresTerrain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Terrain {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	public transient String lien;
	//@Column(name="Course", columnDefinition="boolean default false")
	protected boolean course ;
	
	
	@ElementCollection(fetch = FetchType.EAGER)
	@Enumerated(EnumType.STRING)
	protected List<Sol> sols;
	@Enumerated(EnumType.STRING)
	protected Meteo meteo;
	@Enumerated(EnumType.STRING)
	protected NbDePlaces nombrePlaces;
	
	
    public Terrain(boolean course, String lien, List<Sol> sols, NbDePlaces nombrePlaces) {
		
		this.course = course;
		this.lien = lien;
		this.sols = sols;
		this.nombrePlaces = nombrePlaces;

	}
    
    public Terrain() {
	
	}

	public Terrain(boolean course, List<Sol> sols,Meteo meteo, NbDePlaces nombrePlaces) {

		this.course = course;
		this.sols = sols;
		this.meteo = meteo;
		this.nombrePlaces = nombrePlaces;
	

	}



	public Meteo getMeteo() {
		return meteo;
	}

	public void setMeteo(Meteo meteo) {
		this.meteo = meteo;
	}

	public boolean isCourse() {
		return course;
	}

	public void setCourse(boolean course) {
		this.course = course;
	}


	public String getLien() {
		return lien;
	}

	public void setLien(String lien) {
		this.lien = lien;
	}

	public List<Sol> getSol() {
		return sols;
	}

	public void setSol(List<Sol> sol) {
		this.sols = sol;
	}


	public NbDePlaces getNombrePlaces() {
		return nombrePlaces;
	}

	public void setNombrePlaces(NbDePlaces nombrePlaces) {
		this.nombrePlaces = nombrePlaces;
	}

	

}
