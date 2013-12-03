package org.creativitytuts.JavaProgrammingTutorials;

import javax.swing.JOptionPane;

public class Input {

		public static void main(String[] args){
			String a;
			a = JOptionPane.showInputDialog("Please enter your name!");
			JOptionPane.showMessageDialog(null, "Hello "+a);
		}
}
