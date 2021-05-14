package metier.FiltresTerrain;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
public class Terrain {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
//	private String lien;
	protected boolean course;
	
	@Enumerated(EnumType.STRING)
	protected Sol sol;
	@Enumerated(EnumType.STRING)
	protected Meteo meteo;
	@Enumerated(EnumType.STRING)
	protected NbDePlaces nombrePlaces;
	
	
//    public Terrain(boolean course, String lien, Sol sol, NbDePlaces nombrePlaces) {
//		
//		this.course = course;
////		this.lien = lien;
//		this.sol = sol;
//		this.nombrePlaces = nombrePlaces;
//
//	}
    
    public Terrain() {
	
	}

	public Terrain(boolean course, Sol sol,Meteo meteo, NbDePlaces nombrePlaces) {

		this.course = course;
		this.sol = sol;
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


//	public String getLien() {
//		return lien;
//	}
//
//	public void setLien(String lien) {
//		this.lien = lien;
//	}

	public Sol getSol() {
		return sol;
	}

	public void setSol(Sol sol) {
		this.sol = sol;
	}


	public NbDePlaces getNombrePlaces() {
		return nombrePlaces;
	}

	public void setNombrePlaces(NbDePlaces nombrePlaces) {
		this.nombrePlaces = nombrePlaces;
	}

	

}
