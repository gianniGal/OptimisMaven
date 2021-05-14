package util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.DAOClient;
import dao.DAOVehicule;
import dao.DAOPiece;
import metier.FiltresTerrain.Terrain;


public class Context {

	private  EntityManagerFactory emf = Persistence.createEntityManagerFactory("optimiseur");
	private Terrain terrainSelected ;

	private  DAOClient daoC = new DAOClient();
	private  DAOPiece daoP = new DAOPiece();
	//	private IDAO daoP = new DAOProduit();

	private static Context _instance=null; 

	private Context() {}



	public static Context getInstance() {
		if(_instance==null) {_instance=new Context();}

		return _instance;
	}

	public static void setInstance(Context _instance) {
		Context._instance = _instance;
	}




	public EntityManagerFactory getEmf() {
		return emf;
	}



	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}



	public DAOClient getDaoC() {
		return daoC;
	}



	public void setDaoC(DAOClient daoC) {
		this.daoC = daoC;
	}



	public Terrain getTerrainSelected() {
		return terrainSelected;
	}



	public void setTerrainSelected(Terrain terrainSelected) {
		this.terrainSelected = terrainSelected;
	}



	public DAOPiece getDaoP() {
		return daoP;
	}



	public void setDaoP(DAOPiece daoP) {
		this.daoP = daoP;
	}










}
