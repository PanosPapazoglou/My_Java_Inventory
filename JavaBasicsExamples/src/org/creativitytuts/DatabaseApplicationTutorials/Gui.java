package org.creativitytuts.DatabaseApplicationTutorials;

import javax.swing.*;
import java.awt.*;


public class Gui extends DBConnect{
	
	//Declaring Instance Variables	
	JFrame f;
	JPanel p;
	JLabel fname;
	JLabel lname;
	JLabel age;
	JTextField t;
	JTextField t1;
	JTextField t2;
	
	
	
	public Gui() {
		// Theloume otan dimiourgeite ena neo instance tou gui kata to initialization tou antikeimenou aytou
		// opou ekteleite o constructor..na epikaleite i methodos frame();
		frame();
		
	}
	
	public void frame(){
		
		//Initialization Starts
		
		//Initialize JFrame
		f = new JFrame();
		f.setSize(600,400);;
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		
		//Initialize JPanel
		p = new JPanel();
		
		//Initialize JLabels
		fname = new JLabel("First Name");
		lname = new JLabel("Last Name");
		age   = new JLabel("Age");
		
		
		//Initialize Text Fields
		t = new JTextField(10);
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		
		//Initialization Ends
		
		
		
		// Add them to eache other..
		
		// Add Components to the JPanel
		p.add(fname);
		p.add(t);

		p.add(lname);
		p.add(t1);
		
		p.add(age);
		p.add(t2);		
		
		
		
		// Add Jpanel to the JFrame
		f.add(p);		
		
		try{
			rs.next();
			t.setText(rs.getString("Fname"));
			t1.setText(rs.getString("Lname"));
			t2.setText(rs.getString("Age"));
			
		}catch(Exception ex){
			
		}
		
	}
	
	

}
