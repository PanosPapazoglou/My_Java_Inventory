package org.thenewboston.beginner.b84;

import javax.swing.JFrame;

public class main {

  public static void main(String args[ ]) {
    JFrame f = new JFrame("Title");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    DrawingGraphics d = new DrawingGraphics();
    f.add(d);
    f.setSize(400, 250);
    f.setVisible(true);
 }
  
}
