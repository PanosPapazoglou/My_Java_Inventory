package org.creativitytuts;

import javax.swing.*;
import java.awt.event.*;


public class MyActionListener {

	public MyActionListener(){
		frame();
	}
	
	
	public void frame(){
		JFrame f = new JFrame();
		f.setSize(400,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		JPanel p = new JPanel();
		
		JButton b1 = new JButton("Action Listener");
		
		// Kanoume register to component mas se ena ActionListener to opoio
		// ftiaxnoume sto ftero..(xoris alli klasi..) gia logous taxititas
		// kai mias pou den tha to xanaxrisimopoiisoume...ayton ton ActionListener
		// Apo tin stigmi pou to component b1 ginei registered ston ActionListener
		// O actionListener akouei gia opoiodipote event sxetizete me ayto to component
		b1.addActionListener(new ActionListener(){
			
			// Molis kapoio event simbei sto b1 component i parakato methodos tha ektelesti
			// i actionPerformed me parametro to event to opoio sinebei sto component mas..
			public void actionPerformed(ActionEvent e){
				// Tha emfanisoume ena minima me tin boitheia tou JOptionPane
				JOptionPane.showMessageDialog(null, "Action Listener is working!!");
				
			}
			
			
		});
		
		p.add(b1);
		f.add(p);
		
		
	}
	
	
	public static void main(String[] args){
		new MyActionListener();
		
	}
	
}
