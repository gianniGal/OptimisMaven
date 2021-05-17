package util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.DAOClient;
import dao.DAOPiece;
import dao.DAOTerrain;
import metier.FiltresTerrain.Meteo;
import metier.FiltresTerrain.NbDePlaces;
import metier.FiltresTerrain.Surclasser;
import metier.FiltresTerrain.Sol;
import metier.FiltresTerrain.Terrain;


public class Context {

	private  EntityManagerFactory emf = Persistence.createEntityManagerFactory("optimiseur");
	
	private Terrain terrainSelected ;
	private Meteo meteoSelected;
	private Sol solSelected;
	private NbDePlaces nombrePlacesSelected;
	private Surclasser surclasserSelected;
	private boolean courseSelected;

	private  DAOClient daoC = new DAOClient();
	private  DAOPiece daoP = new DAOPiece();
	private  DAOTerrain daoT = new DAOTerrain();


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






	public DAOTerrain getDaoT() {
		return daoT;
	}



	public void setDaoT(DAOTerrain daoT) {
		this.daoT = daoT;
	}



	public Sol getSolSelected() {
		return solSelected;
	}



	public void setSolSelected(Sol s) {
		this.solSelected = s;
	}



	public Meteo getMeteoSelected() {
		return meteoSelected;
	}



	public void setMeteoSelected(Meteo meteoSelected) {
		this.meteoSelected = meteoSelected;
	}

	public NbDePlaces getNombrePlacesSelected() {
		return nombrePlacesSelected;
	}



	public void setNombrePlacesSelected(NbDePlaces nombrePlacesSelected) {
		this.nombrePlacesSelected = nombrePlacesSelected;
	}



	

	public Surclasser getSurclasserSelected() {
		return surclasserSelected;
	}



	public void setSurclasserSelected(Surclasser surclasserSelected) {
		this.surclasserSelected = surclasserSelected;
	}



	public boolean isCourseSelected() {
		return courseSelected;
	}



	public void setCourseSelected(boolean courseSelected) {
		this.courseSelected = courseSelected;
	}











}
