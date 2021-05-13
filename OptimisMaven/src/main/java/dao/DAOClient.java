package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import metier.Client;
import util.Context;


public class DAOClient implements IDAO<Client, Integer>
{

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
	public void delete(Client object) {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();

		em.getTransaction().begin();
		object = em.merge(object);
		em.remove(object);
		em.getTransaction().commit();

		em.close();

	}



}
