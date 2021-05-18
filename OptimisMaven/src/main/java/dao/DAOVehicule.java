package dao;

import java.sql.*;
import java.util.*;

import metier.*;
import metier.FiltresTerrain.Terrain;

public class DAOVehicule implements IDAO<Terrain, Integer>
{



	public List<Piece> optimizedcar(Terrain t) {
		List<Piece> piecesOpti = new ArrayList();
		Piece piece = null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/optimiseur", "root", "");
			System.out.println("connecté");
//			PreparedStatement ps = conn.prepareStatement("SELECT * FROM piece where terrain = ? and course = ? and luminosite = ? and sol = ? = tempsvoyage=? and nombreplaces = ? = animaux = ? and conflit = ? ");
			PreparedStatement ps = conn.prepareStatement("SELECT libelle,prix FROM piece WHERE  course = ? and luminosite = ? and  animaux = ? and conflit = ? ");
//			ps.setString(1, getClass().getSimpleName());
			ps.setBoolean(1, t.isCourse());
			ps.setBoolean(2, t.isLuminosite());
//			ps.setObject(4, t.getSol());
//			ps.setObject(5, t.getDureeVoyage());
//			ps.setObject(6, t.getNombrePlaces());
			ps.setBoolean(3, t.isAnimal());
			ps.setBoolean(4, t.isConflit());
	
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) 
			{
				
				piece = new Piece (rs.getString("libelle"),rs.getDouble("prix"));
				piecesOpti.add(piece);
			}

			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return piecesOpti;
	}//NE DEVRAIT PAS RENVOYER LOGIN ET MDP
	





	@Override
	public Terrain insert(Terrain object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Terrain update(Terrain object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Terrain object) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public List<Terrain> findAll() {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public Terrain findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}






	@Override
	public Terrain save(Terrain object) {
		// TODO Auto-generated method stub
		return null;
	}
}
