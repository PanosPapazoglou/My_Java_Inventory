/*
 * Edo kanoume xrisi tou Statement antikeimenou
 * st.executeUpdate(sql);             -> Edo apothikeyoume data se ena record enos pinaka
 * 
 * se diafora me to...
 *  
 * rs.updateString("Fname", fname);   -> Edo apothikeyoume ta data se ena record gia ena sigkekrimeno column
 * 
 */

package org.creativitytuts.DatabaseApplicationTutorials.ten;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateMultipleTables {

	// Create 2 instance variables related to Database
	Connection con;
	Statement st;

	
	
	JFrame f  = new JFrame("Update Multiple Tables");
	
	JLabel l  = new JLabel("Name : ");
	JLabel l1 = new JLabel("Job : ");
	JLabel l2 = new JLabel("Car : ");
	JLabel l3 = new JLabel("Make : ");
	
	JTextField name = new JTextField(10);
	JTextField job  = new JTextField(10);
	JTextField car  = new JTextField(10);
	JTextField make = new JTextField(10);
	
	JButton b = new JButton("Update");
	
	
	public UpdateMultipleTables() {
		
		connect();
		frame();
		
	}
	
	
	public void connect(){
	
		try{

			// Fortonoume ton driver
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			
			// Database Url
			String db = "jdbc:odbc:db2";
			
			// Kanoume to connection me tin basi
			con = DriverManager.getConnection(db);
			
			// Proetimazoume to antikeimeno Statement etsi oste
			// na ploigeite stin eggrafes : ResultSet.TYPE_SCROLL_INSENSITIVE
			// na einai updatebale        : ResultSet.CONCUR_UPDATABLE
			st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			
			
			
			
			
			
			
		}catch(Exception ex){
			
		}
		
	}
	
	
	public void frame(){
		
		f.setSize(700,300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		JPanel p = new JPanel();
		
		p.add(l);
		p.add(name);
		
		p.add(l1);
		p.add(job);		
		
		p.add(l2);
		p.add(car);

		p.add(l3);
		p.add(make);		
		
		p.add(b);

		f.add(p);
		
		
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				
				try{
				
					String name1 = name.getText();
					String job1  = job.getText();
					String car1  = car.getText();
					String make1 = make.getText();

					String sql = "INSERT INTO Table1 values('"+name1+"','"+job1+"')";
					st.executeUpdate(sql);
					
					String sql1 = "INSERT INTO Table2 values('"+car1+"','"+make1+"')";
					st.executeUpdate(sql1);
					
					name.setText("");
					job.setText("");
					car.setText("");
					make.setText("");
					
					
					
				}catch(Exception ex){
					
				}
				
				
				
			}
			
		});
		
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args){
		new UpdateMultipleTables();
		
	}
	

}


