package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {
	
	public static void main (String[] args) {
		String host  = "jdbc:mysql://localhost:3306/test";
		String uName = "root";
		String uPass = "";
		try {
			Connection con = DriverManager.getConnection(host, uName, uPass);
			System.out.println("ok");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Problem ");
			e.printStackTrace();
		}
		
				
		
	}
}
