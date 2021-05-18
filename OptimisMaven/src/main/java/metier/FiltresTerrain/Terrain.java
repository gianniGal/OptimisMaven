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
	protected boolean course ;
	@ManyToMany (cascade = {CascadeType.MERGE,CascadeType.REMOVE})
	protected List<Surclasser> surclasser;
	private String label;

	
	
	
	public Terrain() {
		
	}
	public Terrain( String lien,  List<Sol> sols, List<Meteo> meteos, List<NbDePlaces> nombrePlaces, boolean course, List<Surclasser> surclasser, String label ) {
		
		this.lien = lien;
		this.sols = sols;
		this.meteos = meteos;
		this.nombrePlaces = nombrePlaces;
		this.course = course;
		this.surclasser=surclasser;
		this.label=label;
		
		
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
	public List<Surclasser> getSurclasser() {
		return surclasser;
	}
	public void setSurclasser(List<Surclasser> surclasser) {
		this.surclasser = surclasser;
		
		
		
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	@Override
	public String toString() {
		return "Terrain [id=" + id + ", lien=" + lien + ", sols=" + sols + ", meteos=" + meteos + ", nombrePlaces="
				+ nombrePlaces + ", course=" + course + ", surclasser=" + surclasser + "]";
	}

	
	
	
	
	
	

	
	
}