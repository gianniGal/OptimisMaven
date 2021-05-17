package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import metier.Piece;
import metier.FiltresTerrain.Meteo;
import metier.FiltresTerrain.NbDePlaces;
import metier.FiltresTerrain.Sol;
import metier.FiltresTerrain.Surclasser;
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



	public Piece findTypePiece(String typePiece, Sol sol, Meteo meteo, Surclasser surclasser, boolean course ) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();

		//Query myQuery = em.createQuery("Select distinct p from Piece p, Sol s, Meteo m join p.sol s on where p.meteo_id=:m.id and p.sol_id=:s.id and p.libelle=:lelibelle and s.sol=:sol and m.meteo=:meteo)", Piece.class);
		//SELECT distinct piece.libelle ,sol.sol, meteo.meteo from piece, sol, meteo where ( piece.libelle="pneu" and sol.sol="sable" and meteo.meteo="sec")

		List <Piece> pieces =  em.createQuery("Select p from Piece p where libelle=:lelibelle").setParameter("lelibelle", typePiece).getResultList();
		   if (sol!=null) {
		
		pieces =  em.createQuery("Select p from Piece p, Sol s where s.sol=:sol").setParameter("sol", sol.getSol()).getResultList();
		}
		if (meteo != null) {
			pieces =  em.createQuery("Select p from Piece p, Meteo m where m.meteo=:meteo").setParameter("meteo", meteo.getMeteo()).getResultList();
		}
       
		 if (surclasser!=null) {
			 pieces =  em.createQuery("Select p from Piece p, Surclasser su where su.surclasser=:surclasser").setParameter("surclasser", surclasser.getsurclasser()).getResultList();
		 }
		 
		 if (course == true) {
			 
			 pieces = em.createQuery("Select p from Piece p where course=:course").setParameter("course", true).getResultList();
		 }
		 
		 
		 else { pieces = em.createQuery("Select p from Piece p where meteo_id=null and nombrePlaces_id = null and surclasser_id=null and sol_id=null and course=:course").setParameter("course", false).getResultList();}
		//MyQuery.setParameter("lelibelle", "pneu");
		//.setParameter("sol", sol.getSol())
		//.setParameter("meteo", meteo.getMeteo());

		//pieces= Myquery.getResultList();
		Piece piece = pieces.get(0);
		em.close();
		return piece;

	}
	
	public Piece findChassis(Sol sol, Meteo meteo, NbDePlaces nbplaces) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();

		//Query myQuery = em.createQuery("Select distinct p from Piece p, Sol s, Meteo m join p.sol s on where p.meteo_id=:m.id and p.sol_id=:s.id and p.libelle=:lelibelle and s.sol=:sol and m.meteo=:meteo)", Piece.class);
		//SELECT distinct piece.libelle ,sol.sol, meteo.meteo from piece, sol, meteo where ( piece.libelle="pneu" and sol.sol="sable" and meteo.meteo="sec")

		List <Piece> pieces =  em.createQuery("Select p from Piece p where libelle=:lelibelle").setParameter("lelibelle", "chassis").getResultList();
		if (sol != null) {
		pieces =  em.createQuery("Select p from Piece p, Sol s where s.sol=:sol").setParameter("sol", sol.getSol()).getResultList();
		}
		if (meteo != null) {
			pieces =  em.createQuery("Select p from Piece p, Meteo m where m.meteo=:meteo").setParameter("meteo", meteo.getMeteo()).getResultList();
		}
		if(nbplaces != null)
			pieces =  em.createQuery("Select p from Piece p, NbDePlaces n where n.nbplaces=:nombrePlaces").setParameter("nbplaces", nbplaces.getNombrePlaces()).getResultList();

		
		//MyQuery.setParameter("lelibelle", "pneu");
		//.setParameter("sol", sol.getSol())
		//.setParameter("meteo", meteo.getMeteo());

		//pieces= Myquery.getResultList();
		Piece piece = pieces.get(0);
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
