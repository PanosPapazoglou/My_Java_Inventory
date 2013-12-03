package org.creativitytuts.JavaProgrammingTutorials;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyComboBox {
	
	String[] items = {"Panos","Nikos","Petros","Spyros","Kostas","Mixalis","Takis"};
	JComboBox c = new JComboBox(items);
	JButton b 	= new JButton("Print"); 
	JLabel l	 	= new JLabel("Display Combo items");	

	
	public MyComboBox(){
		frame();
	}

	
	public void frame(){
		JFrame f = new JFrame();
		f.setSize(400, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		JPanel p = new JPanel();


		
		p.add(c);
		p.add(b);
		p.add(l);
		
		f.add(p);
		
		
		
	  // Edo kanoume register to component ston listener pou ftaixnoume sto ftero..
		b.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent ev){
				String s = c.getSelectedItem().toString();
				l.setText(s);
				
				
			}
			
			
		});
		
		
		
		
	}
	
	
	public static void main(String[] args){
		new MyComboBox();
		
	}
	
}
