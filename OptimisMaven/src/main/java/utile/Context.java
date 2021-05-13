package utile;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.DAOClient;
import dao.DAOVehicule;


public class Context {

	private  EntityManagerFactory emf = Persistence.createEntityManagerFactory("optimiseur");

	private  DAOClient daoC = new DAOClient();
	//	private IDAO daoP = new DAOProduit();

	private static Context _instance=null; 

	private Context() {}



	public static Context get_instance() {
		if(_instance==null) {_instance=new Context();}

		return _instance;
	}

	public static void set_instance(Context _instance) {
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










}
