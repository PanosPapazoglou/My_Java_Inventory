/* In Java an Adapter is a class that already has implement the methods of the interface with an empty method body  
 * edo gia to mouse..gia na min ilopoiisome opos se proigomeno example..kai tis 5 methodous tou..
 * kanoume import to MouseAdapter kai kanoume extend ton listener mas me to MouseAdapter antikeimeno..
 * */
package org.thenewboston.beginner.b77;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class MyAdapter extends JFrame{
  private JLabel statusBar;
  private String details = "Go on - do something!";
  
  public static void main(String args[ ]) {
  	MyAdapter gui = new MyAdapter();
     gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     gui.setSize(350, 200);
     gui.setVisible(true);
  }
  
  MyAdapter() {
     super("imba listener");
     
     statusBar = new JLabel(details);
     add(statusBar, BorderLayout.SOUTH);
     addMouseListener(new MouseHandler());
  }
  
  private class MouseHandler extends MouseAdapter {
     public void mouseClicked(MouseEvent event) {
        details = String.format("You clicked %d times ", event.getClickCount());
        
        if(event.isMetaDown())
           statusBar.setText(details + "with right mouse button.");
        else if(event.isAltDown())
           statusBar.setText(details + "with middle mouse button.");
        else
           statusBar.setText(details += "with left mouse button.");
     }
  }
}
