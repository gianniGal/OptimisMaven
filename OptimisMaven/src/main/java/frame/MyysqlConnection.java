package frame;
import java.sql.*;
import javax.swing.*;

public class MyysqlConnection {
	Connection conn = null;
	
	public static Connection dbConnector()
	{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/scott","root","");
//			JOptionPane.showMessageDialog(null, "Connection established");
			return conn;
		}catch(Exception e) 
		{
			JOptionPane.showMessageDialog(null,e);
			return null;
		}
		
	}

}
