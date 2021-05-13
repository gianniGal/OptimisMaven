package dao;

import java.sql.*;
import java.util.*;

import javax.persistence.EntityManager;

import metier.*;
import util.Context;


public class DAOClient implements IDAO<Client, Integer>
{

	@Override
	public List<Client> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client findById(Integer id) {
		
		return null;
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
		// TODO Auto-generated method stub
		
	}
	

	
}
