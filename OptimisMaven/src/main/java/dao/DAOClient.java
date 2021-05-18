package dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import metier.Client;
import metier.Compte;
import metier.Piece;
import metier.configClient;
import metier.FiltresTerrain.Meteo;
import metier.FiltresTerrain.Sol;
import metier.FiltresTerrain.Surclasser;
import util.Context;


public class DAOClient implements IDAO<Client, Integer>
{



	public Client seConnecter(String login, String password) {
		Client c = null;
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Query myQuery = em.createQuery("SELECT c from Client c where c.login=:login and c.password=:password",Client.class);
		myQuery.setParameter("login", login);
		myQuery.setParameter("password",password);
	    c=(Client) myQuery.getSingleResult();
		em.close();
		return c;


	}

	@Override
	public List<Client> findAll() {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();

		Query myQuery = em.createQuery("SELECT c from Client c",Client.class);
		List<Client> clients=myQuery.getResultList();
		em.close();
		return clients;
	}

	@Override
	public Client findById(Integer id) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();

		Client client = em.find(Client.class, id);

		em.close();
		return client;
	}

	@Override
	public Client save(Client client) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();


		em.getTransaction().begin();
		client = em.merge(client);
		em.getTransaction().commit();

		em.close();
		return client;

	}



	@Override
	public void delete(Client client) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();


		em.getTransaction().begin();
		client = em.merge(client);
		em.remove(client);
		em.getTransaction().commit();

		em.close();

	}

	
	 public void saveConfig(Piece chassis, Piece moteur, Piece roue, Piece phare, Piece frein, Piece suspension) 
	    {
	        EntityManager em = Context.getInstance().getEmf().createEntityManager();

	        em.getTransaction().begin();
	        configClient conf = new configClient();
	        conf.setChassis(chassis);
	        conf.setMoteur(moteur);
	        conf.setRoue(roue);
	        conf.setPhare(phare);
	        conf.setSuspension(suspension);
	        conf.setFrein(frein);
	        conf = em.merge(conf);
	        em.getTransaction().commit();

	        em.close();
	    }
	 
		public List<Piece> findConfig(int i) {
			//QUERY NATIVE
			EntityManager em = Context.getInstance().getEmf().createEntityManager();	
			
		
			Query myQuery =	 em.createNativeQuery("SELECT lien,prix from configclient,piece where idConfig=:aaa chassis_id=id or frein_id=id or moteur_id=id or phare_id=id or roue_id=id or suspension_id=id")
					.setParameter("aaa", i);
//			Query myQuery = em.createQuery("SELECT chassis_id, frein_id, pneu_id, from configClient c JOIN fetch p.Piece where c.idConfig=:id and ",configClient.class).setParameter("id", i);
			List<Piece> config=myQuery.getResultList();
			em.close();
			return config;
			
		}


}
