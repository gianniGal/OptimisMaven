package metier.FiltresTerrain;

import javax.persistence.Embeddable;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Embeddable

public class Terrain {
	
	protected boolean course;
	public transient String lien;
	protected Sol sol;
	protected NbDePlaces nombrePlaces;
	protected transient boolean statut;
	
	
    public Terrain(boolean course, String lien, Sol sol, NbDePlaces nombrePlaces) {
		
		this.course = course;
		this.lien = lien;
		this.sol = sol;
		this.nombrePlaces = nombrePlaces;

	}
    
    public Terrain() {
	
	}

	public Terrain(boolean course, Sol sol, NbDePlaces nombrePlaces, boolean statut) {

		this.course = course;
		this.sol = sol;
		this.nombrePlaces = nombrePlaces;
		this.statut = statut;

	}

	public boolean isStatut() {
		return statut;
	}

	public void setStatut(boolean statut) {
		this.statut = statut;
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
