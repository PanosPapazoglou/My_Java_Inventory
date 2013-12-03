package org.creativitytuts.JavaProgrammingTutorials;

import java.awt.BorderLayout;

import javax.swing.*;

public class MyJtoolBar extends JFrame {

	JToolBar tb;
	JButton exit;
	
	
	public MyJtoolBar() {
		
		setSize(400,400);
		setTitle("ToolBar test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		tb = new JToolBar();
		exit = new JButton("Exit");
		
		tb.add(exit);
		
		// An den theloume na einai dragable
		// tb.setFloatable(false);
		
		
		
		add(tb,BorderLayout.NORTH);
		
		
	}
	
	public static void main(String[] args) {
		MyJtoolBar t = new MyJtoolBar();
		t.setVisible(true);

	}

}
