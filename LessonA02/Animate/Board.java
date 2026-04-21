
package Animate;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import javax.swing.JPanel;

public class Board extends JPanel {
  
   private final int B_WIDTH = 350;
   private Image myImage;
   private final int B_HEIGHT = 350;
   private final int SIDE_LEN = 150;
   

   /*
    * Constructor
    */
   public Board() {
    
       setBackground(Color.CYAN);
       setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
       ImageIcon icon = new ImageIcon("ramen.jpg");
       myImage = icon.getImage();

       
   }



   public void paintComponent(Graphics g) {

      
super.paintComponent(g);
Graphics2D g2d = (Graphics2D) g;
int imgWidth  = B_WIDTH / 2;
int imgHeight = B_HEIGHT / 2;
double xT = B_WIDTH - imgWidth;
double yT = B_HEIGHT - imgHeight;
AffineTransform at = new AffineTransform();
at.translate(xT, yT);
at.scale((double) imgWidth  / myImage.getWidth(null), // used internet for help on this line and next two lines of code 
         (double) imgHeight / myImage.getHeight(null));
g2d.drawImage(myImage, at, null);
   }
   
   

}

