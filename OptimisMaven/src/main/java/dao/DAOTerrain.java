package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import metier.FiltresTerrain.Sol;
import metier.FiltresTerrain.Terrain;
import util.Context;

public class DAOTerrain implements IDAO<Terrain, Integer>{





//	public List<Sol> FindAllSolByIdTerrain(Terrain terrain) {
//
//		EntityManager em = Context.getInstance().getEmf().createEntityManager();
//
//		Query myQuery = em.createQuery("SELECT  distinct t from terrain t  join fetch t.terrain_sols",Terrain.class);
//		List<Sol> sols=myQuery.getResultList();
//		System.out.println(sols.size());
//		em.close();
//		return sols;





	

	@Override
	public List<Terrain> findAll() {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();

		Query myQuery = em.createQuery("SELECT t from Terrain t",Terrain.class);
		List<Terrain>terrain=myQuery.getResultList();
		em.close();
		return terrain;
	}

	@Override
	public Terrain findById(Integer id) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();

		Terrain terrain = em.find(Terrain.class, id);

		em.close();
		return terrain;
	}

	@Override
	public Terrain save(Terrain terrain) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();


		em.getTransaction().begin();
		terrain = em.merge(terrain);
		em.getTransaction().commit();

		em.close();
		return terrain;
	}

	@Override
	public void delete(Terrain terrain) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();

		em.getTransaction().begin();
		terrain = em.merge(terrain);
		em.remove(terrain);
		em.getTransaction().commit();

		em.close();

	}

}
