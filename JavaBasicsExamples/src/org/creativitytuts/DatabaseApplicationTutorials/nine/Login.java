/*
 * 
 * Login Form
 * Prokeite gia ena GUI pou mas zita username kai password
 * kai elegxei stin basi na dei an ta stoixeia einai sosta bgazontas to katalilo minima
 * 
 * Epi tis ousias kanei elegxo stin basi dedomenon na dei an iparxei i oxi o xristis
 * kai bgazei to antistoixo minima se pop up parathiro.
 * An o xristis iparxei parapano apo mia fora stin basi tote emfanizeri minima dublicate
 * An iparxei mia fora kai to password tou einai sosto tote leei user found kai access granded
 * Kai an den brei to zeygos username + password tote bgazei pop up minima oti o xristis den yparxei... 
 * 
 * 
 */
package org.creativitytuts.DatabaseApplicationTutorials.nine;

import javax.swing.*;
import java.awt.event.*;

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
		
		
		
		//Register the Login Button to the ActionListener we create on the fly..
		b.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent ev){
				
				// Ton parakato kodika ton bazoume se try/catch block giati grafoume sql statements pou mporei na min mporesei na ektelestei gia diaforous logous kai na petaxei exception..
				try{
					
					// Pairnoume tis times pou kratoun ta textfields stis antistoixes string metablites pou exoume orisei
					// H trim() method tha apomakrinei ta opoia kena..
					String user = t.getText().trim();
					String pass = t1.getText().trim();
							
					// Dimiourgoume tin string anaparastasi tou sql erotimatos mas
					String sql = "SELECT * FROM Table2 WHERE user='"+user+"' and pass='"+pass+"'";
					
					
					//Execute our sql query
					// To rs einai ena antikeimeno pou krata ola ta results pou epistrefontai apo tin ektelesi tou query mas
					// To bazoume kai ayto mesa se try/catch oste na paroume tixon sfalmata pou mporei na min stamatoun to programma
					// alla mporei na iparxoun kai na kanoun to programma na min douleyei...opote...tha prepei na blepouyme ti ginete..
					try{
						rs = st.executeQuery(sql);
					}catch(Exception ex){
						System.out.println(ex);
					}
					
					
					
					// Ftiaxnoume ena metriti
					int count = 0;
					
					// While there are records on our recordset
					
					while(rs.next()){
						// increase our counter by one;
						count = count+1;
					}
					
					
					
					if(count==1){
						// An iparxei mono 1 row simainei oti iparxei kai ginete granded
						JOptionPane.showMessageDialog(null, "User Found, Access Granded!!");
						
					}else if(count > 1){
						// An uparxon parapano apo 1 row tote exoume dublicate	
						JOptionPane.showMessageDialog(null, "Dublicate User , Access Denied!!");
						
					}else{
						//An den uparxouyn katholou rows simainei oti den iparxei kanenas xristis me ayta ta stoixeia
						JOptionPane.showMessageDialog(null, "User not found!");
						
					}
					
		
							
				}catch(Exception ex){
					
				}
;
				
				
				
			}
			
		});
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		new Login();

	}

}
