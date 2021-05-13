package metier.FiltresTerrain;

public class Terrain {
	
	protected boolean course;
	protected boolean luminosite;
	public String lien;
	protected Sol sol;
	protected TpsDeVoyage dureeVoyage;
	protected NbDePlaces nombrePlaces;
	protected boolean animal;
	protected boolean conflit;
	protected boolean statut;
	
	
    public Terrain(boolean course, boolean luminosite, String lien, Sol sol, TpsDeVoyage dureeVoyage,
			NbDePlaces nombrePlaces, boolean animal, boolean conflit) {
		
		this.course = course;
		this.luminosite = luminosite;
		this.lien = lien;
		this.sol = sol;
		this.dureeVoyage = dureeVoyage;
		this.nombrePlaces = nombrePlaces;
		this.animal = animal;
		this.conflit = conflit;
	}
    
    public Terrain() {
	
	}

	public Terrain(boolean course, boolean luminosite,  Sol sol, TpsDeVoyage dureeVoyage,
			NbDePlaces nombrePlaces, boolean animal, boolean conflit,boolean statut) {

		this.course = course;
		this.luminosite = luminosite;
		this.sol = sol;
		this.dureeVoyage = dureeVoyage;
		this.nombrePlaces = nombrePlaces;
		this.animal = animal;
		this.conflit = conflit;
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

	public boolean isLuminosite() {
		return luminosite;
	}

	public void setLuminosite(boolean luminosite) {
		this.luminosite = luminosite;
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

	public TpsDeVoyage getDureeVoyage() {
		return dureeVoyage;
	}

	public void setDureeVoyage(TpsDeVoyage dureeVoyage) {
		this.dureeVoyage = dureeVoyage;
	}

	public NbDePlaces getNombrePlaces() {
		return nombrePlaces;
	}

	public void setNombrePlaces(NbDePlaces nombrePlaces) {
		this.nombrePlaces = nombrePlaces;
	}

	public boolean isAnimal() {
		return animal;
	}

	public void setAnimal(boolean animal) {
		this.animal = animal;
	}

	public boolean isConflit() {
		return conflit;
	}

	public void setConflit(boolean conflit) {
		this.conflit = conflit;
	}
	
	

}
