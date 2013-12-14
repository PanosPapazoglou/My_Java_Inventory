package org.thenewboston.beginner.b84;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class DrawingGraphics extends JPanel{

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    this.setBackground(Color.WHITE);
    
    g.setColor(Color.BLUE);
    g.fillRect(10, 10, 100, 30);
    
    g.setColor(Color.RED);
    g.fillRect(10, 50, 100, 30);
    
    g.setColor(Color.BLACK);
    g.drawString("My drawing program", 10, 90);
 }
  
}
