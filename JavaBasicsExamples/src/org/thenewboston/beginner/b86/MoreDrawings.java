package org.thenewboston.beginner.b86;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MoreDrawings extends JPanel {

  public static void main(String args[ ]) {
    JFrame f = new JFrame("Super draws");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    MoreDrawings d = new MoreDrawings();
    f.add(d);
    f.setSize(500, 280);
    f.setVisible(true);
 }
  
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    this.setBackground(Color.WHITE);
    
    g.setColor(Color.RED);
    g.drawLine(10, 10, 100, 30);
    
    g.setColor(Color.BLUE);
    g.drawRect(10, 50, 100, 30);
    
    g.setColor(Color.ORANGE);
    g.fill3DRect(10, 90, 100, 30, true);
    
 }
  
}
