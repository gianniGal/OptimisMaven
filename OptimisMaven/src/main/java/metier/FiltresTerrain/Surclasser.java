package metier.FiltresTerrain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Surclasser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToMany(mappedBy = "surclasser")
	private List<Terrain> terrains = new ArrayList();
	private String surclasser;

	public Surclasser() {
		
	}

	public Surclasser(String surclasser) {
		
		this.surclasser = surclasser;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getsurclasser() {
		return surclasser;
	}

	public void setsurclasser(String surclasser) {
		this.surclasser = surclasser;
	}

	@Override
	public String toString() {
		return "surclasser [id=" + id + ", surclasser=" + surclasser + "]";
	}
	
	
	

}
