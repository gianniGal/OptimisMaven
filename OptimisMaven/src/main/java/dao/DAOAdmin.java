package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import metier.Admin;
import metier.Client;
import util.Context;

public class DAOAdmin implements IDAO<Admin, Integer> {

	
	public Admin seConnecter(String login, String password) {
		Admin a = null;
		EntityManager em = Context.get_instance().getEmf().createEntityManager();
		Query myQuery = em.createQuery("SELECT a from Admin a where a.login=:login and a.password=:password",Admin.class);
		myQuery.setParameter("login", login);
		myQuery.setParameter("password",password);
		a=(Admin) myQuery.getSingleResult();
		em.close();
		return a;
	}
	
	
	
	@Override
	public List<Admin> findAll() {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();

		Query myQuery = em.createQuery("SELECT a from Admin a",Admin.class);
		List<Admin> admins=myQuery.getResultList();
		em.close();
		return admins;
	}

	@Override
	public Admin findById(Integer id) {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();

		Admin admins = em.find(Admin.class, id);

		em.close();
		return admins;
	}

	@Override
	public Admin save(Admin admins) {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();


		em.getTransaction().begin();
		admins = em.merge(admins);
		em.getTransaction().commit();

		em.close();
		return admins;
	}

	@Override
	public void delete(Admin admins) {
		EntityManager em = Context.get_instance().getEmf().createEntityManager();

		em.getTransaction().begin();
		admins = em.merge(admins);
		em.remove(admins);
		em.getTransaction().commit();

		em.close();
	}

}
