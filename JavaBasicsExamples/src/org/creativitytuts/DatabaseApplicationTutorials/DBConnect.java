/* 
 *  To programma ayto kanei sindesi me mia basi dedomenon tis MS Access kai emfanizei kapoies eggrafes
 *  Gia tin sindesi tha prepei na proigithei i rithmisi tou Datasource meso tou ODBC
 *  
 *  
 *  
 *  Arthra pou sxetizontai me ayto to programma
 *  
 *  Rythmisi Datasource kai ODBC me MS Access gia sindesi meso Java  
 *  http://kb.dualmind.gr/viewtopic.php?f=130&t=684&sid=1c4429ef9abd6c95d64da134f3d695b2
 *  
 *  Dynamic Class Loading
 *  http://kb.dualmind.gr/viewtopic.php?f=130&t=685&sid=1c4429ef9abd6c95d64da134f3d695b2
 */
package org.creativitytuts.DatabaseApplicationTutorials;

import java.sql.*;

public class DBConnect {

	// Connection Object help us to get a connecion to the Database
	Connection con;
	
	// Ayto to antikeimeno tha mas boithisei oste na ekteloume erotimata
	Statement st;
	
	// Me ayto to antikeimeno tha pernoume ta results ton quiries mas
	ResultSet rs;
	
	public DBConnect() {
		// Kathe fora pou dimiourgo ena antikeimeno tis klasis CreateDB thelo o constructor tis na dimiourgei ena connection me tin basi
		connect();
		
	}
	
	public void connect(){
		
		try{
			
			// this string holds the driver we need to connect to our database
			String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
			
			// We need to "Load the class of that driver" in order to use that driver
			// Dynamic Class Loading 
			Class.forName(driver);
			
			
			
			//Database Url
			String db = "jdbc:odbc:db1";
			
			//Connect to our database using our con object and the DriverManager
			con = DriverManager.getConnection(db);
			
			// -- NOW WE HAVE CONNECTION TO OUR DATABASE!! -- //
			
			
			//Object that will help us to execute our queiries 
			st = con.createStatement();
			
			// Our query
			String sql = "select * from Table1";
			
			//Result of the executed query
			rs = st.executeQuery(sql);

			
			
		}catch(Exception ex){
			
		}
		
		
		
	}
	
	public static void main(String[] args){
		
		new DBConnect();
		new Gui();
		
	}

}
