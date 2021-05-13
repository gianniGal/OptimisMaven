package metier.FiltresTerrain;

public class Circuit extends Terrain{
	
	private String circuit;

	public Circuit(boolean course, boolean luminosite, Sol sol, TpsDeVoyage dureeVoyage, NbDePlaces nombrePlaces,
			boolean animal, boolean conflit) {
		super(course, luminosite, sol, dureeVoyage, nombrePlaces, animal, conflit);
		// TODO Auto-generated constructor stub
	}

	public String getCircuit() {
		return circuit;
	}

	public void setCircuit(String circuit) {
		this.circuit = circuit;
	}
	
	

}
