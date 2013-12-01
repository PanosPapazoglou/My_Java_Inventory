package org.creativitytuts;

import javax.swing.*;
import java.awt.*;


public class Swing {
	
	private JFrame f;
	private JPanel p;
	private JButton b1;
	private JLabel lab;
	
	// Constructor of the class
	public Swing(){
		gui();
	}
	

	public void gui(){
		
		f = new JFrame("Title of the Window");
		f.setVisible(true);
		f.setSize(600,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();
		p.setBackground(Color.YELLOW);
		
		//Add components to the above Panel..
		b1  = new JButton("Test");
		lab = new JLabel("this is test label");
		
		// Add this components to our panel..
		p.add(b1);
		p.add(lab);
		
		
		// Add our panel to the frame above
		f.add(p,BorderLayout.SOUTH);
		
		
		
	}
	
	
	public static void main (String[] args){
		
		new Swing();
		
		
	}
	

}
