/* This programms open a frame from a menu */

package org.creativitytuts;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class OpenFrame {

	JFrame f  = new JFrame("Main Frame");
	JFrame f2 = new JFrame("Sub Frame");
	
	public OpenFrame(){
		gui();
	}
	
	
	public void gui(){
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(600,400);
		f.setLocationRelativeTo(null);
		f.setVisible(true);

		f2.setSize(300,300);
		f2.setLocationRelativeTo(null);
		
		JMenuBar mb = new JMenuBar();
		
		JMenu open = new JMenu("Open");
		mb.add(open);
		
		JMenuItem frame = new JMenuItem("Open Frame");
		open.add(frame);
		
		
		
		f.setJMenuBar(mb);
		
		
		frame.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				f2.setVisible(true); 
				
				// An theloume na kripsoume to kirios parathiro tha prepei na kanoume to exis
				f.dispose();
				// Kai ara tha prepei na dinete i dinatotita sto programma na kleinei otan kleinoume to subframe..
				f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			}
			
		});

	}
	
	
	
	public static void main(String[] args){
		new OpenFrame();
	}
	
	
}
