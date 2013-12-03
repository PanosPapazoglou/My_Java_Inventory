package org.creativitytuts.JavaProgrammingTutorials;

import javax.swing.*;
import java.awt.*;


public class Swing2 {
	
	public static void main (String[] args){
		
		// Set the Jframe
		JFrame f = new JFrame("Title of the Window");
		f.setVisible(true);
		f.setSize(600,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Set the JPanel
		// Enas allos constructor tou JPanel poy pernei san orisma ena antikeimeno tupou GridBagLayout
		// prokeimenou na dosei stin java na katalabei oti gia tin topothetisi ton components se ayto to Panel me megaliteri akribeia
		// tha kanoume xrisi tou Grid
		JPanel p = new JPanel(new GridBagLayout()); 

		// Set the Components
		JButton b1  = new JButton("Button 1");
		JButton b2  = new JButton("Button 2");
		
		
		
		// Gia na kathorisoume tis sintetagmenes tou grid (noito koutaki..tou grid) kanoume xrisi tou antikeimenou "GridBagConstraints" 
		GridBagConstraints c = new GridBagConstraints();
		
		// H methodos insets toy "GridBagConstraints" kathorizei to external padding tou component sto opoio efarmozete..
		//  (top , left , Bottom , right)
		c.insets = new Insets(10,10,10,10);

		// Oi methodos gridx / grid y tou "GridBagConstraints" kathorizoun se pies sintentagmenes tou grid (se pio koutaki..) 
		// tha topothetithei to component sto opoio tha efarmostei se (x-axis kai y-axis)..
		
		// Arrange component to x - axis
		c.gridx = 0;
		
		// Arrange component to y - axis
		c.gridy = 1;
		
		//Tora afou exoume dilosei ta x/y axis tou component pou theloume na topothetisoume sto Panel mas...to topothetoume
		// xrisimopoiontaw mia overload methodo add tou Jpanel i opoia pleon dexete 2 orismata
		// 1o orisma -> to component mas (to button 1) se ayti tin periptosi
		// 2o orisma -> to antikemeno c typou GridBagConstraints to opoio exei mesa tou to pos theloume na ginei to arrangent 
		p.add(b1,c);
		
		
		
		// Antistoixa gia to 2o Component mas (button 2) exoume..

		// Arrange component to x - axis
		c.gridx = 0;
		// Arrange component to y - axis
		c.gridy = 2;
		
		// Exagoume to 2o component mas sto Jpanel dothentos ton arrangment xaraktiristikon pou orisame stis 2 parapano grammes gia ayto
		p.add(b2,c);
		
		
		// Telos prosthetoume to Jpanel  sto JFrame poy ftiaxame stin arxi pano pano..
		// kai malista tou dilonoume kai genikotera pou theloume na emfanizetai me to..BorderLayout.SOUTH
		// xrisimopoiontas diladi ton overloaded constructor me tis 2 parametrous.
		f.add(p,BorderLayout.WEST);
		
		
		
	}
	
	

}
