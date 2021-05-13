package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import metier.Client;
import metier.Compte;
import util.Context;


public class DAOClient implements IDAO<Client, Integer>
{
		
	
	
	public Client seConnecter(String login, String password) {
		Client c = null;
		EntityManager em = Context.get_instance().getEmf().createEntityManager();
		Query myQuery = em.createQuery("SELECT c from Client c where c.login=login and c.password=password",Client.class);
		myQuery.setParameter("login", login);
		myQuery.setParameter("paswword",password);
		return c;
		
	
	}

	@Override
	public List<Client> findAll() {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();
		
		Query myQuery = em.createQuery("SELECT c from Client c",Client.class);
		List<Client> clients=myQuery.getResultList();
		em.close();
		return clients;
	}

	@Override
	public Client findById(Integer id) {
	EntityManager em = Context.get_instance().getEmf().createEntityManager();
		
		Client client = em.find(Client.class, id);
		
		em.close();
		return client;
	}

	@Override
	public Client save(Client client) {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();
		
		
		em.getTransaction().begin();
		client = em.merge(client);
		em.getTransaction().commit();
		
		em.close();
		return client;

	}

	@Override
	public void delete(Client client) {
EntityManager em = Context.get_instance().getEmf().createEntityManager();
		
		em.getTransaction().begin();
		client = em.merge(client);
		em.remove(client);
		em.getTransaction().commit();
		
		em.close();
		
	}
	

	
}
