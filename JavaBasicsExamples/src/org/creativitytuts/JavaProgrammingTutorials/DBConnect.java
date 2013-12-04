package org.creativitytuts.JavaProgrammingTutorials;

import java.sql.*;


public class DBConnect {
	
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	//Constructor
	public DBConnect(){
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			// Create a Connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_dbcon","root","");
			
			// Create a Statement
			st = con.createStatement();
			
			
					
		}catch(Exception ex){
			System.out.println("Error: "+ex);
		}
	}
	
	
	//This method retrieves the records from the database and bring them up
	public void getData(){
	
		try{
			
			// We write our query
			String query = "Select * from persons";
			
			// We get the resultset from the db
			rs = st.executeQuery(query);
			
			//Print out the mesage
			System.out.println("Records from Database");
			
			// As long as rs has records...gather them and bring them out..
			while (rs.next()){
				// Column Name
				String name = rs.getString("name");
				
				// Column Age
				String age = rs.getString("age");
				
				//Print each row data
				System.out.println("Name: "+name+"    "+"Age:"+age);
				
			}
			
			
		}catch(Exception ex){
			System.out.println("Error:"+ex);
		}
		
	}
	
	public static void main(String[] args){
		DBConnect connect = new DBConnect();
		connect.getData();
	}
	
	
}
