package metier;

public interface Ensemble {
	
	
	private double calculerPrix(int id,int nbPiece )
	{
		prix = getPrix(id)*nbPiece;
		return prix;
	}

}
