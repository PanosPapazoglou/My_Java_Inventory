package org.thenewboston.intermediate.i20;

import java.awt.*;
import javax.swing.*;

public class IntroductionToApplets extends JApplet {

  public void paint(Graphics g) {
    super.paint(g);
    g.drawString("wow this actually worked", 25, 25);
  }
  
}
