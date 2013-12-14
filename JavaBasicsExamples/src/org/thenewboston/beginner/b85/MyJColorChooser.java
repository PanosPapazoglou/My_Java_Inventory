package org.thenewboston.beginner.b85;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JColorChooser;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MyJColorChooser extends JFrame{

  private JButton button;
  private Color color = Color.WHITE;
  private JPanel panel;
  
  public static void main(String args[ ]) {
  	MyJColorChooser chooser = new MyJColorChooser();
    chooser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  
  MyJColorChooser() {
     super("imba color changer");
     
     panel = new JPanel();
     panel.setBackground(color);
     add(panel, BorderLayout.CENTER);
     
     button = new JButton("Choose the color");
     add(button, BorderLayout.SOUTH);
     button.addActionListener(
        new ActionListener() {
           public void actionPerformed(ActionEvent event) {
              color = JColorChooser.showDialog(null, "Choose the color", color);
              if(color == null)
                 color = Color.WHITE;
              panel.setBackground(color);
           }
        }
     );
     setSize(400, 150);
     setVisible(true);
  }
  
}
