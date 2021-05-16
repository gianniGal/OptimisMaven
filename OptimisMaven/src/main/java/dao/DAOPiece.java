package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import metier.Piece;
import metier.FiltresTerrain.Meteo;
import metier.FiltresTerrain.Sol;
import metier.FiltresTerrain.Terrain;
import util.Context;

public class DAOPiece implements IDAO<Piece, Integer>{

	@Override
	public List<Piece> findAll() {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();

		Query myQuery = em.createQuery("SELECT p from piece p",Piece.class);
		List<Piece> piece=myQuery.getResultList();
		em.close();
		return piece;
	}

	

	public Piece findPneu(Terrain terrain, Sol sol, Meteo meteo) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();

		Query myQuery = em.createQuery("Select p from Piece p where p.libelle=:lelibelle, p.sol=:sol, p.meteo=:meteo", Piece.class);
		myQuery.setParameter("lelibelle", "pneu");
		
		
		
		
		
		Piece piece=(Piece) myQuery.getSingleResult();
		
		em.close();
		return piece;
		
	}

	
	
	@Override
	public Piece findById(Integer id) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();

		Piece piece = em.find(Piece.class, id);

		em.close();
		return piece;
	}

	@Override
	public Piece save(Piece piece) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();


		em.getTransaction().begin();
		piece = em.merge(piece);
		em.getTransaction().commit();

		em.close();
		return piece;
	}

	@Override
	public void delete(Piece piece) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();

		em.getTransaction().begin();
		piece = em.merge(piece);
		em.remove(piece);
		em.getTransaction().commit();

		em.close();
		
	}

}
