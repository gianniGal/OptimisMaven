package metier.FiltresTerrain;

import java.util.ArrayList;
import java.util.List;

public class Circuit extends Terrain{
	
	private String circuit;
	private List<Sol> typeSolCircuit = new ArrayList();



	//	Sable,Terre,Boue,Glace,Neige,Route;
	public Circuit() {
	
	}

	public Circuit(boolean course, Sol sol, NbDePlaces nombrePlaces) {
		super(course, sol, nombrePlaces);
		// TODO Auto-generated constructor stub
	}

	public Circuit(boolean course, String lien, Sol sol, NbDePlaces nombrePlaces) {
		super(course, lien, sol, nombrePlaces);
		// TODO Auto-generated constructor stub
	}

	public String getCircuit() {
		return circuit;
	}

	public void setCircuit(String circuit) {
		this.circuit = circuit;
	}
	
	public List<Sol> getTypeSolCircuit() {
		return typeSolCircuit;
	}

	public void setTypeSolCircuit(List<Sol> typeSolCircuit) {
		this.typeSolCircuit = typeSolCircuit;
	}

}
