package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Test {


	public static void testSelectAll() 
	{	
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/scott","root","");
			PreparedStatement ps = conn.prepareStatement("SELECT * from dept");

			ResultSet rs = ps.executeQuery();

			while(rs.next()) 
			{
				System.out.println(rs.getInt("deptno"));
				System.out.println(rs.getString("dname"));
				System.out.println(rs.getString("loc"));
				
				System.out.println("");
			}
			
			rs.close();
			ps.close();
			conn.close();

		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}

	}

	public static void testSelectByLoNotSecurec(String login,String password) 
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/scott","root","");
			PreparedStatement ps = conn.prepareStatement("SELECT * from dept where dname='"+login+"' and loc='"+password+"'");
			System.out.println("SELECT * from dept where dname='"+login+"' and loc='"+password+"'");
			ResultSet rs = ps.executeQuery();

			while(rs.next()) 
			{
				System.out.println(rs.getInt("deptno"));
				System.out.println(rs.getString("dname"));
				System.out.println(rs.getString("loc"));
				
				System.out.println("");
			}

			rs.close();
			ps.close();
			conn.close();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}

	}
	
	public static void testSelectByLoSecurec(String login,String password) 
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/scott","root","");
			PreparedStatement ps = conn.prepareStatement("SELECT * from dept where dname = ? and loc like ?");
			
			ps.setString(1, login);
			ps.setString(2, "%"+password+"%");
			ResultSet rs = ps.executeQuery();

			while(rs.next()) 
			{
				System.out.println(rs.getInt("deptno"));
				System.out.println(rs.getString("dname"));
				System.out.println(rs.getString("loc"));
				
				System.out.println("");
			}

			rs.close();
			ps.close();
			conn.close();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}

	}

	
	public static void insertDept(int deptno,String dname,String loc) 
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/scott","root","");
			PreparedStatement ps = conn.prepareStatement("INSERT INTO dept VALUES(?,?,?)");
			
			ps.setInt(1, deptno);
			ps.setString(2,dname);
			ps.setString(3,loc);
			ps.executeUpdate();

			
			ps.close();
			conn.close();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}

	}



	public static void testSelectById(int id) 
	{


		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/scott","root","");
			PreparedStatement ps = conn.prepareStatement("SELECT * from dept where deptno = ?");
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			while(rs.next()) 
			{
				System.out.println(rs.getInt("deptno"));
				System.out.println(rs.getString("dname"));
				System.out.println(rs.getString("loc"));
			}

			rs.close();
			ps.close();
			conn.close();

		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}

	}


	public static void main(String[] args) {
//		testSelectById(30);
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir dname");
		String login=sc.nextLine();
		String password=sc.nextLine();
		testSelectByLoNotSecurec( login, password) ;
		
//	 insertDept(110, "JAVA", "Toulouse");
//		testSelectByLoSecurec()
//	 testSelectAll();



	}

}
