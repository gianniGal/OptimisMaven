package dao;
import java.sql.*;
public class Logverif {
	
	public static boolean logValide(Connection conn, String name,String password){
		boolean status=false;
		try{
			PreparedStatement ps=conn.prepareStatement("select * from client where username = ? and password = ?");
			ps.setString(1,name);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			
			rs.close();
			ps.close();
			conn.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}

}

