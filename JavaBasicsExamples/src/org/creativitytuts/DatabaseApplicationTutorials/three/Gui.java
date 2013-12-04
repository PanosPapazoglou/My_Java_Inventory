package org.creativitytuts.DatabaseApplicationTutorials.three;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	
	
	
	public Gui() {
		// Theloume otan dimiourgeite ena neo instance tou gui kata to initialization tou antikeimenou aytou
		// opou ekteleite o constructor..na epikaleite i methodos frame();
		frame();
		
		//Epipleon epikaloumaste tin parakato methodo gia na ginoun registered ston ActionListener ta koumpia oste na douleoun
		btnAction();
		
	}
	
	public void frame(){
		
		//Initialization Starts
		
		//Initialize JFrame
		f = new JFrame();
		f.setSize(550,400);;
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
		
		//Initialize JButtons
		 b1 = new JButton("Next");
		 b2 = new JButton("Prev");
		 b3 = new JButton("Last");
		 b4 = new JButton("First");
		
		//Initialization Ends
		
		
		
		// Add them to eache other..
		
		// Add Components to the JPanel
		p.add(fname);
		p.add(t);

		p.add(lname);
		p.add(t1);
		
		p.add(age);
		p.add(t2);		

		p.add(b4);
		p.add(b2);
		p.add(b1);
		p.add(b3);

		
		
		
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
	
	// this is the method i am going to have all ActionListeners
	public void btnAction(){
		
		//Add b1 ActionListener
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ev){
				try{
					//Am uparxoun epomena results
					if(rs.next()){
						
						//An eixame integer stin basi tha bazame..getInt...
						t.setText(rs.getString("Fname"));
						t1.setText(rs.getString("Lname"));
						t2.setText(rs.getString("Age"));						
					}else{
						// Epanaferoume stin teleytaia egrafi ton deikti..
						rs.previous();
						JOptionPane.showMessageDialog(null,"No more Record");
					}
					
			}catch(Exception ex){
					
				}
				
			}
		});
		

		
		//Add b2 ActionListener
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ev){
				try{
					//Am uparxoun epomena results
					if(rs.previous()){
						
						//An eixame integer stin basi tha bazame..getInt...
						t.setText(rs.getString("Fname"));
						t1.setText(rs.getString("Lname"));
						t2.setText(rs.getString("Age"));						
					}else{
						// Epanaferoume stin teleytaia egrafi ton deikti..
						rs.next();
						JOptionPane.showMessageDialog(null,"No more Record");
					}
					
				}catch(Exception ex){
					
				}
				
			}
		});
		

		
		//Add b3 ActionListener
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ev){
				try{
					//Am uparxoun epomena results
					rs.last();
						
					//An eixame integer stin basi tha bazame..getInt...
					t.setText(rs.getString("Fname"));
					t1.setText(rs.getString("Lname"));
					t2.setText(rs.getString("Age"));						

					
				}catch(Exception ex){
					
				}
				
			}
		});		
		

		
		//Add b3 ActionListener
		b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ev){
				try{
					//Am uparxoun epomena results
					rs.first();
						
					//An eixame integer stin basi tha bazame..getInt...
					t.setText(rs.getString("Fname"));
					t1.setText(rs.getString("Lname"));
					t2.setText(rs.getString("Age"));						

					
				}catch(Exception ex){
					
				}
				
			}
		});		
		
		
	
	}
	
	
	

}
