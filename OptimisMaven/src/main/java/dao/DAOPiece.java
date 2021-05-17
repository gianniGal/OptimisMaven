package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import frame.ChoixContraintes;
import frame.ErrorChampsVide;
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
		List<Piece> pieces=myQuery.getResultList();
		em.close();
		return pieces;
	}


	public Piece findTypePieceTEST(String typePiece, Sol sol, Meteo meteo, Surclasser surclasser, boolean course ) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		List<Piece> pieces=null;
		String requete ="Select p from Piece p";

		if (sol!=null) {

			requete +=" JOIN fetch p.sol s";
		}


		if (meteo != null) {
			requete+=" JOIN fetch p.meteo m";
		}
		
		if (surclasser != null) {
			requete+=" JOIN fetch p.surclasser su";
		}

			requete+=" where p.libelle=:lelibelle" ;
		
		if (sol!=null) {

			requete +=" and s.sol=:sol";
		}

		

		if (meteo != null) {
			requete+=" and m.meteo=:meteo";
		}
		
		if (surclasser != null) {
			requete+=" and su.surclasser=:surclasser";
		}
		
		Query query = em.createQuery(requete);
		query.setParameter("lelibelle", typePiece);
		
		if (sol!=null) {

			query.setParameter("sol", sol.getSol());
		}


		if (meteo != null) {
			query.setParameter("meteo", meteo.getMeteo());
		}
		if (surclasser != null) {
			query.setParameter("surclasser", surclasser.getSurclasser());
		}
		
		
		
		try {
			pieces=(List<Piece>) query.getResultList();

			System.out.println(pieces);

		}
		catch(Exception e) {
			System.out.println(pieces);
		}

		if (pieces.isEmpty() ) {
			ChoixContraintes.main(null);
			ErrorChampsVide.main(null);		
		}

		Piece piece = pieces.get(0);
		em.close();
		return piece;





	}

	public Piece findTypePiece(String typePiece, Sol sol, Meteo meteo, Surclasser surclasser, boolean course ) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		List<Piece> pieces=null;
		Map<String,String> filtresPieces = new HashMap();
		String filtersJoin ="Select p from Piece p";
		String filtersWhere=" where p.libelle=:lelibelle";

		if (sol!=null) {
			filtresPieces.put("sol", sol.getSol());
			filtersJoin+=" JOIN fetch p.sol s";
			filtersWhere+=" and s.sol=:sol";
		}


		if (meteo != null) {
		
			filtresPieces.put("meteo",meteo.getMeteo());
			filtersJoin+=" JOIN fetch p.meteo m";
			filtersWhere+=" and m.meteo=:meteo";
		}


		if (surclasser!=null) {
		
			filtresPieces.put("surclasser", surclasser.getSurclasser());
			filtersJoin+=" JOIN fetch p.surclasser su";
			filtersWhere+=" and su.surclasser=:surclasser";
		}


		if (course == true) {
			
			filtresPieces.put("course","true");
			filtersWhere+=" and p.course=:course";


		}
		    

		Iterator<String>  it=filtresPieces.keySet().iterator();
		Query query = em.createQuery(filtersJoin+""+filtersWhere);
		query.setParameter("lelibelle", typePiece);

		while(it.hasNext())
		{
			String key=it.next();
			if(filtresPieces.get(key).equals("true")) {query.setParameter(key, true);}
			else { query.setParameter(key, filtresPieces.get(key));}
		}

		System.out.println(filtersJoin+""+filtersWhere);
		try {
			pieces=(List<Piece>) query.getResultList();

			System.out.println(pieces);

		}
		catch(Exception e) {
			System.out.println(pieces);
		}

		if (pieces.isEmpty() ) {
			ChoixContraintes.main(null);
			ErrorChampsVide.main(null);		
		}

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
