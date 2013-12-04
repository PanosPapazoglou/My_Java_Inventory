package org.creativitytuts.DatabaseApplicationTutorials.four;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

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
	JButton ud;
	JButton del;
	
	
	
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
		f.setSize(650,400);;
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		
		//Initialize JPanel
		p = new JPanel(new GridBagLayout());
		
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
		  ud = new JButton("Update");
		 del = new JButton("Delete");
		
		 
		// Gia na kathorisoume tis sintetagmenes tou grid (noito koutaki..tou grid) kanoume xrisi tou antikeimenou "GridBagConstraints" 
		GridBagConstraints c = new GridBagConstraints();
			
		// H methodos insets toy "GridBagConstraints" kathorizei to external padding tou component sto opoio efarmozete..
		//  (top , left , Bottom , right)
		c.insets = new Insets(5,5,5,5);
			
			
		//Initialization Ends
		
		
		
		// Add them to eache other..
		
		// Add Components to the JPanel
		c.gridy = 0;
		
		c.gridx = 0;
		p.add(fname,c);
		c.gridx = 1;
		p.add(t,c);

		c.gridx = 2;
		p.add(lname,c);
		c.gridx = 3;
		p.add(t1,c);
		
		c.gridx = 4;
		p.add(age,c);
		c.gridx = 5;
		p.add(t2,c);		

		
		
		
		c.gridy = 1;
		
		c.gridx = 1;
		p.add(b4,c);
		c.gridx = 2;
		p.add(b2,c);
		c.gridx = 3;
		p.add(b1,c);
		c.gridx = 4;
		p.add(b3,c);
		
		
		c.gridy = 2;
		
		c.gridx = 2;
		p.add(ud,c);
		c.gridx = 3;
		p.add(del,c);

		
		
		
		// Add Jpanel to the JFrame
		f.add(p,BorderLayout.WEST);		
		
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
		

		
		//Add ud ActionListener
		ud.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ev){
				
				// Me tin methodo getText enos JTextField Object pairnoume to ti einai grammeno se ayto to text
				String fname = t.getText();
				String lname = t1.getText();
				String age   = t2.getText();
				
				try{
					
					//Me tin methodo ayti mporoume na kanoume update ena column sto dedomeno record pou krateite stin rs..
					rs.updateString("Fname", fname);
					rs.updateString("Lname", lname);
					rs.updateString("Age", age);
					
					//Me ayti tin entoli einai san na toy leme na metafrasei..kai ektelesi (commit) tis parapano entoles pou tou dosame.. 
					rs.updateRow();
					
					JOptionPane.showMessageDialog(null,"Record updated");
					
				}catch(Exception ex){
					
				}
				
				
			}
		});			
		
		
		
		//Add del ActionListener
		del.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ev){
				
				try{
					
					//Me ayti tin entoli diagrafoume to trexon row pou briskete sto rs
					rs.deleteRow();
					
					JOptionPane.showMessageDialog(null,"Record deleted");


				}catch(Exception ex){
					
				}
				
				
			}
		});	
		
		
		
	
	}
	
	
	

}
