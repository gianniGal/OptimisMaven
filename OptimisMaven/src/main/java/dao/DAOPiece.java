package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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



	public Piece findTypePieceBis(String typePiece, Sol sol, Meteo meteo, Surclasser surclasser, boolean course ) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();

		//Query myQuery = em.createQuery("Select distinct p from Piece p, Sol s, Meteo m join p.sol s on where p.meteo_id=:m.id and p.sol_id=:s.id and p.libelle=:lelibelle and s.sol=:sol and m.meteo=:meteo)", Piece.class);
		//SELECT distinct piece.libelle ,sol.sol, meteo.meteo from piece, sol, meteo where ( piece.libelle="pneu" and sol.sol="sable" and meteo.meteo="sec")
		List <Piece> pieces = new ArrayList();
		pieces =  em.createQuery("from Piece p where p.libelle=:lelibelle", Piece.class).setParameter("lelibelle","pneu").getResultList();
		
		System.out.println(pieces);
		if (sol!=null) {
			System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
			pieces =  em.createQuery("Select distinct p from Piece p JOIN fetch p.sol s where s.sol=:sol", Piece.class).setParameter("sol", sol.getSol()).getResultList();
			System.out.println(pieces);
		}
		if (meteo != null) {
			pieces =  em.createQuery("Select p from Piece p, Meteo m where m.meteo=:meteo", Piece.class).setParameter("meteo", meteo.getMeteo()).getResultList();
			System.out.println(pieces);
		}
		

		if (surclasser!=null) {
			pieces =  em.createQuery("Select p from Piece p, Surclasser su where su.surclasser=:surclasser",Piece.class).setParameter("surclasser", surclasser.getsurclasser()).getResultList();
			System.out.println(pieces);
		}
		

		if (course == true) {

			pieces = em.createQuery("Select p from Piece p where course=:course",Piece.class).setParameter("course", true).getResultList();
			System.out.println(pieces);
		
		}
		if( sol == null && meteo == null && surclasser == null && course == false)
		{ 
			pieces = em.createQuery("Select p from Piece p where meteo_id=null and nombrePlaces_id = null and surclasser_id=null and sol_id=null and course=:course",Piece.class).setParameter("course", false).getResultList();
			System.out.println(pieces);
		
		}
		//MyQuery.setParameter("lelibelle", "pneu");
		//.setParameter("sol", sol.getSol())
		//.setParameter("meteo", meteo.getMeteo());

		//pieces= Myquery.getResultList();
		Piece piece = pieces.get(0);
		System.out.println(piece);
		em.close();
		return piece;

	}

	
	public Piece findTypePiece(String typePiece, Sol sol, Meteo meteo, Surclasser surclasser, boolean course ) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();

		//Query myQuery = em.createQuery("Select distinct p from Piece p, Sol s, Meteo m join p.sol s on where p.meteo_id=:m.id and p.sol_id=:s.id and p.libelle=:lelibelle and s.sol=:sol and m.meteo=:meteo)", Piece.class);
		//SELECT distinct piece.libelle ,sol.sol, meteo.meteo from piece, sol, meteo where ( piece.libelle="pneu" and sol.sol="sable" and meteo.meteo="sec")
		Piece piece=null;
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
			filtresPieces.put("surclasser", surclasser.getsurclasser());
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
		piece=(Piece) query.getSingleResult();
		}
		catch(Exception e) {}
		//pieces =  em.createQuery("from Piece p where p.libelle=:lelibelle", Piece.class).setParameter("lelibelle","pneu").getResultList();
		
		
		

	/*	if( sol == null && meteo == null && surclasser == null && course == false)
		{ 
			pieces = em.createQuery("Select p from Piece p where meteo_id=null and nombrePlaces_id = null and surclasser_id=null and sol_id=null and course=:course",Piece.class).setParameter("course", false).getResultList();
			System.out.println(pieces);
		
		}*/
		
		//MyQuery.setParameter("lelibelle", "pneu");
		//.setParameter("sol", sol.getSol())
		//.setParameter("meteo", meteo.getMeteo());

		//pieces= Myquery.getResultList();
		System.out.println(piece);
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
