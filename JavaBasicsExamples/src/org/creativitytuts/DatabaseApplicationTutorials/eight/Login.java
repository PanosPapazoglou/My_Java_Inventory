package org.creativitytuts.DatabaseApplicationTutorials.eight;

import javax.swing.*;

import java.awt.Event.*;
import java.sql.*;




public class Login {
	
	// 3 Instance Variables related to Database
	Connection con;
	Statement st;
	ResultSet rs;

	// Instance Variables gia to GUI
	JFrame f = new JFrame("User Login");
	JLabel l = new JLabel("Username : ");
	JLabel l1 = new JLabel ("Password : ");
	JTextField t = new JTextField(10);
	JTextField t1 = new JTextField(10);
	JButton b = new JButton("Login");
	
	
	;
	
	
	
	
	public Login() {
		//In this method we will write all code for connection to database
		connect();
		
		//In this method we wil write all the code needed to create our JFrame / Gui..
		framne();
		
	}
	
	
	public void connect(){
		//Connect to your Database
		
		try{

			// This String will hold our driver in a string representation
			String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
			
			// Load our Driver
			Class.forName(driver);
			
			//This string contain our url to our Database ( to db1 einai to data source opos to exoume onomasei sta DataSource tou ODBC gia tin diasindei mas me tin Access Database mas)
			String db = "jdbc:odbc:db1";
			
			//Now we will Connect to our Database
			con = DriverManager.getConnection(db);
			
			// Now we will create a statement so we can access the data into the database
			st = con.createStatement();
			
			
		}catch(Exception ex){
			
		}
		
		
		
		
	}
	
	
	public void framne(){
		 
		f.setSize(600,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		JPanel p = new JPanel();
		
		// Add our components to our Jpanel
		p.add(l);
		p.add(t);
		
		p.add(l1);
		p.add(t1);
		
		p.add(b);
		
		// Add our pannel tou our frame
		f.add(p);
		
		
		
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		new Login();

	}

}
