package animate;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import javax.swing.JPanel;

public class Board extends JPanel {
  
   private final int B_WIDTH = 350;
   private final int B_HEIGHT = 350;
   private final int SIDE_LEN = 150;

   /*
    * Constructor
    */
   public Board() {
       setBackground(Color.CYAN);
       setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
   }



   public void paintComponent(Graphics g) {
      
       super.paintComponent(g);
       Graphics2D g2d = (Graphics2D) g;
       g2d.setColor(Color.MAGENTA);
       Double centerx= B_WIDTH/2;
       double centery = B_HEIGHT/2;
       g2d.fillRect(0, 0, SIDE_LEN, SIDE_LEN);

       AffineTransform at = new AffineTransform();
       at.translate(centerx,centery);
       at.rotate(Math.toRadians(-22.5));
       at.translate(-SIDE_LEN/2, -SIDE_LEN/2);
       g2d.setTransform(at);
       g2d.fillRect(0,0,SIDE_LEN, SIDE_LEN);
   }
   
   

}

