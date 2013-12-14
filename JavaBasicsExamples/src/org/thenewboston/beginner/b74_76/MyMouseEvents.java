package org.thenewboston.beginner.b74_76;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyMouseEvents extends JFrame{

  private JPanel mousePanel;
  private JLabel statusBar;
  
  public static void main(String args[ ]) {
  	MyMouseEvents gui = new MyMouseEvents();
     gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     gui.setSize(350, 200);
     gui.setVisible(true);
  }
  
  MyMouseEvents() {
     super("Title: mouse actions");
     
     mousePanel = new JPanel();
     mousePanel.setBackground(Color.BLUE);
     add(mousePanel, BorderLayout.CENTER);
     
     statusBar = new JLabel("Go on - do something");
     add(statusBar, BorderLayout.SOUTH);
     
     HandlerClass handler = new HandlerClass();
     mousePanel.addMouseListener(handler);
     mousePanel.addMouseMotionListener(handler);
  }
  
  private class HandlerClass implements MouseListener, MouseMotionListener {
     public void mouseClicked(MouseEvent event) {
        statusBar.setText(String.format("Mouse clicked at %d, %d", event.getX(), event.getY()));   
     }
     
     public void mouseEntered(MouseEvent event) {
        mousePanel.setBackground(Color.RED);   
     }
     
     public void mouseExited(MouseEvent event) {
        mousePanel.setBackground(Color.BLUE);   
     }
     
     public void mousePressed(MouseEvent event) {
        statusBar.setText("You pressed the button");
     }
     
     public void mouseReleased(MouseEvent event) {
        statusBar.setText("You have released the button");   
     }
     
     public void mouseDragged(MouseEvent event) {
        statusBar.setText("You are dragging the mouse");   
     }
     
     public void mouseMoved(MouseEvent event) {
        statusBar.setText("You moved the mouse");
     }
  }
	
}
