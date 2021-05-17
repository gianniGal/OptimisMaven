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
	private String lien;
	//@Column(name="Course", columnDefinition="boolean default false")
	protected boolean course ;

	@ManyToMany (cascade = {CascadeType.MERGE,CascadeType.REMOVE})
	//@ElementCollection(fetch = FetchType.LAZY)
	//@Enumerated(EnumType.STRING)
	protected List<Sol> sols;
	@ManyToMany (cascade = {CascadeType.MERGE,CascadeType.REMOVE})
	//@ElementCollection(fetch = FetchType.LAZY)
	//@Enumerated(EnumType.STRING)
	protected List<Meteo> meteos;
	
	@ManyToMany (cascade = {CascadeType.MERGE,CascadeType.REMOVE})
	protected List<NbDePlaces> nombrePlaces;
	
	
	public Terrain() {
		
	}
	public Terrain( String lien, boolean course, List<Sol> sols, List<Meteo> meteos, List<NbDePlaces> nombrePlaces) {
		
		this.lien = lien;
		this.course = course;
		this.sols = sols;
		this.meteos = meteos;
		this.nombrePlaces = nombrePlaces;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLien() {
		return lien;
	}
	public void setLien(String lien) {
		this.lien = lien;
	}
	public boolean isCourse() {
		return course;
	}
	public void setCourse(boolean course) {
		this.course = course;
	}
	public List<Sol> getSols() {
		return sols;
	}
	public void setSols(List<Sol> sols) {
		this.sols = sols;
	}
	public List<Meteo> getMeteos() {
		return meteos;
	}
	public void setMeteos(List<Meteo> meteos) {
		this.meteos = meteos;
	}
	public List<NbDePlaces> getNombrePlaces() {
		return nombrePlaces;
	}
	public void setNombrePlaces(List<NbDePlaces> nombrePlaces) {
		this.nombrePlaces = nombrePlaces;
	}
	
	
	@Override
	public String toString() {
		return "Terrain [id=" + id + ", lien=" + lien + ", course=" + course + ", sols=" + sols + ", meteos=" + meteos
				+ ", nombrePlaces=" + nombrePlaces + "]";
	}

	
	
	
	
	

	
	
}