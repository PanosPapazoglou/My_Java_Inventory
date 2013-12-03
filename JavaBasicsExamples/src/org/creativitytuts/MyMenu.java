package org.creativitytuts;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class MyMenu {

	JFrame f = new JFrame();
	JPanel p = new JPanel();
	
	
	public MyMenu(){
		frame();
	}
	
	public void frame(){
		f.setSize(400,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Position our frame on the middle of the screen
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		
		// To create a menu we will need 3 different objects
		// 1. MenuBar		
		// 2. Menu      (Choices on the Menu Bar like File , Edit)
		// 3. MenuItems (Inside the Menu - like the options of the File e.x. Open , Exit)
		
		
		// 1. MenuBar		
		// Create a MenuBar	"mb"
		JMenuBar mb = new JMenuBar();
		// Set our MenuBar in our JFrame
		f.setJMenuBar(mb);
		
		
		
		// 2. Menu      (Choices on the Menu Bar like File , Edit)
		// Create the Menu "File"
		JMenu file = new JMenu("File");
		// Add the menu "File" into the MenuBar "mb"
		mb.add(file);
		
		// Create the Menu "Edit"
		JMenu edit = new JMenu("File");
		// Add the menu "Edit" into the MenuBar "mb"
		mb.add(edit);

		
		
		
		// 3. MenuItems (Inside the Menu - like the options of the File e.x. Open , Exit)
		// Create the MenuItem "Open"
		JMenuItem open = new JMenuItem("Open");
		// Add the MenuItem "Open" to the Menu "File"
		file.add(open);


		// Create the MenuItem "Exit"
		JMenuItem exit = new JMenuItem("Exit");
		// Add the MenuItem "Exit" to the Menu "File"		
		file.add(exit);

		
		f.add(p);
		
		
		//Send a message when click File->Exit and exit the programm using an ActionListener
		exit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("exit");
				System.exit(0);
			}
			
			
		});		
		
		
	}
	
	
	
	
	public static void main(String[] args){
		new MyMenu();
	}
	
	
	
	
	
}
