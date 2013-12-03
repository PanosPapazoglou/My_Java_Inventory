package org.creativitytuts.JavaProgrammingTutorials;

import javax.swing.*;

import java.awt.*;


public class MyJtoolBar2 {

	JFrame f;
	JToolBar tb;
	JButton exit;
	
	public  MyJtoolBar2(){
		frame();
	}
	
	
	public void frame(){

		f = new JFrame();
		f.setSize(400,400);
		f.setTitle("ToolBar test");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		tb = new JToolBar();
		
		exit = new JButton("Exit");
		
		tb.add(exit);
		
		// An den theloume na einai dragable
		// tb.setFloatable(false);
		
		
		
		f.add(tb,BorderLayout.NORTH);
	
		
	}
	
	
	
	
	public static void main(String[] args){
		new  MyJtoolBar2();
	}
	
	
	
	
	
}
